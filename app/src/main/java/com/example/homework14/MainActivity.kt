package com.example.homework14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var btnSendInfo: Button? = null
    private var etTextToPass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendInfo = findViewById(R.id.btnSendInfo)
        etTextToPass = findViewById(R.id.etTextToPass)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        btnSendInfo?.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("INFO",etTextToPass?.text.toString())
            startActivity(intent)
        }
    }

}