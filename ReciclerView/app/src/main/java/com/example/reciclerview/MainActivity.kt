package com.example.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler: RecyclerView =
            findViewById(R.id. recycler)
        recycler.adapter = ColorsAdapter(buildColors())
    }
    private fun buildColors (): List<Color> {
        return listOf(
            Color(getString(R.string. red), getColorHex(R.color. red),"https://loremflickr.com/320/240?random" ),
            Color(getString(R.string. indigo), getColorHex(R.color. indigo), "https://loremflickr.com/320/240?random=2" ),
            Color(getString(R.string. green), getColorHex(R.color. green),"https://loremflickr.com/320/240?random=3" ),
            Color(getString(R.string. orange), getColorHex(R.color. orange),"https://loremflickr.com/320/240?random=4" ),
            Color(getString(R.string. blue), getColorHex(R.color. blue),"https://loremflickr.com/320/240?random=2" ),
            Color(getString(R.string. yellow), getColorHex(R.color. yellow),"https://loremflickr.com/320/240?random=2" ),
            Color(getString(R.string. bluegrey), getColorHex(R.color. bluegrey),"https://loremflickr.com/320/240?random=2" ),
            Color(getString(R.string. teal), getColorHex(R.color. teal),"https://loremflickr.com/320/240?random=2" ),
            Color(getString(R.string. deeppurple), getColorHex(R.color. deeppurple),"https://loremflickr.com/320/240?lock=9" ),
            Color(getString(R.string. cyan), getColorHex(R.color. cyan),"https://loremflickr.com/320/240?lock=10" ),
            Color(getString(R.string. brown), getColorHex(R.color. brown),"https://loremflickr.com/320/240?random=1" ),
            Color(getString(R.string. red), getColorHex(R.color. red),"https://loremflickr.com/320/240?lock=1" ),
            Color(getString(R.string. indigo), getColorHex(R.color. indigo), "https://loremflickr.com/320/240?lock=2" ),
            Color(getString(R.string. green), getColorHex(R.color. green),"https://loremflickr.com/320/240?lock=3" ),
            Color(getString(R.string. orange), getColorHex(R.color. orange),"https://loremflickr.com/320/240?lock=4" ),
            Color(getString(R.string. blue), getColorHex(R.color. blue),"https://loremflickr.com/320/240?lock=5" ),
            Color(getString(R.string. yellow), getColorHex(R.color. yellow),"https://loremflickr.com/320/240?lock=6" ),
            Color(getString(R.string. bluegrey), getColorHex(R.color. bluegrey),"https://loremflickr.com/320/240?lock=7" ),
            Color(getString(R.string. teal), getColorHex(R.color. teal),"https://loremflickr.com/320/240?lock=8" ),
            Color(getString(R.string. deeppurple), getColorHex(R.color. deeppurple),"https://loremflickr.com/320/240?lock=9" ),
            Color(getString(R.string. cyan), getColorHex(R.color. cyan),"https://loremflickr.com/320/240?lock=10" ),
            Color(getString(R.string. brown), getColorHex(R.color. brown),"https://loremflickr.com/320/240?random=1" ),
            Color(getString(R.string. red), getColorHex(R.color. red),"https://loremflickr.com/320/240?lock=1" ),
            Color(getString(R.string. indigo), getColorHex(R.color. indigo), "https://loremflickr.com/320/240?lock=2" ),
            Color(getString(R.string. green), getColorHex(R.color. green),"https://loremflickr.com/320/240?lock=3" ),
            Color(getString(R.string. orange), getColorHex(R.color. orange),"https://loremflickr.com/320/240?lock=4" ),
            Color(getString(R.string. blue), getColorHex(R.color. blue),"https://loremflickr.com/320/240?lock=5" ),
            Color(getString(R.string. yellow), getColorHex(R.color. yellow),"https://loremflickr.com/320/240?lock=6" ),
            Color(getString(R.string. bluegrey), getColorHex(R.color. bluegrey),"https://loremflickr.com/320/240?lock=7" ),
            Color(getString(R.string. teal), getColorHex(R.color. teal),"https://loremflickr.com/320/240?lock=8" ),
            Color(getString(R.string. deeppurple), getColorHex(R.color. deeppurple),"https://loremflickr.com/320/240?lock=9" ),
            Color(getString(R.string. cyan), getColorHex(R.color. cyan),"https://loremflickr.com/320/240?lock=10" ),
            Color(getString(R.string. brown), getColorHex(R.color. brown),"https://loremflickr.com/320/240?random=1" ),
        )
    }
    private fun getColorHex (colorResId: Int): String {
        return String.format("#%06X", 0xFFFFFF and ContextCompat.getColor( this, colorResId))
    }

}