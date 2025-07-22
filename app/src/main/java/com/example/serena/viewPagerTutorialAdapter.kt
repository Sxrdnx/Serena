package com.example.serena

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.serena.databinding.ItemTutorialViewBinding

class ViewPagerTutorialAdapter(): ListAdapter<TutorialModel, ViewPagerTutorialAdapter.ViewHolder>(DiffUtilCallBack) {
    private lateinit var layoutInflater: LayoutInflater

    private object DiffUtilCallBack: DiffUtil.ItemCallback<TutorialModel>(){
        override fun areItemsTheSame(oldItem: TutorialModel, newItem: TutorialModel): Boolean = oldItem.img == newItem.img

        override fun areContentsTheSame(oldItem: TutorialModel, newItem: TutorialModel): Boolean = oldItem == newItem

    }

    inner class ViewHolder(private val itemTutorial: ItemTutorialViewBinding): RecyclerView.ViewHolder(itemTutorial.root){
        fun bind(item: TutorialModel)= with(itemTutorial){
            tvContent.text = item.description
            imgTutorial.background = ResourcesCompat.getDrawable(root.resources,item.img,null)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        val binding : ItemTutorialViewBinding = ItemTutorialViewBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


}

data class TutorialModel(val img:Int, val description: String )