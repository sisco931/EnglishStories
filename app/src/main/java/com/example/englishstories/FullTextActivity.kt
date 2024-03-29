package com.example.englishstories

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_full_text.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_full_text.*

class FullTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_text)
        setSupportActionBar(toolbar)

        //Read Extra Values
        val itemIndex = intent.extras?.get("ITEM_INDEX").toString().toInt()
        //Display Toast message
        Toast.makeText(this, "Item index is ${itemIndex}",Toast.LENGTH_LONG).show()

        title = Data.stories[itemIndex].title
        textViewStoryFullText.setText(Data.stories[itemIndex].fullText)


    }
}
