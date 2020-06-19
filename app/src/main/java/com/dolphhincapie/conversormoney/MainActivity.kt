package com.dolphhincapie.conversormoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        bt_convertir.setOnClickListener {
            val valor1 = sp_moneda1.selectedItem.toString()
            val valor2 = sp_moneda2.selectedItem.toString()
            val moneda = et_valoring.text.toString()


            if (valor1 == "USD - US Dólar") {
                iv_mon1.setImageResource(R.mipmap.ic_usa_foreground)
            }
            else if(valor1 == "EUR - Euro") {
                iv_mon1.setImageResource(R.mipmap.ic_europa_foreground)
            }
            else if (valor1 == "COP - Peso Colombiano"){
                iv_mon1.setImageResource(R.mipmap.ic_colombia_foreground)
            }

            if (valor2 == "USD - US Dólar") {
                iv_mon2.setImageResource(R.mipmap.ic_usa_foreground)
            }
            else if(valor2 == "EUR - Euro") {
                iv_mon2.setImageResource(R.mipmap.ic_europa_foreground)
            }
            else if (valor2 == "COP - Peso Colombiano") {
                iv_mon2.setImageResource(R.mipmap.ic_colombia_foreground)
            }

            if (valor1 == "USD - US Dólar") {
                if (valor2 == "EUR - Euro") {
                    tv_resultado.text = "$moneda USD = " + (moneda.toDouble() * 0.89).toString() + " EUR"
                } else if (valor2 == "COP - Peso Colombiano") {
                    tv_resultado.text = "$moneda USD = " + (moneda.toDouble() * 3747.79).toString() + " COP"
                } else {
                    tv_resultado.text = "$moneda USD = " + (moneda.toDouble()).toString() + " USD"
                }

            }
            else if(valor1 == "EUR - Euro") {
                if (valor2 == "USD - US Dólar") {
                    tv_resultado.text = "$moneda EUR = " + (moneda.toDouble() * 1.12).toString() + " USD"
                } else if (valor2 == "COP - Peso Colombiano") {
                    tv_resultado.text = "$moneda EUR = " + (moneda.toDouble() * 4215.12).toString() + " COP"
                } else {
                    tv_resultado.text = "$moneda EUR = " + (moneda.toDouble()).toString() + "EUR"
                }
            }
            else{
                if (valor2 == "USD - US Dólar") {
                    tv_resultado.text = "$moneda COP = " +(moneda.toDouble() * 0.00027).toString() + " USD"
                } else if (valor2 == "EUR - Euro") {
                    tv_resultado.text = "$moneda COP = " +(moneda.toDouble() * 0.00024).toString() + " EUR"
                } else {
                    tv_resultado.text = "$moneda COP = " +(moneda.toDouble()).toString() + " COP"
                }
            }


        }
    }

}