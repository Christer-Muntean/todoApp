package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.children
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toDosFromServer = listOf<String>("Kjøpe melk", "Gå tur med hamsteren", "besøke månen")

        for (toDo in toDosFromServer) {
            val textView: TextView = TextView(this)
            textView.text = toDo
            task_list_layout.addView(textView)

            textView.setOnClickListener {
                task_list_layout.removeView(it)
            }
        }

        add_task_button.setOnClickListener {

            val textView: TextView = TextView(this)
            textView.text = "${task_editText.text}"
            textView.textSize = 40.0f

            task_list_layout.addView(textView)

            textView.setOnClickListener {
                task_list_layout.removeView(it)
            }
        }
    }
}