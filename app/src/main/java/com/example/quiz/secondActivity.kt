package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

private const val TAG = "Second Activity"

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i(TAG, "onCreate() was called")

        val intent = getIntent()
        val name = intent.getStringExtra("Name")
        textView.text = "Welcome " + name + " To Our Quiz " + "\nAbout Canada."
        textView2.text = "Each correct answer" + "\n" + "is worth 10 points."+ "\n"+ "Your point you will see" +"\n" + "at the end of quiz."

        btnStart.setOnClickListener {
            val intent = Intent(this, thirdActivity()::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
        }
    }


    fun onClose(view: View) {
        finish()
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
