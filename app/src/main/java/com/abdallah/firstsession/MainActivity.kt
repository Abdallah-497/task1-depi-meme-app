package com.abdallah.firstsession

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
          enableEdgeToEdge()

          ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
              val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
              v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
              insets
          }

         */
        fun onStart() {
            super.onStart()
            Log.d("MainActivity", "onStart")
        }


        fun onResume() {
            super.onResume()
            Log.d("MainActivity", "onStart")
        }

        fun onPause() {
            super.onPause()
            Log.d("MainActivity", "onStart")
        }
        fun onStop() {
            super.onStop()
            Log.d("MainActivity", "onStart")
        }
        fun onRestart() {
            super.onRestart()
            Log.d("MainActivity", "onStart")
        }
        fun onDestroy() {
            super.onDestroy()
            Log.d("MainActivity", "onStart")
        }
    }
}