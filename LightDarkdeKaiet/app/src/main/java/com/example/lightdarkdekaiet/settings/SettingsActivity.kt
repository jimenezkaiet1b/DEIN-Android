package com.example.lightdarkdekaiet.settings

import android.content.Context
import android.content.Intent

class SettingsActivity {
    companion object {
        fun start(context: Context) {
            val intent = Intent(context, SettingsActivity::class.java)
            context.startActivity(intent)

        }
    }
}