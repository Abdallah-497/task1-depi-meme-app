package com.abdallah.firstsession

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.
        d("MainActivity", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onStart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onStart")
    }
}