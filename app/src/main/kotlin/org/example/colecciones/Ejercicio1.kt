package org.example.colecciones

data class Articulo(val nombre: String, val cantidad: Int)

fun main() {
    val provincias = listOf(
        "Álava", "Albacete", "Alicante", "Almería", "Asturias", "Ávila", "Badajoz", "Barcelona",
        "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "Cuenca",
        "Girona", "Granada", "Guadalajara", "Gipuzkoa", "Huelva", "Huesca", "Illes Balears", "Jaén",
        "La Rioja", "Las Palmas", "León", "Lleida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra",
        "Ourense", "Palencia", "Pontevedra", "Salamanca", "Santa Cruz de Tenerife", "Segovia",
        "Sevilla", "Soria", "Tarragona", "Teruel", "Toledo", "Valencia", "Valladolid", "Bizkaia",
        "Zamora", "Zaragoza", "Ceuta", "Melilla"
    )

    val historialSalario = DoubleArray(12)

    val gruposMusicales = Array(5) { "" }

    val carrito = mutableListOf<Articulo>()

    val meses = arrayOf(
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    )

    val usuariosAsociacion = mutableMapOf<String, String>()


}