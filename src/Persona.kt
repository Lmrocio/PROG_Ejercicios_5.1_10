open class Persona(
    val nombre: String,
    val edad: Int
) {

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }

    fun celebrarCumple(): String {
        val nuevaEdad = edad + 1
        return "Feliz cumpleaños $nombre! Ahora tienes $nuevaEdad años."
    }
}