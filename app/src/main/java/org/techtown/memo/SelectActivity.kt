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
        setContentView(binding.root)

        val list : ArrayList<Data> = arrayListOf()
        list.apply {
            add(Data("hello", "1"))
            add(Data("hello", "2"))
            add(Data("hello", "3"))
            add(Data("hello", "4"))
            add(Data("hello", "5"))
            add(Data("hello", "6"))
            add(Data("hello", "7"))
            add(Data("hello", "8"))
            add(Data("hello", "9"))
            add(Data("hello", "10"))
            add(Data("hello", "11"))
            add(Data("hello", "12"))
            add(Data("hello", "13"))
            add(Data("hello", "14"))
            add(Data("hello", "15"))
            add(Data("hello", "16"))
            add(Data("hello", "17"))
            add(Data("hello", "18"))
            add(Data("hello", "19"))
            add(Data("hello", "20"))
            add(Data("hello", "21"))
            add(Data("hello", "22"))
            add(Data("hello", "23"))
            add(Data("hello", "24"))
            add(Data("hello", "25"))
            add(Data("hello", "26"))
            add(Data("hello", "27"))
            add(Data("hello", "28"))
            add(Data("hello", "29"))
            add(Data("hello", "30"))
        }
        val adapter = DataRVAdapter(list)

        binding.lstMemo.adapter = adapter
        binding.lstMemo.layoutManager = LinearLayoutManager(this)
    }

}