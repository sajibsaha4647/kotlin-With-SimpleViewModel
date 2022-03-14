package com.example.kotlinviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {



    lateinit var Number :TextView
    lateinit var button:Button
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        Number = findViewById(R.id.number)
        button = findViewById(R.id.clickid)

        button.setOnClickListener {
            mainViewModel.click()
            Number.setText(mainViewModel.count.toString())
        }
    }


}