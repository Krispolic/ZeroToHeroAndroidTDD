package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.TextView.SavedState
import java.security.Key

class MainActivity : AppCompatActivity() {

    private lateinit var textview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.hideButton)
        textview = findViewById(R.id.titleTextView)
        button.setOnClickListener{
            textview.visibility = View.INVISIBLE
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY, textview.visibility)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textview.visibility = savedInstanceState.getInt(KEY)
    }

    companion object {
        private const val KEY = "visibility"
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}