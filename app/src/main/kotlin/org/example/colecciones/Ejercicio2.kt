package org.example.colecciones

class InventarioException(mensaje: String) : Exception(mensaje)

object GestionInventario {
    private val productos: MutableMap<String, Int> = mutableMapOf()

    fun validarNombreYCantidad(nombre: String, cantidad: Int) {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío" }
        require(cantidad > 0) { "La cantidad debe ser mayor que 0" }
    }

    fun agregarProducto(nombre: String, cantidad: Int) {
        validarNombreYCantidad(nombre, cantidad)

        if (nombre in productos) {
            throw InventarioException("Producto ya existe")
        }

        productos[nombre] = cantidad
    }

    fun agregarStock(nombre: String, cantidad: Int) {
        validarNombreYCantidad(nombre, cantidad)

        if (nombre !in productos) {
            throw InventarioException("Producto no existe")
        }

        productos[nombre] = productos.getValue(nombre) + cantidad
    }

    fun eliminarProducto(nombre: String) {
        productos.remove(nombre) ?: throw InventarioException("Producto no existe")
    }

    fun mostrarInventario() {
        productos.forEach { (nombre, cantidad) ->
            println("$nombre: $cantidad")
        }
    }
}

fun preguntaNombre(): String {
    print("Introduce nombre producto: ")
    return readlnOrNull() ?: ""
}

fun preguntaCantidad(): Int {
    print("Introduce cantidad: ")
    return readlnOrNull()?.toIntOrNull() ?: 0
}

fun menuInventario() {
    var salir = false

    do {
        println(
            """
            1. Añadir producto
            2. Modificar stock
            3. Eliminar producto
            4. Salir
            """.trimIndent()
        )

        when (readlnOrNull()) {
            "1" -> GestionInventario.agregarProducto(preguntaNombre(), preguntaCantidad())
            "2" -> GestionInventario.agregarStock(preguntaNombre(), preguntaCantidad())
            "3" -> GestionInventario.eliminarProducto(preguntaNombre())
            "4" -> salir = true
            else -> println("Opcion no valida. Vuelva a intentarlo.")
        }
    } while (!salir)
}

fun main() {
    menuInventario()

    GestionInventario.mostrarInventario()
}