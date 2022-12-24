package com.geektech.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.geektech.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
    }


    fun onClickListener(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("email", binding.emailEt.text.toString())
        intent.putExtra("user", binding.userEt.text.toString())
        startActivity(intent)
    }
}
