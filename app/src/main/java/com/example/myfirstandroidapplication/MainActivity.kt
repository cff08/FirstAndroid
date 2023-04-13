package com.example.myfirstandroidapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// The first Activity which initializes app-wide resources
// The AppCompatActivity class lets you use up-to-date Android app features
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // the onCreate() method calls setContentView() to create the primary layout for the Activity.
        super.onCreate(savedInstanceState)
        // When the setContentView() method is called with the path to a layout file,
        // the system creates all the initial views from the specified layout and adds them to your Activity.
        setContentView(R.layout.activity_main)
    }
}