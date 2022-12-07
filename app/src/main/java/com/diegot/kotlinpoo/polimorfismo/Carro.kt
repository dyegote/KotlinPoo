package com.diegot.kotlinpoo.polimorfismo

class Carro : Transporte() {

    override fun avanzar() {
        println("Andar")
    }
}