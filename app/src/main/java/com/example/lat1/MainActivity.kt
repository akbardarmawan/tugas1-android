package com.example.lat1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnAlert = findViewById<Button>(R.id.btn)

        btnAlert.setOnClickListener{
            val artDialogBuilder = AlertDialog.Builder(this@MainActivity)

            artDialogBuilder.setMessage("Apakah Anda Yakin?")
            artDialogBuilder.setTitle("Keluar?")
            artDialogBuilder.setCancelable(false)
            artDialogBuilder.setPositiveButton("yes"){_,_->
                finish()
            }

            artDialogBuilder.setNegativeButton("Tidak Jadi!"){_,_->
                Toast.makeText(this@MainActivity, "Tidak", Toast.LENGTH_SHORT).show()
            }

            artDialogBuilder.setNeutralButton("Cancel"){_,_->
                Toast.makeText(this@MainActivity, "Klik Cancel", Toast.LENGTH_SHORT).show()
            }
        val alertDialogBox = artDialogBuilder.create()
            alertDialogBox.show()
        }
    }
}