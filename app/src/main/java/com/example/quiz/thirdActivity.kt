package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*
var result1 = 0
private const val TAG = "Third Activity"

class thirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Log.i(TAG, "onCreate() was called")

        imageView4.visibility = View.INVISIBLE

        radioGroup.setOnCheckedChangeListener{compoundButton, b ->
            if(rad1.isChecked){

                result1 = 10

                imageView4.visibility = View.VISIBLE

                Toast.makeText(this, "Correct Answer. You get 10 points.", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(rad2.isChecked){
                result1 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()

            }else{

            }
            if(rad3.isChecked){
                result1 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()

            }else{

            }
            if(rad4.isChecked){
                result1 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()

            }else{

            }
            btnNext.setOnClickListener {
                val intent = Intent(this, fourthActivity()::class.java)
                val intent1 = getIntent()
                var name = intent1.getStringExtra("Name")

                intent.putExtra("Result1", result1)
                intent.putExtra("Name", name)
                startActivity(intent)
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
