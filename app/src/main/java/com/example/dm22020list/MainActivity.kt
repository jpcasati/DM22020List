package com.example.dm22020list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var lista: ArrayList<Pessoa> = ArrayList<Pessoa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        lista.add(Pessoa("João", "ADS"))
        lista.add(Pessoa("Maria", "GTI"))
        lista.add(Pessoa("Paulo", "ADS"))
        lista.add(Pessoa("Aline", "ADS"))
        lista.add(Pessoa("Pedro", "GTI"))
        lista.add(Pessoa("José", "ADS"))

        val adp = ArrayAdapter(this, android.R.layout.simple_list_item_1, lista)

        lstPessoas.adapter = adp


        lstPessoas.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "O item clicado é: "+ lista.get(position), Toast.LENGTH_LONG).show()

        }

        lstPessoas.setOnItemLongClickListener { parent, view, position, id ->

            Toast.makeText(this, "Item: " + lista.get(position) + ", removido!", Toast.LENGTH_LONG).show()

            lista.remove(lista.get(position))

            atualizarLista()
        }

    }

    fun atualizarLista(): Boolean {

        val adp = ArrayAdapter(this, android.R.layout.simple_list_item_1, lista)

        lstPessoas.adapter = adp

        return true
    }
}
