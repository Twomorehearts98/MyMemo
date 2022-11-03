package org.techtown.memo


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DataRVAdapter(private val items:ArrayList<Data>): RecyclerView.Adapter<DataRVAdapter.ViewHolder>() {
    override fun getItemCount(): Int = items.size
    override fun onBindViewHolder(holder: DataRVAdapter.ViewHolder, position: Int) {
        val item = items[position]
        val listener = View.OnClickListener {
            Toast.makeText(
                it.context,
                "Clicked -> title : ${item.title}, memo : ${item.memo}",
                Toast.LENGTH_SHORT
            ).show()
        }
        holder.apply {
            bind(listener, item)
            itemView.tag=item
        }
    }

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int): ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.listview_item, parent,false)
        return DataRVAdapter.ViewHolder(inflatedView)
    }
    class ViewHolder(v: View):RecyclerView.ViewHolder(v){
        private var view:View=v
        fun bind(listener: View.OnClickListener, item:Data){

            view.setOnClickListener(listener)
        }
    }




}