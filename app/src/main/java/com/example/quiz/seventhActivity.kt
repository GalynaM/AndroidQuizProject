package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_seventh.*

var result4 = 0
private const val TAG="Sixth Activity"

class seventhActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh)

        Log.i(TAG, "onCreate() was called")

        imageView7.visibility = View.INVISIBLE

        radGroup4.setOnCheckedChangeListener { compoundButton, b ->
            if(radBut1.isChecked){
                result4 = 10
                imageView7.visibility = View.VISIBLE
                Toast.makeText(this, "Correct Answer. You get 10 points.", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(radBut2.isChecked){
                result4 = 0
                Toast.makeText(this, "Incorect Answer. You get 0 points.", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(radBut3.isChecked){
                result4 = 0
                Toast.makeText(this, "Incorect Answer. You get 0 points.", Toast.LENGTH_SHORT).show()
            }
            if(radBut4.isChecked){
                result4 = 0
                Toast.makeText(this, "Incorect Answer. You get 0 points.", Toast.LENGTH_SHORT).show()

            }else{

            }
            btn2.setOnClickListener {
                val intent = Intent(this, eightActivity()::class.java)
                val intent1 = getIntent()
                var name = intent1.getStringExtra("Name")
                var result1 = intent1.getIntExtra("Result1", 0)
                var result2 = intent1.getIntExtra("Result2", 0)
                val result3 = intent1.getIntExtra("Result3", 0 )

                intent.putExtra("Name", name)
                intent.putExtra("Result1", result1)
                intent.putExtra("Result2",result2)
                intent.putExtra("Result3", result3)
                intent.putExtra("Result4", result4)
                startActivity(intent)
            }
            btn1.setOnClickListener {
                val intent2 = Intent(this, sixthActivity()::class.java)
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
