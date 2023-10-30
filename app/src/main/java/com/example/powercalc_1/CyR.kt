package com.example.powercalc_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.powercalc_1.databinding.ActivityCyRBinding
import com.example.powercalc_1.databinding.ActivityVyCBinding

class CyR : AppCompatActivity() {

    private lateinit var binding: ActivityCyRBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityCyRBinding.inflate(layoutInflater) //Permite el View Binding, viene en binding
        setContentView(binding.root) //Mapeo a Resources

        binding.buttonCyR.setOnClickListener{
            if(binding.caja1resistencia.text.isNotEmpty()){
                if(binding.caja2Corriente.text.isNotEmpty()){
                    val numero1 = binding.caja1resistencia.text.toString().toFloat()
                    val numero2= binding.caja2Corriente.text.toString().toFloat()
                    val resultado = numero1*numero2*numero2
                    binding.buttonResultadoRyC.text = "$resultado"
                }
                else{
                    binding.caja2Corriente.error = resources.getString(R.string.error1)
                }
            }else{
                binding.caja1resistencia.error = resources.getString(R.string.error1)
            }

        }


        //setContentView(R.layout.activity_cy_r)
    }
}