import model.Camera
import model.Movie
import model.Shoe

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
    /*for (num in numbers){
        sum += num
    }
    val average = sum / numbers.size
    println("Promedio: $average")
    */

    /**
     * Otra forma
     */
    for (num in numbers) { sum = sum.plus(num) }
    println(sum)
    println(numbers.average())
    println("Promedio: ${sum.div(numbers.size)}")


    /**
     *Métodos útiles de los arrays objetos
     */

    var arrayObject = arrayOf(5,6,7,8)
    var intPrimitive : IntArray = arrayObject.toIntArray()

    val suma = arrayObject.sum()
    println("La suma del array es: $suma")
    arrayObject = arrayObject.plus(4)
    for (a in arrayObject) { println("Elementos del array: $a") }

    arrayObject = arrayObject.reversedArray()
    for (a in arrayObject) { println("Array reversa $a") }

    arrayObject.reverse()
    for (a in arrayObject) { println("Array reversa $a") }

    /**
     * Expresiones vs valores
     */

    var x = 5
    println("X es igual a 5? ${x==5}") // Return un booleano true

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")

    /**
     * Funciones
     */

    //val valor = readLine()?.toDouble()
    //println("\nRaíz cuadrada de $valor es igual a : ${sqrt(valor!!)}")

    val numbers2 = intArrayOf(6, 6, 7 ,10, 15, 12)
    println("\nEl promedio de los números es: ${averageNumbers(numbers2)}")

    println("\nEl promedio2 de los números es: " +
            "${averageNumbers2(intArrayOf(1,2,5,3,2,1))}")

    println("${evaluate(number = 6)}")

    /**
     * Lambdas
     */

    //val hola = { println("Hola mundo")}()
    //hola()

    fun random(): Int {
        return (Math.random() * 100).toInt()
    }

    val random1 = random()
    val random2 = {random()}

    println("\n"+random1)
    println(random2)
}

fun evaluate(chararter: Char= '=', number: Int = 2): String{
    return "$number es $chararter a 2"
    /**
     * Funciones lambdas
     */

    //lambdas

    val hola = { println("\nHola mundo") }
    hola()

    //val suma = {instrucciones -> sentencias}
    val plus = {a: Int, b: Int, c: Int -> a+b+c}
    val result = plus(3,4,5)
    println(result)
    //Otra forma
    println(plus(1,2,3))
    //Otra otra forma
    println({a: Int, b: Int, c: Int -> a+b+c}(7,8,9))

    val calculateNumber = {n:Int ->
        when (n){
            in 1..3 -> println("Tu número está entre 1 y 3")
            in 4..7 -> println("Tu número está entre 4 y 7")
            in 8..10 -> println("Tu número está entre 8 y 10")
        }
    }
    println(calculateNumber(6))

    /**
     * Implementando clases
     */

    val camera = Camera()
    camera.turnOn()
    println(camera.cameraStatus())
    camera.turnOff()
    println(camera.cameraStatus())

    /**
     * Diseñando getters y setters
     */

    camera.setResolution(1080)
    println("Resolution: ${camera.getResolution()}")

    /**
     * Nueva clase Shoe
     */
    println()
    var shoe = Shoe("Shoe", "Blue Shoes", 12345, "Praga")
    println("Shoe: $shoe")
    /*shoe.size = 37
    println(shoe.size)

    println()
    shoe.model = "Zapatos de tacón"
    println(shoe.model)
    println(shoe.mark)*/


    /**
     * Nueva clase Movie
     */

    val movie = Movie("Coco","Pixar",120)
    println()
    println(movie.title)
    println(movie.creator)
    println("${movie.duration} min")

    /**
     *Nueva clase Product (Padre)
     */


}

//data class Movie(val title: String, val creator: String, val duration: Int) {
//
//}

fun averageNumbers(numbers: IntArray): Int{
    var sum = 0
    for (num in numbers){
        sum = sum.plus(num)
    }
    val average = sum / numbers.size
    return average
}

//Functions
fun averageNumbers2(numbers:IntArray):Int{
    val sumas = numbers.sum()
    return sumas.div(numbers.size)
}










