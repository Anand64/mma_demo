package com.example.feature1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coremodule.CoreModule

class FirstFeatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_feature)
        CoreModule.createRepository()
    }
}