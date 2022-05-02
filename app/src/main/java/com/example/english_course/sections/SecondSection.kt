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
                "Articles",
                "Articles are words that define a noun as specific or unspecific" + "\n" + "\n" +
                        "Examples:\n" +
                        "\n" +
                        "After the long day, the cup of tea tasted particularly good.\n" + "\n" +
                        "By using the article the, we’ve shown that it was one specific day that was long and one specific cup of tea that tasted good.\n" + "\n" +
                        "After a long day, a cup of tea tastes particularly good.\n" + "\n" +
                        "By using the article a, we’ve created a general statement, implying that any cup of tea would taste good after any long day."),

            Image(R.drawable.s2,
                "Infinitive",
                "to + the base form of the verb, e.g., to sing, to dance, to run.\n" +
                        "Whether you use a gerund or an infinitive depends on the main verb in the sentence.\n" +
                        "I expect to have the results of the operation soon." + "\n" + "\n" +
                        "After many adjectives:\n" + "\n" +
                        "It is hard to make dinner this late.\n" +
                        "I find it difficult to describe my feelings about writing research essays.\n" + "\n" +
                        "To show purpose:\n" + "\n" +
                        "I left for Russia to study Russian.\n" +
                        "I came to the office to solve the mystery of the missing keys."),

            Image(R.drawable.s2,
                "Countable and Uncountable",
                "Countable nouns can be counted, e.g. an apple, two apples, \nthree apples, etc. \n" +
                        "Uncountable nouns cannot be counted, e.g. air, rice, water, etc. \n" +
                        "When you learn a new noun, you should check if it is countable \nor uncountable and note \n" +
                        "how it is used in a sentence. \n" + "\n" +
                        "Example(countable): " + "\n" + "\n" +
                        "There's a man at the door.\n" +
                        "I have some friends in New York.\n" + "\n" +
                        "Example(uncountable): \n" + "\n" +
                        "I don't have a dog.\n" +
                        "There aren't any seats."),

            Image(R.drawable.s2,
                "Should",
                "Should is an auxiliary verb - a modal auxiliary verb. \n" +
                        "We use should mainly to:\n" +
                        "\n" +
                        "1. give advice or make recommendations\n" +
                        "2. talk about obligation\n" +
                        "3. talk about probability and expectation \n" + "\n" +
                        "Example: \n" + "\n" +
                        "They should fix this road.\n" +
                        "They should have more staff in this shop.\n" +
                        "They should have abolished this tax years ago."),

            Image(R.drawable.s2,
                "Have To",
                "Have to is NOT an auxiliary verb (it uses the verb have as a main verb). \n" +
                        "We include have to here for convenience. \n" +
                        "We often use have to to say that something is obligatory. \n" + "\n" +
                        "Example: \n" + "\n" +
                        "Children have to go to school. \n" +
                        "In France, you have to drive on the right.\n" +
                        "In England, most schoolchildren have to wear a uniform.\n" +
                        "John has to wear a tie at work."),

            Image(R.drawable.s2,
                "Would like",
                "We use would like or ’d like to say politely what we want, \n" +
                        "especially when making offers and requests \n" + "\n" +
                        "Example: \n" + "\n" +
                        "Would you like a biscuit with your coffee?\n" +
                        "\n" +
                        "Can you order for Ellie? She’d like the Margarita pizza, please."),

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