package com.example.powercalc_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.powercalc_1.databinding.ActivityMenuBinding
import com.example.powercalc_1.databinding.ActivityVyCBinding

class VyC : AppCompatActivity() {
    private lateinit var binding: ActivityVyCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityVyCBinding.inflate(layoutInflater) //Permite el View Binding, viene en binding
        setContentView(binding.root) //Mapeo a Resources

        binding.buttonVyC.setOnClickListener{
            if(binding.caja1voltaje.text.isNotEmpty()){
                if(binding.caja2Corriente.text.isNotEmpty()){
                        val numero1 = binding.caja1voltaje.text.toString().toFloat()
                        val numero2= binding.caja2Corriente.text.toString().toFloat()
                        val resultado = numero1*numero2
                        binding.buttonResultadoVyC.text = "$resultado"
                    }
                else{
                    binding.caja2Corriente.error = resources.getString(R.string.error1)
                }
            }else{
                binding.caja1voltaje.error = resources.getString(R.string.error1)
            }

        }
       // setContentView(R.layout.activity_vy_c)
    }
}