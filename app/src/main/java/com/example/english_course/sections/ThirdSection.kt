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
            Image(R.drawable.s3,
                "Adverbs",
                "An adverb is a word that is used to change, modify or qualify several \n" +
                        "types of words including an adjective, a verb, a clause, another adverb, or \n" +
                        "any other type of word or phrase, with the exception of determiners and \n" +
                        "adjectives, that directly modify nouns.\n" + "\n" +
                        "Example:\n" + "\n" +
                        "When? She always arrives early.\n" +
                        "How? He drives carefully.\n" +
                        "Where? They go everywhere together.\n" +
                        "In what way? She eats slowly.\n" +
                        "To what extent? It is terribly hot."),

            Image(R.drawable.s3,
                "Future Tense",
                "The simple future is a verb tense that’s used to talk about things\n" +
                        "that haven’t happened yet.\n" + "\n" +
                        "Example:\n" + "\n" +
                        "This year, Jen will read War and Peace. It will be hard, but she’s determined to do it.\n" +
                        "I will learn a new language. Jen will read that book. \n" +
                        "My brothers will sleep till noon if no one wakes them up.\n" +
                        "You will see what I mean."),

            Image(R.drawable.s3,
                "Both, either, neither",
                "Well, this is just some random thoughts that are going through my mind now. " +
                        "In their most common uses, both, either and neither are  binary \n" +
                        "connectors or determiners; in other words they are used to associate \n" +
                        "or to link, either in the affirmative or in the negative, \n" +
                        "two entities (people, objects, abstractions).\n" + "\n" +
                        "Example:\n" + "\n" +
                        "Both the candidates made some good points\n" +
                        "I don't like either of these shirts.\n" +
                        "Neither of the secretaries knew where the boss had gone.\n"),

            Image(R.drawable.s3,
                "Embedded Questions",
                "An embedded question is a question\n" +
                        "that is included inside another question or statement.\n" +
                        "They are common after introductory phrases, such as:\n" + "\n" +
                        "I wonder\n" +
                        "Could you tell me\n" +
                        "Do you know\n" +
                        "Can you remember\n" +
                        "We need to find out\n" +
                        "I'd like to know\n" + "\n" +
                        "Example:\n" + "\n" +
                        "Do you know if he will be there?\n" +
                        "Do you know whether or not he will be there?\n" +
                        "Do you know whether he will be there or not?"),

            Image(R.drawable.s3,
                "Intensifiers",
                "Intensifiers are adverbs or adverbial phrases\n" +
                        "that strengthen the meaning of other expressions\n" +
                        "and show emphasis.\n" + "\n" +
                        "Example:\n" + "\n" +
                        "She's so talented. She plays the violin so well.\n" +
                        "She worked too much.\n" +
                        "It was yellow enough for us to see him in the crowd."),

            Image(R.drawable.s3,
                "Future continuous",
                "The future continuous tense, sometimes also\n" +
                        "referred to as the future progressive tense, is\n" +
                        "a verb tense that indicates that something will\n" +
                        "occur in the future and continue for an expected\n" +
                        "length of time.\n" + "\n" +
                        "Example:\n" + "\n" +
                        "Michael will be running a marathon this Saturday.\n" +
                        "Eric will be competing against Michael in the race.\n" +
                        "I will be watching Michael and Eric race."),

            Image(R.drawable.s3,
                "Question Tags",
                "A tag question is a small question that\n" +
                        "is attached , or \"tagged\", to the\n" +
                        "end of a sentence.\n" + "\n" +
                        "Example:\n" + "\n" +
                        "You came by train, didn't you?\n" +
                        "It’s very windy today, isn’t it?\n" +
                        "You can meet me at the station, can’t you?\n" +
                        "You couldn't give me a ride, could you?")

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