package com.example.mencontextualflotantedekaiet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: ImageView = findViewById(R.id.image)
        registerForContextMenu(image)


    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
        menu.setHeaderTitle(R.string.descripcion_imagen)
    }

    override fun onContextMenuClosed (menu: Menu) {
        Toast.makeText( this, "Menú cerrado" , Toast.LENGTH_SHORT).show()
    }
}