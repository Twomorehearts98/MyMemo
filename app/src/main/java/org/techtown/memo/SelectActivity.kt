package org.techtown.memo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import org.techtown.memo.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)

        val list : ArrayList<Data> = arrayListOf()
        list.apply {
            add(Data("hello","1"))
            add(Data("hello","2"))
            add(Data("hello","3"))
            add(Data("hello","4"))
        }
        val adapter = DataRVAdapter(list)
        var title = intent.getStringExtra("Data2")
        var memo = intent.getStringExtra("Data")
        list.apply{
            add(Data(title.toString(), memo.toString()))
        }
        adapter.notifyItemInserted(list.size)
        binding.lstMemo.adapter = adapter
        binding.lstMemo.layoutManager = LinearLayoutManager(this)
        setContentView(binding.root)

    }

}