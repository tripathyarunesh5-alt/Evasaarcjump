package com.evasa.arcjump

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tv = TextView(this).apply {
            text = "Hello EVASA Arc Jump!"
            textSize = 24f
            setPadding(40, 40, 40, 40)
        }
        setContentView(tv)
    }
}
