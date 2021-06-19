package com.hfad.minigtapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class DiecastAdapter(val listdiecast: ArrayList<Diecast>) : RecyclerView.Adapter<DiecastAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback


    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): DiecastAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_row_layout, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: DiecastAdapter.ListViewHolder, position: Int) {
        val diecast = listdiecast[position]
        Glide.with(holder.itemView.context).load(diecast.photo)
                .apply(RequestOptions().override(65, 65))
                .into(holder.imgPhoto)
        holder.tvname.text = diecast.name
        holder.tvprice.text = diecast.price
        holder.tvdesc.text = diecast.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listdiecast[holder.adapterPosition])
        }

    }

    override fun getItemCount(): Int {
        return listdiecast.size
    }


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvname: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvprice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvdesc: TextView = itemView.findViewById(R.id.tv_item_desc)


    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Diecast)
    }


}





