package com.example.lightdarkdekaiet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import android.widget.Toolbar
import com.example.lightdarkdekaiet.settings.SettingsActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var editTextEmail: TextInputEditText
    private lateinit var textInputEmail : TextInputLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        editTextEmail = findViewById(R.id.editTextEmail)
        textInputEmail = findViewById(R.id.text_input_layout_email)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        SettingsActivity.start(this)
        return true
    }

    fun validate(view: View){
        if (TextUtils.isEmpty(editTextEmail.text)){
            textInputEmail.error = "This field is mandatory"
            textInputEmail.isErrorEnabled = true
        }else{
            textInputEmail.error = null
            textInputEmail.isErrorEnabled =false
        }
        clearFocus()
    }

    private fun clearFocus(){
        val view = currentFocus
        if(view is EditText){
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            view.clearFocus()
        }
    }

}