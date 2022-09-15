package com.example.loginlocaldp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.sql.SQLData

val DATABASE_NAME = "MyDB"
val TABLE_NAME="User"
val COL_NAME="Namee"
val COL_AGE="Age"

val COLID="Id"

class DataBaseHandler (context : Context) : SQLiteOpenHelper(context, DATABASE_NAME,null,1){
    override fun onCreate(p0: SQLiteDatabase?) {
    val createTable="CREATE TABLE "+TABLE_NAME+"("


    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}

