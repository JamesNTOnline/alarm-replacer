package com.example.spamalarm

import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        val title = intent.getStringExtra("title") ?: "Default Title"
        supportActionBar?.title = title

        val hourPicker = findViewById<NumberPicker>(R.id.hourPicker)
        val minutePicker = findViewById<NumberPicker>(R.id.minutePicker)
        val showTimeButton = findViewById<Button>(R.id.showTimeButton)
        val timeResult = findViewById<TextView>(R.id.timeResult)

        // Set up hours (0–23)
        hourPicker.minValue = 0
        hourPicker.maxValue = 23
        hourPicker.wrapSelectorWheel = true

        // Set up minutes (0–59)
        minutePicker.minValue = 0
        minutePicker.maxValue = 59
        minutePicker.wrapSelectorWheel = true

    }

}