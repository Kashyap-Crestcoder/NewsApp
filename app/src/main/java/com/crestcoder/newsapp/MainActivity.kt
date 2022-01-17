package com.crestcoder.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crestcoder.newsapp.Interface.NewsClick
import com.crestcoder.newsapp.adapter.NewsItemAdapter
import com.crestcoder.newsapp.model.NewsItem

class MainActivity : AppCompatActivity(), NewsClick {

    private val TAG = "MainActivity";
//    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
    }

    private fun init() {

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)

        // this creates a vertical layout Manager
        recyclerview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<NewsItem>()

        // This loop will create 20 Views containing
        // the image with the count of view
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.hot, "Top News"))
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.india, "India"))
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.world, "World"))
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.cricket, "Cricket"));
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.running, "Sports"));
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.astrology, "Astrology"));
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.lifestyle, "Lifestyle"));
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.meeting, "Business"));
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.coronavirus, "Omicron"));
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.music, "Entrainment"));
        data.add(NewsItem(resources.getColor(R.color.teal_700), R.drawable.magazine, "Magazine"));

        // This will pass the ArrayList to our Adapter
        val adapter = NewsItemAdapter(data, applicationContext, this)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }

    override fun click(int: Int, string: String) {
        Log.e("ClickPos", "" + int)
        Log.e("CatName", string)

    }
}