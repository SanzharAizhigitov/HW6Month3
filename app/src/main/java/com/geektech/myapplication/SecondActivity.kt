package com.geektech.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.geektech.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var user: String
    lateinit var email: String
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        binding.root

    }



    fun onClickListener(view: View) {
        user = intent.getStringExtra("user").toString()
        email = intent.getStringExtra("email").toString()
        binding.username.text = user
        binding.email.text = email
    }
}