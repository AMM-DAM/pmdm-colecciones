package org.example.colecciones

data class Pelicula(
    val titulo: String, val genero: String,
    val duracion: Int, val director: String
)

val peliculas = listOf(
    Pelicula("Dune", "Ciencia Ficción", 155, "Denis Villeneuve"),
    Pelicula("El viaje de Chihiro", "Animación", 125, "Hayao Miyazaki"),
    Pelicula("La la land", "Musical", 128, "Damien Chazelle"),
    Pelicula("Mad Max: Fury Road", "Acción", 120, "George Miller"),
    Pelicula("Parasite", "Thriller", 132, "Bong Joon-ho"),
    Pelicula("Pride and Prejudice", "Romance", 128, "Joe Wright"),
    Pelicula("Shrek", "Animación", 90, "Andrew Adamson")
)

fun listadoPeliculas() {
    println("--- Listado peliculas ---")
    println(peliculas.joinToString { "\n$it" })
}

fun buscarPeliculaTitulo() {
    println("--- Buscar pelicula por titulo ---")
    print("Introduce un titulo: ")
    val entrada = readlnOrNull() ?: ""
    val peliculasConTitulo =
        peliculas.filter { it.titulo.lowercase().contains(entrada.lowercase()) }

    println(peliculasConTitulo.joinToString { "\n$it" })
}

fun peliculaConGenero() {
    println("--- Peliculas con genero Romance ---")
    val peliculasConGenero = peliculas.filter { it.genero == "Romance" }
    println(peliculasConGenero.joinToString { "\n$it" })
}

fun peliculaMasLarga() {
    println("--- Pelicula mas larga ---")
    val peliculaMasLarga = peliculas.sortedBy { it.duracion }.first()
    println(peliculaMasLarga)
}

fun separaPeliculas120mins() {
    println("--- +120 mins ---")
    val peliculasMas120 = peliculas.filter { it.duracion >= 120 }
    println(peliculasMas120.joinToString { "\n$it" })

    println("--- -120 mins ---")
    val peliculaMenos120 = peliculas.filter { it.duracion < 120 }
    println(peliculaMenos120.joinToString { "\n$it" })
}

fun main() {
    var salir = false

    do {
        println(
            """
                1. Listar peliculas 
                2. Buscar peliculas por titulo
                3. Listar peliculas con genero concreto
                4. Mostrar pelicula mas larga
                5. Listar peliculas separardas por longitud 120 minutos
                6. Salir
            """.trimIndent()
        )

        print("Introduce una opcion: ")

        when (readlnOrNull()) {
            "1" -> listadoPeliculas()
            "2" -> buscarPeliculaTitulo()
            "3" -> peliculaConGenero()
            "4" -> peliculaMasLarga()
            "5" -> separaPeliculas120mins()
            "6" -> salir = true
            else -> println("Opcion no valida. Vuelva a intentarlo.")
        }
    } while (!salir)
}