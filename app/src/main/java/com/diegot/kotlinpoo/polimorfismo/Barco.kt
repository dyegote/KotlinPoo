package com.diegot.kotlinpoo.polimorfismo

class Barco : Transporte() {

    override fun avanzar() {
        println("Flotar")
    }
}