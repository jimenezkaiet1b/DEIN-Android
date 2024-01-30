package com.example.lightdarkdekaiet.settings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.System.getString
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.lightdarkdekaiet.R
import java.nio.channels.spi.AbstractSelectionKey
import java.util.prefs.Preferences

class SettingFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResources(R.xml.menu_settings, rootKey)

        findPreference<Preferences>(getString(R.string.settings_theme_key))?.setOnPreferenceChangeListener{preference, newValue -->
        if (newValue is String){
            ThemeSetup.applyTheme(newValue, requireContext())
            true
        }else{
            false
        }

        }
    }
}