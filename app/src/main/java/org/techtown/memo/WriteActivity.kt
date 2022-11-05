package org.techtown.memo

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import org.techtown.memo.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity(){
    private lateinit var binding : ActivityWriteBinding
    private lateinit var save : Editable
    private lateinit var save2 : Editable
    override fun onCreate(SavedInstanceState: Bundle?){
        super.onCreate(SavedInstanceState)
        binding = ActivityWriteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        save = binding.editMain.text
        save2 = binding.editTitle.text
        binding.btnSelect.setOnClickListener{
            val intent = Intent(this, SelectActivity::class.java)
            intent.putExtra("Data", save.toString())
            intent.putExtra("Data2", save2.toString())

            startActivity(intent)
        }

    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        save = binding.editMain.text
        save2 = binding.editTitle.text
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()

    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
        showDialog()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
    private fun showDialog()
    {
        val dialog = AlertDialog.Builder(this)
        dialog.setTitle("메모")
            .setMessage("이어서 작성하시겠습니까?")
            .setPositiveButton("예") {dialog, which ->
                binding.editTitle.text = save2
                binding.editMain.text = save

            }
            .setNegativeButton("아니오") {dialog,which ->
                binding.editTitle.text.clear()
                binding.editMain.text.clear()
                save.clear()
                save2.clear()
            }
            .create()
            .show()
    }
}
