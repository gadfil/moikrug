package ru.moikrug.app.database

import com.pushtorefresh.storio.sqlite.SQLiteTypeMapping
import com.pushtorefresh.storio.sqlite.StorIOSQLite
import com.pushtorefresh.storio.sqlite.impl.DefaultStorIOSQLite
import dagger.Module
import dagger.Provides
import ru.moikrug.app.model.Category
import javax.inject.Singleton

/**
 * Created by oleg on 05.06.2016.
 */
@Module
class DatabaseModule{
    @Provides
    @Singleton
    fun provideStorIOSQLite(databaseHelper:DatabaseHelper): StorIOSQLite {
        return DefaultStorIOSQLite.builder()
        .sqliteOpenHelper(databaseHelper)
        .addTypeMapping(Category::class.java, CategorySQLiteTypeMapping())
        .build()
    }
}