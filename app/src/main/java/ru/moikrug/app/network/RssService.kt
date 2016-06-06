package ru.moikrug.app.network

import retrofit2.http.GET
import retrofit2.http.Query
import ru.moikrug.app.model.Rss
import rx.Observable

/**
 * Created by oleg on 04.06.2016.
 */

interface RssService{
    @GET("rss" )
    fun gerFeed(@Query("page") page: Int = 1 ): Observable<Rss>
}