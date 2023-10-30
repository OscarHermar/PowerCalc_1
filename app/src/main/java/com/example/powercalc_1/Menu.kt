package com.example.powercalc_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.powercalc_1.databinding.ActivityMenuBinding

class Menu : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMenuBinding.inflate(layoutInflater) //Permite el View Binding, viene en binding

        setContentView(binding.root) //Mapeo a Resources

        binding.ActivityRyC.setOnClickListener{
            startActivity(Intent(this,CyR::class.java)) //te envia al otro activity RyC
            }

        binding.ActivityVyC.setOnClickListener{
            startActivity(Intent(this,VyC::class.java)) //te envia al otro activity VyC
        }

        binding.ActivityVyR.setOnClickListener{
            startActivity(Intent(this, VyR::class.java))  //te envia al otro activity VyR
        }
    }
}