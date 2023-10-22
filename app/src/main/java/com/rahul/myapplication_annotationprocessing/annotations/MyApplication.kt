package com.rahul.myapplication_annotationprocessing.annotations

import android.app.Application
import android.util.Log

class MyApplication: Application() {
    override fun onCreate() {
        Log.e("MyApplication", "OnCreate of MyApplication got called")
        super.onCreate()
    }

    override fun onTerminate() {
        Log.e("MyApplication", "onTerminate of MyApplication got called.")
        super.onTerminate()
    }
}