package ru.moikrug.app.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by oleg on 05.06.2016.
 */
class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "moikrug.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CategoryTableMeta.CREATE_TABLE_QUERY)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }


}