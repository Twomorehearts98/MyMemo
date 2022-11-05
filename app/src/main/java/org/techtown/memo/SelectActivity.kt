package org.techtown.memo

import android.app.Activity
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

        }
        val adapter = DataRVAdapter(list)
        setContentView(binding.root)

        binding.lstMemo.adapter = adapter
        binding.lstMemo.layoutManager = LinearLayoutManager(this)
    }
//https://ms3864.tistory.com/3
}