package com.akirachix.androidassesmemt


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpensesAdapter(val moneySpendList: List<MoneySpend>) :
    RecyclerView.Adapter<ExpenceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenceViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.icons_item_view, parent, false)
        return ExpenceViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return moneySpendList.size
    }

    override fun onBindViewHolder(holder: ExpenceViewHolder, position: Int) {
        val expense = moneySpendList[position]
        holder.tvName.text = expense.name
        holder.tvPrice.text = expense.price.toString()
        holder.tvDate.text = expense.date





    }


}

class ExpenceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPrice = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)



}