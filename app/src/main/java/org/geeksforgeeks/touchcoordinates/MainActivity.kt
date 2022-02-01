package org.geeksforgeeks.touchcoordinates

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRelativeLayout = findViewById<RelativeLayout>(R.id.relative_layout_1)
        val mTextViewX = findViewById<TextView>(R.id.text_view_1)
        val mTextViewY = findViewById<TextView>(R.id.text_view_2)

        mRelativeLayout.setOnTouchListener { _, motionEvent ->
            val mX = motionEvent.x
            val mY = motionEvent.y

            mTextViewX.text = "X: $mX"
            mTextViewY.text = "Y: $mY"

            true
        }
    }
}