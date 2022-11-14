package com.necatisen.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.necatisen.kotlinintent.databinding.ActivityMainBinding
import com.necatisen.kotlinintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //getIntent
        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")

        binding.userNameTextNextActivity.text = "Username :" + username
        binding.NameTextNextActivity.text = "Name :" + name

    }
}