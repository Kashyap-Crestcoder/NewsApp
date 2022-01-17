package com.crestcoder.newsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.crestcoder.newsapp.Interface.NewsClick
import com.crestcoder.newsapp.R
import com.crestcoder.newsapp.model.NewsItem

class NewsItemAdapter(private val list: List<NewsItem>, val context: Context,val click : NewsClick) :
    RecyclerView.Adapter<NewsItemAdapter.MyViewHolder>() {
    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val name: TextView = itemView.findViewById(R.id.name);
        val image: ImageView = itemView.findViewById(R.id.image);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.newsitem, parent, false);
        return MyViewHolder(view);
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemView = list[position];
        holder.name.text = itemView.category;
        holder.image.setImageResource(itemView.imageUrl);

        holder.itemView.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, "Click", Toast.LENGTH_LONG).show();
            click.click(position,itemView.category);
        })
    }

    override fun getItemCount(): Int {
        return list.size;
    }
}