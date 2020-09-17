package com.example.quiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_eight.*
import java.io.FileNotFoundException
import java.io.FileOutputStream

var result5 = 0
private const val TAG="Seventh Activity"

class eightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)

        Log.i(TAG, "onCreate() was called")

        imageView8.visibility = View.INVISIBLE

        radGroup5.setOnCheckedChangeListener { compoundButton, b ->
            if(radButton1.isChecked){
                result5 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()

            }else{

            }
            if(radButton2.isChecked){
                result5 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(radButton3.isChecked){
                result5 = 10
                imageView8.visibility = View.VISIBLE
                Toast.makeText(this, "Correct Answer. You get 10 points", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(radButton4.isChecked){
                result5 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()

            }else{

            }
            btnScore.setOnClickListener {
                val intent = Intent(this, ninthActivity()::class.java)
                val intent1 = getIntent()
                var name = intent1.getStringExtra("Name")
                var result1 = intent1.getIntExtra("Result1", 0)
                var result2 = intent1.getIntExtra("Result2", 0)
                val result3 = intent1.getIntExtra("Result3", 0 )
                var result4 = intent1.getIntExtra("Result4" , 0)

                intent.putExtra("Name", name)
                intent.putExtra("Result1", result1)
                intent.putExtra("Result2",result2)
                intent.putExtra("Result3", result3)
                intent.putExtra("Result4", result4)
                intent.putExtra("Result5", result5)
                startActivity(intent)
            }
            btnP.setOnClickListener {
                val intent2 = Intent(this, seventhActivity()::class.java)
                startActivity(intent2)
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
