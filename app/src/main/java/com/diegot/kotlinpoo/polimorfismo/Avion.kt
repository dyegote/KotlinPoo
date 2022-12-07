package com.diegot.kotlinpoo.polimorfismo

class Avion : Transporte() {

    override fun avanzar() {
        println("Volar")
    }
}