package com.example.taller_fibonacci.Controlador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.taller_fibonacci.Modelo.Fibonacci
import com.example.taller_fibonacci.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_fibonacci.text = "Presione el botòn para la secuencia"
        var contador = 0
        var acumu: String

        btn_fibonacci.setOnClickListener{
            acumu = tv_fibonacci.text.toString()
            contador++
            tv_fibonacci.text = acumu + Fibonacci().get_fibonacci(contador) + '\n'

        }

    }
}
