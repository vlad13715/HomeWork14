package com.example.homework14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private var tvInfo: TextView? = null
    private var btnFirstScreen: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvInfo = findViewById(R.id.tvInfo)
        btnFirstScreen = findViewById(R.id.btnFirstScreen)


        setOnClickListeners()

        tvInfo?.text = intent.getStringExtra("INFO")
    }

    private fun setOnClickListeners() {
        btnFirstScreen?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}