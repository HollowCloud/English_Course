package com.example.english_course.sections

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.english_course.R
import com.example.english_course.fragments.FirstFragment

class ThirdSection : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_section)


        val imageList = listOf<com.example.english_course.sections.Image>(
            Image(R.drawable.f1,
                "Image 55f5f5f5f",
                "Well, this is just some random thoughts that are going through my mind now. " +
                        "Name? No, I don't have it. Even if I had, why did you want to know it."),

            Image(R.drawable.f2,
                "Image 2",
                "Well, this is just some random thoughts that are going through my mind now. " +
                        "Name? No, I don't have it. Even if I had, why did you want to know it."),

            Image(R.drawable.f3,
                "Image 3",
                "Well, this is just some random thoughts that are going through my mind now. " +
                        "Name? No, I don't have it. Even if I had, why did you want to know it."),

            Image(R.drawable.f4,
                "Image 4",
                "Well, this is just some random thoughts that are going through my mind now. " +
                        "Name? No, I don't have it. Even if I had, why did you want to know it.")

        )

        val recyclerView = findViewById<RecyclerView>(R.id.imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FirstImageAdarpter(this, imageList){
            val intent = Intent(this, FirstDetailedActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}