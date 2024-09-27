package com.indri.pnp_indri.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.indri.pnp_indri.DetailPhotoActivity
import com.indri.pnp_indri.R
import com.indri.pnp_indri.model.PnpModel

class PnpAdapter(
    private val itemList: ArrayList<PnpModel>,
    private val context: Context
) : RecyclerView.Adapter<PnpAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.gambarPnp)
        var itemImage1: ImageView = itemView.findViewById(R.id.gambarPnp1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_kampus_images, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]

        // Set images for the item
        holder.itemImage.setImageResource(currentItem.image)
        holder.itemImage1.setImageResource(currentItem.image1)

        // Set click listener for first image
        holder.itemImage.setOnClickListener {
            openDetailActivity(currentItem.image)
        }

        // Set click listener for second image
        holder.itemImage1.setOnClickListener {
            openDetailActivity(currentItem.image1)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    // Function to start GalleryDetailActivity and pass the clicked image resource ID
    private fun openDetailActivity(imageResId: Int) {
        val intent = Intent(context, DetailPhotoActivity::class.java)
        intent.putExtra("imageResId", imageResId)
        context.startActivity(intent)
    }
}