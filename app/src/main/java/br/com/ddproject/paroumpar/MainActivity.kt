package br.com.ddproject.paroumpar

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = button as Button

        btn.setOnClickListener {
            var numero = editTextNumber.text.toString().toInt()
            var calcular = Calcular(numero)
            textView.text = calcular.toString()
        }
    }

    fun Calcular(numero: Int): String{

        if(numero %2 == 0){
            return "Numero é par"
        }else{
            return "Numero é ímpar"
        }
    }
}