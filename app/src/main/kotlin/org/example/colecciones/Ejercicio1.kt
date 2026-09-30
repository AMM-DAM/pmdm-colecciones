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

    // hay una de series que no tengo. no he hecho ninguna entrega con series?

    val diasPorMes = mapOf(
        "Enero" to 31, "Febrero" to 28, "Marzo" to 31, "Abril" to 30, "Mayo" to 31, "Junio" to 30,
        "Julio" to 31, "Agosto" to 31, "Septiembre" to 30, "Octubre" to 31, "Noviembre" to 30,
        "Diciembre" to 31
    )

    val menuPorDia = mutableListOf(
        "Lunes" to "Ensalada, pasta, papas fritas",
        "Martes" to "Ensalada, pasta, papas fritas",
        "Miércoles" to "Ensalada, pasta, papas fritas",
        "Jueves" to "Ensalada, pasta, papas fritas",
        "Viernes" to "Ensalada, pasta, papas fritas",
    )

    val keywordsPorVersion = mutableListOf(
        "33.2" to "var val fun",
        "34.0" to "var val fun static final"
    )
}