package com.example.teachmeskillsandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewSecondActivity = findViewById<TextView>(R.id.text_view_second_activity)
        textViewSecondActivity.text = "Вот и второй активити!"
    }
}
