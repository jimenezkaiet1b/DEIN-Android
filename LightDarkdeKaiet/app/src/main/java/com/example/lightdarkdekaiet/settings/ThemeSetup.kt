package com.example.lightdarkdekaiet.settings

import android.content.Context
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatDelegate

object ThemeSetup {
    fun apllyTheme(mode: String?, context: Context){
        if ("DARK" == mode){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else if ("LIGHT" == mode){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        }


    }

    fun applyTheme(context: Context){
        val defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        val value = defaultSharedPreferences.getString(
            "theme",
            "DEFAULT"
        )
        apllyTheme(value,context)

    }


}