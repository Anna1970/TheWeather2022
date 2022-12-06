package ru.naa.theweather2022.Model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import ru.naa.theweather2022.Data.City
import ru.naa.theweather2022.R
import ru.naa.theweather2022.databinding.CityItemBinding

class CityListAdapter: RecyclerView.Adapter<CityViewHolder>() {
    var list = mutableListOf<City?>()

    fun updateList(list:MutableList<City?>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        return CityViewHolder(LayoutInflater.from(parent.context).inflate( R.layout.city_item,parent, false))
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.binding.city = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class CityViewHolder(itemView: View): ViewHolder(itemView) {
    val binding = CityItemBinding.bind(itemView)
}