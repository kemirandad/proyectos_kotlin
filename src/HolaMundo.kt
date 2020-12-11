//const tiempo de compilación
const val N = "NAME" // variables manera global
var n = "n" //mala practica de programación
val n2 = "n" //variables local tiempo de ejecución

//Funciones Puras
fun main(args: Array<String>) {
    println("Hola Mundo")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    //val name: String = args[0]  //tiempo de ejecución
    //println(name)
    println(N)

    val nombre = "Anahí"

    /**
     * Tipando variables (opcional)
     */
    val apellido: String = "Salgado"

    println()
    println("Tu nombre es: " + nombre)
    /**
     * Redactando salidas de forma mas natural
     */
    println("Tu nombre es: $nombre $apellido ")

    val nombreApellido = "Kenny\t\tMiranda"
    println()
    println("Tu nombre es: $nombreApellido")
    println()

    //Raw String
    val parrafo = """
        ***Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
        ***Sed varius tristique fringilla. Maecenas dui odio, 
        ***suscipit non finibus in, lacinia a turpis. Orci varius 
        ***natoque penatibus et magnis dis parturient montes, 
        ***nascetur ridiculus mus. Mauris sed urna urna. 
        ***Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
        ***Nullam pretium ipsum vel enim ultrices, at mollis ipsum bibendum. 
        ***In hac habitasse platea dictumst. Vivamus sit amet tincidunt lorem,
        ***vel volutpat neque. Ut vehicula lorem erat, quis condimentum sem 
        ***egestas et. Vivamus porta arcu eget sem elementum, quis placerat 
        ***neque tristique. Fusce feugiat, mi id aliquet ullamcorper, orci 
        ***magna consectetur sapien, vel rhoncus leo magna nec nisl.
    """.trimIndent()

    println(parrafo.trimMargin("***"))

    /**
     * Conversiones de datos
     */
    println()
    val num1: Int = 50

    val num2: Long = num1.toLong()
    println(num2)

    val char1: Char = 'd'
    val cadena1: String = "Hola"
    cadena1.toCharArray()
    println(cadena1)

    /**
     * Operador rango
     */

    val oneToHundred = 1..10
    println()
    for ( i in oneToHundred ){
        println(i)
    }
    println()

    //val aToC = 'A'..'C'
    for (letra in 'A'..'C'){
        println(letra)
    }

    /**
     * Lectura por consola
     */

    println("What's your name?")
    val name= readLine()
    println("Hello $name!")
}








