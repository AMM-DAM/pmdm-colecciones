package org.example.colecciones

class InventarioException : Exception("Problema de invetario")

object GestionInventario {
    private val productos: MutableMap<String, Int> = mutableMapOf()
}