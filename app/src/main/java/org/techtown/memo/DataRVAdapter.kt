package org.techtown.memo
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.memo.databinding.ListviewItemBinding

class DataRVAdapter(private val datalist:ArrayList<Data>): RecyclerView.Adapter<DataRVAdapter.DataViewHolder>() {
    inner class DataViewHolder(private val viewBinding: ListviewItemBinding):RecyclerView.ViewHolder(viewBinding.root){
        fun bind(data: Data){
            viewBinding.tvTitle.text = data.title
            viewBinding.tvMemo.text = data.memo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val viewBinding = ListviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(datalist[position])
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}