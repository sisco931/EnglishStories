package com.example.englishstories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Adapter
        val storyAdapter = ArrayAdapter<Story>(
            this, android.R.layout.simple_list_item_1,Data.stories)

        //Bind adapter to listview
        listViewStories.adapter = storyAdapter

        //click response
        listViewStories.setOnItemClickListener {
                parent, view, position, id ->
            //Toast.makeText(this,"You Clicked On ${stories[position]}",Toast.LENGTH_LONG).show()

            //Starting full text activity code
            val intent = Intent(this, FullTextActivity::class.java)
            intent.putExtra("ITEM_INDEX", position)
            startActivity(intent)
        }

    }
}
