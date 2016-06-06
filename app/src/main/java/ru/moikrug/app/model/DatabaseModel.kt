package ru.moikrug.app.model

import com.pushtorefresh.storio.sqlite.annotations.StorIOSQLiteColumn
import com.pushtorefresh.storio.sqlite.annotations.StorIOSQLiteType
import ru.moikrug.app.database.*

/**
 * Created by oleg on 05.06.2016.
 */
@StorIOSQLiteType(table = JobTableMeta.TABLE_NAME)
data class Job(
        @StorIOSQLiteColumn(name = JobTableMeta._ID, key = true) val id: Long,
        @StorIOSQLiteColumn(name = JobTableMeta.CATEGORY) val category: Long,
        @StorIOSQLiteColumn(name = JobTableMeta.TITLE) val title: String,
        @StorIOSQLiteColumn(name = JobTableMeta.DESCRIPTION) val description: String,
        @StorIOSQLiteColumn(name = JobTableMeta.IMAGE) val image: String,
        @StorIOSQLiteColumn(name = JobTableMeta.URL) val url: String,
        @StorIOSQLiteColumn(name = JobTableMeta.PUB_DATE) val pub_date: String,
        @StorIOSQLiteColumn(name = JobTableMeta.SKILLS) val skills: String,
        @StorIOSQLiteColumn(name = JobTableMeta.SALARY) val salary: String,
        @StorIOSQLiteColumn(name = JobTableMeta.REMOTE) val remote: Boolean
)

@StorIOSQLiteType(table = CategoryTableMeta.TABLE_NAME)
data class Category(
        @StorIOSQLiteColumn(name = CategoryTableMeta._ID, key = true) val id: Long,
        @StorIOSQLiteColumn(name = CategoryTableMeta.TITLE) val title: String
)

@StorIOSQLiteType(table = EmploymentTypeTableMeta.TABLE_NAME)
data class EmploymentType(
        @StorIOSQLiteColumn(name = EmploymentTypeTableMeta._ID, key = true) val id: Long,
        @StorIOSQLiteColumn(name = EmploymentTypeTableMeta.TITLE) val title: String
)