package org.techtown.memo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.techtown.memo.databinding.ActivitySelectBinding

class ShowActivity :AppCompatActivity(){
    lateinit var binding : ActivitySelectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)
        val list : ArrayList<Data> = arrayListOf()
        list.apply {
            add(Data(intent.getStringExtra(("Data2")).toString(),intent.getStringExtra("Data").toString()))
        }
        setContentView(binding.root)

    }
}