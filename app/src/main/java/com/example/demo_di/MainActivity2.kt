package com.example.demo_di

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.demo_di.model.User

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val data: User = intent.getSerializableExtra("data") as User
        findViewById<TextView>(R.id.detail).setText(data.toString().replace(",", "\n - "))
    }
}