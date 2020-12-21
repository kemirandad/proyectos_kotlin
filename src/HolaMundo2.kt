fun main() {
    /**
     * Anonymous functions
     * val nameVariable = fun(parameters: TypeParameters): TypeReturn = Body
     */
    val filter = fun(x : Int) : Boolean = x < 2
    println(filter(5))

    /**
     * Lambdas expressions
     * val nameVariable: TypeParameters -> TypeDataReturn = { body }
     * val nameVariable = { parameters: TypeParameters -> body }
     */
    val filter1 : (Int) -> Boolean = { it < 2 }
    println(filter1(-1))

    //Other form
    val filter2 = { x: Int -> x < 2 }
    println(filter2(0))

    println()
    do {
        println("Ingrese el primer valor...")
        val num1 = readLine()?.toDouble()
        println("Ingrese el segundo valor...")
        val num2 = readLine()?.toDouble()
        println("Ingrese el tercer valor...")
        val num3 = readLine()?.toDouble()
        println("""
            Elija una operación:
            1. suma
            2. resta
            3. multiplicación
            4. división
            5. Salir
        """.trimIndent())
        val condicion = readLine().toString()
        when(condicion){
            "1" -> println("$num1 + $num2 + $num3 = ${calculadora(num1!!, num2!!, num3!!, ::sumar)}")
            "2" -> println("$num1 - $num2 - $num3 = ${calculadora(num1!!, num2!!, num3!!, ::restar)}")
            "3" -> println("$num1 * $num2 * $num3 = ${calculadora(num1!!, num2!!, num3!!, ::multiplicar)}")
            "4" -> println("$num1 / $num2 / $num3 = ${calculadora(num1!!, num2!!, num3!!, ::dividir)}")
            "5" -> println("Regrese pronto")
            else -> println("Opción no disponible")
        }
    }while (!condicion.equals("5"))

}

fun calculadora(a: Double, b: Double, c:Double, operar:(Double, Double, Double) -> Double): Double{
    return operar(a, b, c)
}
fun sumar(x: Double, y: Double, z: Double) = x.plus(y).plus(z)
fun restar(x: Double, y: Double, z: Double) = x.minus(y).minus(z)
fun multiplicar(x: Double, y: Double, z: Double) = x.times(y).times(z)
fun dividir(x: Double, y: Double, z: Double) = x.div(y).div(z)