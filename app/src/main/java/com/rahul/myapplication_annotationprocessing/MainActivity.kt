package com.rahul.myapplication_annotationprocessing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rahul.myapplication_annotationprocessing.annotations.TestMarker


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity", "Oncreate of MainActivity is called")
    }

    override fun onStart() {
        Log.e("MainActivity", "onStart of MainActivity is called")
        super.onStart()
    }

    override fun onResume() {
        Log.e("MainActivity", "onResume of MainActivity is called")
        super.onResume()
    }

    override fun onPause() {
        Log.e("MainActivity", "onPause of MainActivity is called")
        super.onPause()
    }

    override fun onStop() {
        Log.e("MainActivity", "onStop of MainActivity is called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("MainActivity", "onDestroy of MainActivity is called")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.e("MainActivity", "onRestart of MainActivity is called")
        super.onRestart()
    }
}