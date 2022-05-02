package com.example.english_course.sections

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.english_course.R

class FirstSection : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
//  \"n\"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_section)

        //Changing Images
        val imageList = listOf<com.example.english_course.sections.Image>(
            Image(R.drawable.s1,
                "Adjectives and Adverbs",
                "In many languages, adjectives denoting attributes usually occur in a specific order. " +
                        "Generally, the adjective order in English is: " + "\n" + "\n" +
                        "Quantity or number\n" + "\n" +
                        "Quality or opinion\n" + "\n" +
                        "Size\n" + "\n" +
                        "Age\n" + "\n" +
                        "Shape\n" + "\n" +
                        "Color\n" + "\n" +
                        "Proper adjective (often nationality, other place of origin, or material)\n" + "\n" +
                        "Purpose or qualifier"),

            Image(R.drawable.s1,
                "How much/How many",
                "Much and many\n" +"\n" +
                        "We can use much and many to talk about quantities. We can also use a lot of or lots of.\n" +
                        "\n" + "\n" + "Example:" + "\n" +
                        "      There aren't many shops in my town.\n" +
                        "      Do you get much homework?\n" +
                        "      I've got a lot of games."),

            Image(R.drawable.s1,
                "Imperatives",
                "The most direct way of doing this is through use of the imperative, as " +
                        "the name of this verbal mood indicates. The imperative mood in English is generally" +
                        " used to give an order, to prompt someone to do something, to give a warning or to give instructions." + "\n" + "\n" +
                        "Example: " + "\n" + "\n" +
                        "    Don’t be late!" + "\n" + "\n" +
                        "    Let’s not go in, please."),

            Image(R.drawable.s1,
                "Can/Can't",
                "Modals – 'could' and 'couldn't'\n" + "\n" +
                        "We can use could and couldn't to talk about abilities in the past.\n" +
                        "\n" + "Example: " + "\n" + "\n" +
                        "   I could swim when I was four.\n" +
                        "   She couldn't ride a bike when she was three.\n" +
                        "   He could walk when he was two.\n" +
                        "\n" + "\n" +
                        "   Use the infinitive without to after could and couldn't.\n" +
                        "\n" +
                        "   I couldn't run when I was a baby.\n" +
                        "   My mum couldn't swim when she was a child.\n" +
                        "   We could read when we were five.\n" +
                        "   They couldn't speak English before they went to school."),


            Image(R.drawable.s1,
                "Present Simple",
                "The Present Simple tense is the most basic tense in " +
                        "English and uses the base form of the verb (except for the verb be). " +
                        "The only change from the base is the addition of s for third person singular." + "\n" + "\n" +
                        "Example: " + "\n" + "\n" +
                        "   I live in New York.\n" +
                        "   The Moon goes round the Earth.\n" +
                        "   John drives a taxi.\n" +
                        "   He does not drive a bus."),

            Image(R.drawable.s1,
                "Past Simple",
                "The Past Simple tense is sometimes called the \"preterite tense\". " +
                        "We can use several tenses and forms to talk about the past, " +
                        "but the Past Simple tense is the one we use most often." + "\n" + "\n" +
                        "Example: "+ "\n" + "\n" +
                        "\"   Why didn't you go to the party?\" / \"I did go.\" \n" +
                        "   He didn't like the movie.\n" +
                        "   What did you eat for dinner?\n" +
                        "   John drove to London on Monday."),

            Image(R.drawable.s1,
                "Going To",
                "Going to is not a tense. It is a special structure" +
                        " that we use to talk about the future." + "\n" + "\n" +
                        "Example: " + "\n" + "\n" +
                        "   Jo has won the lottery. He says he's going to buy a Porsche.\n" +
                        "   We're not going to paint our bedroom tomorrow.\n" +
                        "   When are you going to go on holiday?"),


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