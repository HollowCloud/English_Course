package com.example.english_course.sections

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.english_course.R

class SecondSection : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_section)

        val imageList = listOf<com.example.english_course.sections.Image>(
            Image(R.drawable.s2,
                "Gerund",
                "The gerund looks exactly the same as a present participle, " +
                        "but it is useful to understand the difference between the two. " +
                        "The gerund always has the same function as a noun " +
                        "Some uses of the gerund are covered on this page. " +
                        "A separate page deals with verbs that are followed by the gerund." + "\n" + "\n" +
                        "Example: " + "\n" + "\n" +
                        "Eating people is wrong.\n" +
                        "Hunting tigers is dangerous.\n" +
                        "Flying makes me nervous.\n" +
                        "Brushing your teeth is important.\n" +
                        "Smoking causes lung cancer."),

            Image(R.drawable.s2,
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