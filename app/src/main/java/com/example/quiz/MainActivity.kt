package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "Main Activity"


class MainActivity : AppCompatActivity() {

    lateinit var handler: DBHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "OnCreate() was called")

        handler = DBHelper(this)

        btnRegister.setOnClickListener {
            val intent1 = Intent(this, registrationActivity::class.java)
            startActivity(intent1)
        }
        btnLogin.setOnClickListener {
            val name = editName.text.toString()
            val password = editPassword.text.toString()
            if(handler.userPresent(name,password)){
                Toast.makeText(this, "Login Success", Toast.LENGTH_LONG).show()

                val intent = Intent(this, secondActivity::class.java)
                intent.putExtra("Name", name)
                startActivity(intent)
            }else{
                Toast.makeText(this, "There is no user with this username and password. Please, register first.", Toast.LENGTH_LONG).show()
            }
        }

    }
    override fun onPause() {
        super.onPause();
        Log.i(com.example.quiz.TAG, "onPause() was called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(com.example.quiz.TAG, "onStop() was called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(com.example.quiz.TAG, "onResume() was called")
    }
}
