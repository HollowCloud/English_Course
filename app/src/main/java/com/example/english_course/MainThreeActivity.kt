package com.example.english_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.english_course.sections.FirstSection
import com.example.english_course.sections.SecondSection
import com.example.english_course.sections.ThirdSection
import com.google.firebase.auth.FirebaseAuth

class MainThreeActivity : AppCompatActivity() {

    val ref = FirebaseAuth.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_three)

        val butt = findViewById<Button>(R.id.btn_signout)

        butt.setOnClickListener{
            ref.signOut()
            startActivity(Intent(this, MainActivity::class.java))
        }

        val a1 = findViewById<Button>(R.id.btn_a_first)
        val a2 = findViewById<Button>(R.id.btn_a_second)
        val b1 = findViewById<Button>(R.id.btn_b_first)

        a1.setOnClickListener{
            elementary()
        }

        a2.setOnClickListener{
            beginner()
        }

        b1.setOnClickListener {
            preIntermediate()
        }

    }

    fun elementary(){
        startActivity(Intent(this, FirstSection::class.java))
        finish()
    }

    fun beginner(){
        startActivity(Intent(this, SecondSection::class.java))
        finish()
    }

    fun preIntermediate(){
        startActivity(Intent(this, ThirdSection::class.java))
        finish()
    }

}


//            val well = WelcomeFragment()
//            val frag: Fragment? =
//                supportFragmentManager.findFragmentByTag(WelcomeFragment::class.java.simpleName)
//
//            if(frag !is WelcomeFragment){
//                supportFragmentManager.beginTransaction().add(R.id.welcomeHere, well, WelcomeFragment::class.java.simpleName).commit()
//            }
//
//            nav.visibility = View.GONE