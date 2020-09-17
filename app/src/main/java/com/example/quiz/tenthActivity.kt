package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_tenth.*
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader
import java.lang.StringBuilder


 private const val TAG = "Tenth Activity"

class tenthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenth)

        Log.i(TAG, "onCreate() was called")

        val filename = "score.txt"

        var fileInputStream: FileInputStream? = null
        fileInputStream = openFileInput(filename)

        var inputStreamReader = InputStreamReader(fileInputStream)
        val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
        val stringBuilder: StringBuilder = StringBuilder()
        var text: String? = null

        while ({ text = bufferedReader.readLine(); text }() != null) {
            stringBuilder.append(text + "\n")


        }
       output.setText((stringBuilder.toString()))
        btnClose.setOnClickListener {
            val intent = Intent(this, MainActivity()::class.java)
            startActivity(intent)
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
