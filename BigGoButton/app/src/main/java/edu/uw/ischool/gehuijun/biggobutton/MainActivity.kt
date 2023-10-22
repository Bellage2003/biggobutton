package edu.uw.ischool.gehuijun.biggobutton

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var pushButton: Button
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pushButton = findViewById(R.id.pushButton)

        pushButton.setOnClickListener {
            clickCount++
            val buttonText = "You have pushed me $clickCount time${if (clickCount == 1) "" else "s"}!"
            pushButton.text = buttonText
        }
    }
}