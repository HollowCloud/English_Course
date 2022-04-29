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

class MainActivity : AppCompatActivity() {

    val ref = FirebaseAuth.getInstance()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val email = findViewById<TextInputEditText>(R.id.login_email)
        val password = findViewById<TextInputEditText>(R.id.login_password)
        val registerBut = findViewById<Button>(R.id.register_button)


        val r = findViewById<Button>(R.id.s_button)

//        registerBut.setOnClickListener{
//            ref.createUserWithEmailAndPassword(
//                email.text.toString().trim(),
//                password.text.toString().trim()
//            )
//        }

        r.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        }

        registerBut.setOnClickListener{
            logIn()
        }

    }

    private fun logIn(){
        val em = findViewById<TextInputEditText>(R.id.login_email)
        val pas = findViewById<TextInputEditText>(R.id.login_password)

        if (em.text.toString().isEmpty()) {
            em.error = "Please enter email"
            em.requestFocus()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(em.text.toString()).matches()) {
            em.error = "Please enter valid email"
            em.requestFocus()
            return
        }

        if (pas.text.toString().isEmpty()) {
            pas.error = "Please enter password"
            pas.requestFocus()
            return
        }

        ref.signInWithEmailAndPassword(em.text.toString(), pas.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = ref.currentUser
                    reload(user)
                } else {
                    reload(null)
                }
            }
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = ref.currentUser
        reload(currentUser)
    }

    private fun reload(currentUser: FirebaseUser?){
        if (currentUser != null) {
            if(currentUser.isEmailVerified) {
                startActivity(Intent(this, MainThreeActivity::class.java))
                finish()
            }else{
                Toast.makeText(
                    baseContext, "Please verify your email address.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        } else {
            Toast.makeText(
                baseContext, "Login failed.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}



//class MainActivity : AppCompatActivity() {
//
//    private lateinit var auth: FirebaseAuth
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        auth = FirebaseAuth.getInstance()
//
//        val btn_sign_up = findViewById<Button>(R.id.s_button)
//
//        btn_sign_up.setOnClickListener {
//            startActivity(Intent(this,SignUpActivity::class.java))
//            finish()
//        }
//
//    }
//
//    public override fun onStart() {
//        super.onStart()
//        // Check if user is signed in (non-null) and update UI accordingly.
//        val currentUser = auth.currentUser
//        updateUI(currentUser)
//    }
//
//    fun updateUI(currentUser: FirebaseUser?) {
//
//    }
//
//
//}