package com.example.powercalc_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.powercalc_1.databinding.ActivityVyCBinding
import com.example.powercalc_1.databinding.ActivityVyRBinding

class VyR : AppCompatActivity() {

    private lateinit var binding: ActivityVyRBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vy_r)

        binding= ActivityVyRBinding.inflate(layoutInflater) //Permite el View Binding, viene en binding
        setContentView(binding.root) //Mapeo a Resources

        binding.buttonVyR.setOnClickListener{
            if(binding.caja1resistencia.text.isNotEmpty()){
                if(binding.caja2Voltaje.text.isNotEmpty()){
                    val numero1 = binding.caja1resistencia.text.toString().toFloat()
                    if(numero1==(0.toFloat())){
                        binding.caja1resistencia.error = resources.getString(R.string.error2)
                    }else {
                        val numero2 = binding.caja2Voltaje.text.toString().toFloat()
                        val resultado = (numero2*numero2)/numero1
                        binding.buttonResultadoVyR.text = "$resultado"
                    }

                }
                else{
                    binding.caja2Voltaje.error = resources.getString(R.string.error1)
                }
            }else{
                binding.caja1resistencia.error = resources.getString(R.string.error1)
            }

        }

    }
}