package com.diegot.kotlinpoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegot.kotlinpoo.polimorfismo.Avion
import com.diegot.kotlinpoo.polimorfismo.Barco
import com.diegot.kotlinpoo.polimorfismo.Carro
import com.diegot.kotlinpoo.polimorfismo.Transporte

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun polimorfismo() {
        /*Variable polimorfica
        Un objeto de la clase padre, puede almacenar cualquier objeto de las clases hijas*/
        var transporte: Transporte = Transporte()
        transporte = Avion()
        transporte = Barco()
        transporte = Carro()

        /*Posibilidad de enviar mensajes iguales (invocar al mismo metodo)
        desde distintos ojetos, que responden al mensaje de manera distinta*/
        val avion = Avion()
        avion.avanzar() //Volar
        val barco = Barco()
        barco.avanzar() //Flotar
        val carro = Carro()
        carro.avanzar() //Andar
    }
}