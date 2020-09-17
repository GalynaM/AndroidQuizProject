package com.example.quiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ninth.*
import java.io.FileNotFoundException
import java.io.FileOutputStream

private const val TAG = "Ninth Activity"

class ninthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninth)

        Log.i(TAG, "onCreate() was called")

        val intent = getIntent()

        val name = intent.getStringExtra("Name")
        val result1 = intent.getIntExtra("Result1", 0)
        val result2 = intent.getIntExtra("Result2", 0)
        val result3 = intent.getIntExtra("Result3", 0)
        val result4 = intent.getIntExtra("Result4", 0)
        val result5 = intent.getIntExtra("Result5", 0)

        val total = result1 + result2 + result3 + result4 + result5
        textView17.text="\n\nThank you. You finished the quiz."

        outputTv.text = name + " - "+ total +"\n__________________________"



        btnYes.setOnClickListener {
            val file = "score.txt"
            val data = outputTv.text.toString() + "\n"
            val fileOtputStrem: FileOutputStream
            try {

                fileOtputStrem = openFileOutput(file, Context.MODE_PRIVATE or Context.MODE_APPEND)
                fileOtputStrem.write(data.toByteArray())
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            } catch (e: Exception) {
                e.printStackTrace()
            }


            val intent1 = Intent(this, tenthActivity()::class.java)
            startActivity(intent1)

        }
        btnNo.setOnClickListener {
            val intent2 = Intent(this, MainActivity()::class.java)
            startActivity(intent2)
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
