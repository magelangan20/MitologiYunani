package com.example.picodiploma.mitologiyunani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.i
import android.widget.ImageView
import android.widget.TextView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val back_btn2: ImageView = findViewById(R.id.back_btn2)
        back_btn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val imgprofil = findViewById<ImageView>(R.id.imageProfil)
        imgprofil.setImageResource(R.drawable.profil)

        }
}