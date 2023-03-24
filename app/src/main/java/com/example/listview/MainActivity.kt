package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val lugares = arrayOf("tequila","magdalena","arenal ","guadalajara","guzman","sayula","vallarta","amatitan","zacoalco","chetumal","san jose","hostotipaquillo","tala")
   lateinit var mostrartexto :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mostrartexto = findViewById(R.id.mostrartexto)

        val listView: ListView= findViewById(R.id.List_View_Lugares)
    val adaptador = ArrayAdapter(this,R.layout.list_item,lugares)

        listView.adapter = adaptador

        listView.onItemClickListener = object:AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, posicion: Int, p3: Long) {

                val item = listView.getItemAtPosition(posicion) as String
                Log.e("valor Lista",item)
                Toast.makeText(applicationContext,"El valor es $item",Toast.LENGTH_LONG).show()
                when(posicion) {
                    0 -> {
                        mostrartexto.setText("Selecciono tequila")
                    }
                    1 -> {
                        mostrartexto.setText("Selecciono magdalena")
                    }
                    2 -> {
                        mostrartexto.setText("Selecciono arenal")

                    }
                    3 -> {
                        mostrartexto.setText("Selecciono guadalajara ")
                    }
                    4 -> {
                        mostrartexto.setText("Selecciono guzman ")
                    }
                    5 -> {
                        mostrartexto.setText("Selecciono sayula")

                    }
                    6 -> {
                        mostrartexto.setText("selecciono vallarta")


                    }
                    7-> {
                        mostrartexto.setText("Selecciono amatitan ")
                    }
                    8 -> {
                        mostrartexto.setText("Selecciono zacoalco")
                    }
                    9 -> {
                        mostrartexto.setText("Selecciono chetumal")
                    }
                    10 -> {
                        mostrartexto.setText("Selecciono san jose")
                    }
                    11 -> {

                        mostrartexto.setText("Selecciono hostotipaquillo")
                    }
                        12 ->{
                            mostrartexto.setText("Selecciono tala")

                        }
                    }
                }
            }

        }
    }
