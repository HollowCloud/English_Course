package com.example.english_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class SignUpActivity : AppCompatActivity() {


    val ref = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val s = findViewById<Button>(R.id.s_button)

        s.setOnClickListener{
            Ensure()
        }

    }

    private fun Ensure(){

        val em = findViewById<TextInputEditText>(R.id.login_email)
        val pas = findViewById<TextInputEditText>(R.id.login_password)

        if(em.text.toString().isEmpty()){
            em.error = "Please Enter Email"
            em.requestFocus()
            return
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(em.text.toString()).matches()){
            em.error = "Please Validate Your Email"
            em.requestFocus()
            return
        }

        if(pas.text.toString().isEmpty()){
            pas.error = "Please Enter Password"
            pas.requestFocus()
            return
        }


        ref.createUserWithEmailAndPassword(em.text.toString(), pas.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = ref.currentUser
                    user?.sendEmailVerification()
                        ?.addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                startActivity(Intent(this, MainActivity::class.java))
                                finish()
                            }
                        }
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                }
            }

    }


}