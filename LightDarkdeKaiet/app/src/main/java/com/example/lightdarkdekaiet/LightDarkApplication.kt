package com.example.lightdarkdekaiet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lightdarkdekaiet.settings.ThemeSetup

class LightDarkApplication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ThemeSetup.applyTheme(this)
    }
}