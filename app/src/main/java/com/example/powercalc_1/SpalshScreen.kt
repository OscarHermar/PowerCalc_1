package com.example.powercalc_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class SpalshScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)

        thread{
            Thread.sleep(3000)
            val intent = Intent(this, Menu::class.java)
            startActivity(intent) //te envia al otro activity
            finish()
         }

    }
}