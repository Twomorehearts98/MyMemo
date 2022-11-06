package org.techtown.memo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import org.techtown.memo.databinding.ActivitySelectBinding
import org.techtown.memo.databinding.ActivityShowBinding
import java.util.*
import kotlin.collections.ArrayList

class ShowActivity :AppCompatActivity(){
    lateinit var binding2: ActivityShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding2.root)
        binding2.txtSecond.text = intent.getStringExtra("Data")
        binding2.button3.setOnClickListener {
            var intent2 = Intent(this, SelectActivity::class.java)
            intent.putExtra("title",intent.getStringExtra("Data2").toString())
            intent.putExtra("memo", intent.getStringExtra("Data").toString())
            startActivity(intent2)
        }
        }


    }
