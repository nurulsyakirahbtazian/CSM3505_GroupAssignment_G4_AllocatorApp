package com.example.android_kotlin_job_allocation_app.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import com.example.android_kotlin_job_allocation_app.R
/*import kotlin.coroutines.jvm.internal.CompletedContinuation.context*/

class Homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        val image = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.button)

    }

    /*(R.id.button).setOnClickListener {
        // Perform the navigation when the button is clicked
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }*/

    //val button = findViewById<Button>(R.id.button)

    /*val listener = View.OnClickListener {
        // Perform the action when the button is clicked
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }*/

    fun homepageButton() {
        intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }

    /*fun homepageButton(view: View?) {
        val i = Intent(context, MainActivity::class.java)
        startActivity(i)
    }*/

}