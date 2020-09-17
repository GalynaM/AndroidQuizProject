package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fourth.*

var res2 = 0
private const val TAG ="Fourth Activity"

class fourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        Log.i(TAG, "onCreate() was called")


        imageView5.visibility = View.INVISIBLE

        radGroup.setOnCheckedChangeListener { compounButton, b ->
            if(rad1.isChecked){
                res2 = 0
                Toast.makeText(this, "The answer is incorect. Your score is 0", Toast.LENGTH_SHORT).show()

            }else{

            }
            if(rad2.isChecked){
                res2 = 10
                imageView5.visibility = View.VISIBLE
                Toast.makeText(this, "Correct answer. Your score is 10", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(rad3.isChecked){
                res2 = 0
                Toast.makeText(this, "The answer is incorect. Your score is 0", Toast.LENGTH_SHORT).show()
            }else{

            }
            if(rad4.isChecked){
                res2 = 0
                Toast.makeText(this, "The answer is incorect. Your score is 0", Toast.LENGTH_SHORT).show()
            }else{

            }
            Nextbtn.setOnClickListener {
                val intent = Intent(this, sixthActivity()::class.java)
                val intent1 = getIntent()
                var name = intent1.getStringExtra("Name")
                var result = intent1.getIntExtra("Result1", 0)

                intent.putExtra("Name", name)
                intent.putExtra("Result1", result)
                intent.putExtra("Result2",res2)
                startActivity(intent)
            }
            btnPrev.setOnClickListener {
                val intent2 = Intent(this, secondActivity()::class.java)
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
