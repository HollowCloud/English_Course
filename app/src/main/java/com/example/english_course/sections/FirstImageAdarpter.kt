package com.example.english_course.sections

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.english_course.R


class FirstImageAdarpter (
    private val context: Context,
    private val images: List<Image>,
    val listener: (Image) -> Unit

) : RecyclerView.Adapter<FirstImageAdarpter.ImageViewHolder>() {

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val imageSrc = view.findViewById<ImageView>(R.id._image)
        val title = view.findViewById<TextView>(R.id._title)

        fun bindView(image: Image, listener: (Image) -> Unit){

            imageSrc.setImageResource(image.ImageSrc)
            title.text = image.ImageTitle
            itemView.setOnClickListener{
                listener(image)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder
    = ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image_first, parent, false))

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int){
        holder.bindView(images[position], listener)
    }

    override fun getItemCount(): Int = images.size

}
