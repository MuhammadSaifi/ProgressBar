package com.example.progressbar

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.postDelayed
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prg=ProgressDialog(this)
        prg.setMessage("Opening..")
        prg.setCancelable(false)
        prg.show()
        Handler().postDelayed({prg.dismiss()},5000)
        setContentView(R.layout.second)
    }
}
