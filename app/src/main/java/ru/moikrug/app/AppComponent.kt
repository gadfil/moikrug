package ru.moikrug.app

import com.pushtorefresh.storio.sqlite.StorIOSQLite
import dagger.Component
import javax.inject.Singleton

/**
 * Created by oleg on 05.06.2016.
 */
@Singleton
@Component(
        modules = arrayOf(
            AppModule::class
//            DbModule.class
        )
)
interface  AppComponent{
    fun inject(activity:MainActivity)
    fun storIOSQLite(): StorIOSQLite
}