package ru.moikrug.app.database

/**
 * Created by oleg on 05.06.2016.
 */
object JobTableMeta {
   const  val TABLE_NAME = "job"
   const val _ID = "_id"
   const val CATEGORY = "category_id"
   const val EMPLOYMENT_TYPE = "employment_type_id"
   const val TITLE = "title"
   const val DESCRIPTION = "description"
   const val IMAGE = "image"
   const val URL = "url"
   const val PUB_DATE = "pub_date"
   const val COMPANY = "company"
   const val LOCATION = "location"
   const val SKILLS = "skills"
   const val SALARY  = "salary"
   const val REMOTE  = "remote"

}
object EmploymentTypeTableMeta {
   const val TABLE_NAME = "employment_type"
   const val _ID = "_id"
   const val TITLE = "title"
}

object CountryMeta{

}

object CategoryTableMeta {
   const val TABLE_NAME = "category"
   const val _ID = "_id"
   const val TITLE = "title"
   const val CREATE_TABLE_QUERY = "CREATE TABLE $TABLE_NAME ( $_ID	INTEGER PRIMARY KEY AUTOINCREMENT, $TITLE	TEXT);"

}
