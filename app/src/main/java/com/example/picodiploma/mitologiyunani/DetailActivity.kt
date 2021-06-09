package com.example.picodiploma.mitologiyunani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val profil2: ImageView = findViewById(R.id.profil2)
        profil2.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val back_btn: ImageView = findViewById(R.id.back_btn)
        back_btn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
            val image = intent.getParcelableExtra<Image>(MainActivity.INTENT_PARCELABLE)

            val imgSrc = findViewById<ImageView>(R.id._imageDetail)
            val imgeTitle = findViewById<TextView>(R.id._imageTitle)
            val imgDesc = findViewById<TextView>(R.id._ImageDesc)
            val smblDesk = findViewById<TextView>(R.id._simboldesk)
            val senjDesk = findViewById<TextView>(R.id._senjatadesk)

            imgSrc.setImageResource(image!!.imageSrc)
            imgeTitle.text = image.imageTitle
            imgDesc.text = image.imageDesc
            smblDesk.text = image.simboldesk
            senjDesk.text = image.senjatadesk
    }
}