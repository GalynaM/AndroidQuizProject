package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registration.*

class registrationActivity : AppCompatActivity() {

    lateinit var handler : DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        handler = DBHelper(this)
        btnSubmit.setOnClickListener {
            val name = name.text.toString()
            val password = password.text.toString()
            handler.insertUserData(name, password)
             val intent = Intent(this, secondActivity()::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
        }
    }
}
