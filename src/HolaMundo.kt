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
       // println(i)
    }
    println()

    //val aToC = 'A'..'C'
    for (letra in 'A'..'C'){
       // println(letra)
    }

    /**
     * Lectura por consola
     */

    println("What's your name?")
    //val name= readLine()
    //println("Hello $name!")


    /**
     * Implementando el método downTo para hacer un conteo regresivo
     */
    for ( count in 10 downTo 0){
        //println(count)
    }

    var i = 1

    /**
     * Ciclos while y do-while
     */

    while ( i < 1 ){
        true or false
        println("mensaje: $i")
        ++i
    }

    do {
        println("mensaje do while: $i")
        i++
    } while ( i <= 1)

    /**
     * Iterando listas con for y FOREACH, además de capturar el index de cada
     * elemento de la lista
     */

    val monthsOfYear = listOf("Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre")
//    for(month in monthsOfYear){
//        println(month)
//    }

    for ((index, month) in monthsOfYear.withIndex()){
        println("$index: $month")
    }

    //monthsOfYear.forEach { println(it) }

    /**
     *Break, Continue y Labels
     */

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) continue
            println("j: $j")
            println("Woohoo")
        }
    }

//    var count = 1
//    for ( month in monthsOfYear){
//
//        println("$count siuuu ...")
//        count++
//        for (i in 'a'..'e'){
//            if (i.equals('c')){
//                continue
//            }
//            println("$i")
//        }
//    }

    escaparJ@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue@escaparJ
                println("k: $k")
            }
        }
    }

    terminarTodoCiclo@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break@terminarTodoCiclo
                println("k: $k")
            }
        }
    }

//    var msg: String?
//    msg = null
//    try {
//        println(msg!!.length)
//    } catch (IOException e){
//        println(null)
//    }



    /*try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    }catch (e: NullPointerException){
        println("Ingresa un valor, no aceptamos valores nulos")
    }*/

    //llamada segura
    var compute: String? = null
    var longitud: Int? = compute?.length // null
    println("longitud: $longitud")


    /**
     * Operador Elvis
     */

    var teclado: String? = null
    var longitudTeclado: Int = teclado?.length ?: 0
    println("Longitud Teclado: $longitudTeclado")

    val listWithNulls: List<Int?> = listOf<Int?>(7,null,null,4)
    println("Lista con Null: $listWithNulls")

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithoutNulls)

    /**
     * Arrays
     */

    val countries = arrayOf("India", "Mexico", "Colombia", "Chile", "Peru")

    val days = arrayOf<String>("Lunes", "Martes", "Miercoles")

    val numbers = intArrayOf(6,9,19,10,12)
    var sum = 0
    for (num in numbers){
        sum += num
    }
    val average = sum / numbers.size
    println("Promedio: $average")
}









