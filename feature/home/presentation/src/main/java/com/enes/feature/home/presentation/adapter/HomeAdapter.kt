package com.enes.feature.home.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enes.feature.home.domain.entity.DataEntity
import com.enes.feature.home.domain.entity.ResultEntity
import com.enes.feature.home.presentation.databinding.ItemHomeBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewExchangeHolder>() {
    private var list: List<DataEntity> = emptyList()

    inner class ViewExchangeHolder(private val binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: DataEntity) = with(binding) {
            title.text = item.name
            currency.text = item.calculatedstr
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewExchangeHolder {
        return ViewExchangeHolder(
            ItemHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewExchangeHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }
    fun submitList(newList: List<DataEntity>) {
        list = newList
        notifyDataSetChanged()
    }
}