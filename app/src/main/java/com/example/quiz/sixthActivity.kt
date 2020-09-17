package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sixth.*

var result3 = 0
private const val TAG ="Fifth Activity"

class sixthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        Log.i(TAG, "onCreate() was called")

        imageView6.visibility = View.INVISIBLE

        radioGroup2.setOnCheckedChangeListener { compoundButton, b ->
            if(radioButton.isChecked){
                result3 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(radioButton2.isChecked){
                result3 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(radioButton3.isChecked){
                result3 = 10
                imageView6.visibility = View.VISIBLE
                Toast.makeText(this, "Correct Answer. You get 10 points", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(radioButton4.isChecked){
                result3 = 0
                Toast.makeText(this, "Incorrect Answer. You get 0 points", Toast.LENGTH_SHORT).show()
            }else{

            }
            buttonNext.setOnClickListener {
                val intent = Intent(this, seventhActivity()::class.java)
                val intent1 = getIntent()
                var name = intent1.getStringExtra("Name")
                var result1 = intent1.getIntExtra("Result1", 0)
                var result2 = intent1.getIntExtra("Result2", 0)

                intent.putExtra("Name", name)
                intent.putExtra("Result1", result1)
                intent.putExtra("Result2",result2)
                intent.putExtra("Result3", result3)
                startActivity(intent)
            }
            prevBtn.setOnClickListener {
                val intent2 = Intent(this, fourthActivity()::class.java)
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
