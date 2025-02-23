class Gerente(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    porcentajeImpuestos: Double = 33.99,
    val bonus: Double,
    val exentoImpuestos: Boolean = false
) : Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    override fun calcularSalario(): Double {
        val salarioConBonus = salarioBase + bonus
        return if (exentoImpuestos) salarioConBonus else salarioConBonus * (1 - porcentajeImpuestos / 100)
    }


    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus€"
    }


    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}