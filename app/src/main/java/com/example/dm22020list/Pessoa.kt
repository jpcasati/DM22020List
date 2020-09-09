package com.example.dm22020list

data class Pessoa(val nome: String, val curso: String) {

    override fun toString(): String {
        return nome + " / " + curso
    }
}