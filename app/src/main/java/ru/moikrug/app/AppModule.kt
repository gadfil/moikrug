package ru.moikrug.app

import android.content.Context
import dagger.Module

/**
 * Created by oleg on 05.06.2016.
 */
@Module
class AppModule(app: App) {
    val app: App = app

    fun provideContext(): Context {
        return app
    }

}