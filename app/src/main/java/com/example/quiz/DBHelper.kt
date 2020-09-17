package com.example.quiz

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context): SQLiteOpenHelper(context, dbname, factory, version){

    companion object {
        val dbname = "userDB"
        val factory = null
        val version = 1

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE = ("CREATE TABLE USER(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, PASSWORD TEXT)")

        db?.execSQL(CREATE_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    fun insertUserData(name:String, password:String){
        val db: SQLiteDatabase = writableDatabase
        val values: ContentValues = ContentValues()
        values.put("NAME", name)
        values.put("PASSWORD", password)
        db.insert("USER", null, values)
        db.close()

    }
    fun userPresent(name: String, password: String): Boolean{

        val db = this.writableDatabase
        val query = "SELECT * FROM USER WHERE NAME='$name' AND PASSWORD='$password'"
        // return db.rawQuery("SELECT * FROM USERS WHERE NAME='$name' AND PASSWORD='$password'", null)

        val cursor = db.rawQuery(query, null)
        if(cursor.count<=0){
            cursor.close()
            return false
        }
        cursor.close()
        return true


    }


}

