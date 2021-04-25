package de.ihelmrich.notes

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val tvFirst = findViewById<TextView>(R.id.textview_first)
            tvFirst.text = (tvFirst.text.toString().toInt() * 2).toString()
            Snackbar.make(view,"the value of the text changed.", Snackbar.LENGTH_LONG).show()
        }
        createPerson()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun createPerson() {
        // Try properties with kotlin
        val p = Person("Ian", 150.0)
        val name = p.name

        p.weightLbs = 150.0
        // uses the getter method in the person class
        val kilos = p.weightKg
        // uses the setter method in the person class
        p.weightKg = 80.0
    }
}