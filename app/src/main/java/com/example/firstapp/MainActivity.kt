package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToSecondaryActivityButton = findViewById<AppCompatButton>(R.id.toSecondaryActivityButton);
        goToSecondaryActivityButton.setOnClickListener {
            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent);
        }
    }


}