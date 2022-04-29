package com.example.english_course.sections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.english_course.R

class FirstDetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_detailed)

        val image = intent.getParcelableExtra<Image>(FirstSection.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id.imageDetail)
        val title = findViewById<TextView>(R.id.imageTitle)
        val desc = findViewById<TextView>(R.id.imageDescription)

        imgSrc.setImageResource(image?.ImageSrc!!)
        title.text = image.ImageTitle
        desc.text = image.ImageDescription

    }
}