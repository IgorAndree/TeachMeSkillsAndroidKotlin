package com.example.teachmeskillsandroidkotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.my_button)
        myButton.setTextColor(Color.BLACK)

        val res = getResources()

        val id = res.getIdentifier("my_button_bg", "drawable", getPackageName())
        myButton.setBackgroundResource(id)

        val buttonGoToSecondActivity = findViewById<Button>(R.id.button_go_to_second_activity)
        buttonGoToSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
