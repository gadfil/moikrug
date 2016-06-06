package ru.moikrug.app

import android.content.Context
import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication
import com.squareup.leakcanary.LeakCanary
import com.squareup.leakcanary.RefWatcher
import timber.log.Timber

/**
 * Created by oleg on 04.06.2016.
 */

class App : MultiDexApplication(){
    @Volatile lateinit var appComponent:AppComponent

    lateinit var refWatcher: RefWatcher

    override fun onCreate() {
        super.onCreate()
        refWatcher = LeakCanary.install(this)
        Timber.plant( Timber.DebugTree())
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    fun refWatcher():RefWatcher{
        return refWatcher
    }

}