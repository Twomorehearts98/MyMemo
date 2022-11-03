package org.techtown.memo

import android.app.Activity
import android.os.Bundle
import org.techtown.memo.databinding.ActivitySelectBinding

class SelectActivity : Activity() {
    private lateinit var binding: ActivitySelectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<Data>()
        list.add(Data( "1", "name 1"))

        val adapter = DataRVAdapter(list)
        binding.lstMemo.adapter = adapter
    }

}