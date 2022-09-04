package com.cys.ejemploanimaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.text)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            /*val animation = AnimationUtils.loadAnimation(this, R.anim.desaparecer)
            text.startAnimation(animation)
            Handler().postDelayed({
                text.visibility = View.GONE

            }, 1000)*/

            val animation = AnimationUtils.loadAnimation(this, R.anim.rotacion)
            text.startAnimation(animation)


        }
    }
}