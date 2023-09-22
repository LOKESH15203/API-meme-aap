package com.example.aa4memesharing

import android.content.Intent
import android.graphics.Color.alpha
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.graphics.alpha
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_start_page.textView


class Splash_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)

        val animation: LottieAnimationView = findViewById(R.id.animation)
        val text = findViewById<TextView>(R.id.textView)

        animation.animate().apply {
            duration = 3000
            translationXBy(0f)
            translationYBy(-50f)
            alpha(0.1f)
            setDuration(2000).alpha(1f)
        }.start()

        textView.animate().apply {
            duration = 3000
            translationYBy(50f)
            translationXBy(0f)
            alpha(0.1f)
            setDuration(2000).alpha(1f)
        }.withEndAction{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}