package com.example.coremodule

import android.util.Log

object CoreModule {
    const val TAG = "CoreModule"
    fun createRepository() {
        Log.d(TAG, "createRepository: Created!!!")
        Log.d(TAG, "createRepository: Are we sure ???")
    }
}