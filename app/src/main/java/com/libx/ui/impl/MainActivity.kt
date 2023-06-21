package com.libx.ui.impl

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.libx.ui.views.ToolbarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbarLayout = findViewById<ToolbarLayout>(R.id.toolbar_layout)

        setSupportActionBar(toolbarLayout.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}