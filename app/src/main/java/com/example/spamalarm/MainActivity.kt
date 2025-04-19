package com.example.spamalarm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addAlarmButton = findViewById<FloatingActionButton>(R.id.addButton)

        //val hourPicker = findViewById<NumberPicker>(R.id.hourPicker)
        //val minutePicker = findViewById<NumberPicker>(R.id.minutePicker)
        //val showTimeButton = findViewById<Button>(R.id.showTimeButton)
        //val timeResult = findViewById<TextView>(R.id.timeResult)

        // Set up hours (0–23)
        // hourPicker.minValue = 0
        //hourPicker.maxValue = 23
        //hourPicker.wrapSelectorWheel = true

        // Set up minutes (0–59)
        // minutePicker.minValue = 0
        // minutePicker.maxValue = 59
//minutePicker.wrapSelectorWheel = true

        addAlarmButton.setOnClickListener {
            val title = getString(R.string.add_alarm)
            val intent = Intent(this, EditActivity::class.java)
            intent.putExtra("title", title)
            startActivity(intent)
            //finish() //prevent going back
        }
        //showTimeButton.setOnClickListener {
        //    val hour = hourPicker.value
        //    val minute = minutePicker.value
        //    val formatted = String.format("%02d:%02d", hour, minute)
        //  timeResult.text = "Selected time: $formatted"
    }
}

