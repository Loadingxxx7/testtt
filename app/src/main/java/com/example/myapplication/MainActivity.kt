package com.example.myapplication

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isTouch: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener {
            expandableLayout.toggle()

            isTouch = if (isTouch) {
                imageView.setBackgroundResource(R.color.white)
                //ContextCompat.getDrawable()
                imageView.setImageDrawable(resources.getDrawable(R.mipmap.icon_arrow_right))
                false
            } else {
                imageView.setBackgroundResource(R.color.teal_700)
                imageView.setImageDrawable(resources.getDrawable(R.mipmap.icon_arrow_left))
                true
            }

        }

    }
}