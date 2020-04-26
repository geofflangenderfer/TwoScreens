package com.example.twoscreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessageToSecond(view: View) {
        val textToSend = findViewById<EditText>(R.id.editText_main).text.toString()
        Log.d("textToSend", textToSend)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("Message", textToSend)
        startActivity(intent)
    }
}