package com.example.picodiploma.mitologiyunani

import android.content.Context
import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ImageAdapter (
    private val context: Context,
    private val images: List<Image>,
    val listener : (Image) -> Unit
        ) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageSrc : ImageView = view.findViewById(R.id._image)
        val title : TextView = view.findViewById(R.id._title)
        val detail : TextView = view.findViewById(R.id._detail)
        fun bindView(image: Image, listener: (Image) -> Unit){
            imageSrc.setImageResource(image.imageSrc)
            title.text = image.imageTitle
            detail.text = image.imageDesc
            itemView.setOnClickListener{listener(image)}

        }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder
    = ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image, parent, false))

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }

    override fun getItemCount(): Int = images.size
}