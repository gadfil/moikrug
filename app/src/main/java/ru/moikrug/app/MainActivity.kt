package ru.moikrug.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import retrofit2.Retrofit
import ru.moikrug.app.network.RssService

class MainActivity : AppCompatActivity() {
    val rssService : RssService;
    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://moikrug.ru/vacancies/")
                .build()
        rssService = retrofit.create(RssService::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        rssService.gerFeed()
//        .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe({
//                    data ->
//                    print(message = "success:${data.channel.item.get(0).title}")
//                    print(message = "success:${data.channel.item.size}")
//                },{ e ->
//                    print(message = "error:${e.message}")
//                })

    }
}
