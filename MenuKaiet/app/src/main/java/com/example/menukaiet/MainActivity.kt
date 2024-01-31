package com.example.menukaiet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {


    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private val nombres = arrayOf(
        "Juan", "María", "Carlos", "Ana", "Luis",
        "Laura", "Javier", "Isabel", "Sergio", "Paula",
        "Andrés", "Marta", "Pedro", "Elena", "Francisco" ,
        "Carmen", "David", "Raquel", "Miguel", "Rosa"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id. toolbar)
        setSupportActionBar(toolbar)

        listView = findViewById(R.id. listview)
        adapter = ArrayAdapter( this, android.R.layout. simple_list_item_1,
            nombres)
        listView.adapter = adapter


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)

        val searchItem = menu.findItem(R.id.app_bar_search)
        val searchView = searchItem.actionView as SearchView
        searchView.queryHint = "Nombre..."
        searchView.setOnQueryTextListener( object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit (query: String?): Boolean {
                Toast.makeText( this@MainActivity , "Búsqueda enviada: $query", Toast.LENGTH_SHORT).show()
                return false
            }
            override fun onQueryTextChange (newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        })
        return true
    }

    override fun onOptionsItemSelected (item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.app_bar_search, R.id.add_category, R.id.add_label, R.id.settings -> {
                Toast.makeText( this, item.title, Toast.LENGTH_SHORT).show()
                true
            }
            R.id. settings -> {
                goToSettings()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun goToSettings () {
        val intent = Intent( this, SettingsActivity:: class.java)
        startActivity(intent)
    }
}