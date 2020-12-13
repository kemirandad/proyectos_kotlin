import java.awt.List

fun main(args: Array<String>){
    println(":: Bienvenido a Recipe Maker ::")
    val bienvenida = """Selecciona la opción deseada
1. Hacer una receta
2. Ver mis recetas
3. Salir""".trimIndent()

    do {
        println(bienvenida)
        val entrada: String? = readLine()
        when (entrada) {
            "1" -> {
                //1. Hacer una receta
                doRecets()
            }
            "2" -> {
                //Ver mis recetas
                seeTheRecets()
            }
            "3" -> {
                //Salir
                println("\n¡Hasta luego!\n")
            }
            else -> { // Opción default
                println("\nDigita una opción válida... entre el 1 y el 3\n")
            }
        }
    }while (!entrada.equals("3"))
}

fun seeTheRecets() {
    println("\nAquí estarán guardadas tus recetas...\n")
    /*for((k,v) in recetas){
        println("$k: $v")
    }*/

}

fun doRecets()//: MutableMap<String?, String>
 {
    //println("\nAquí podrás realizar tus recetas nuevas\n")
    val menuIngredientes = """
        Elija los ingredientes de su receta, separados por coma, ejemplo:
        1,2,5
        
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceite
    """.trimIndent()
    println("\n"+menuIngredientes+"\n")
    val ingredientes = mapOf<Int, String> ( 1 to "Agua",
                                        2 to "Leche",
                                        3 to "Carne",
                                        4 to "Verduras",
                                        5 to "Frutas",
                                        6 to "Cereal",
                                        7 to "Huevos",
                                        8 to "Aceite")
    val entradaIngredientes: String? = readLine()
    println("\nIngrese un nombre para su receta...")
    val nombreReceta: String = readLine().toString()

    val splitIngredientes = entradaIngredientes!!.split(",")
    val misRecetas = mutableMapOf<String, ArrayList<String?>>()
    val seleccionados = arrayListOf<String?>()
    for ( elements in splitIngredientes){
        seleccionados.add(ingredientes[elements.toInt()])
    }
    misRecetas.put(nombreReceta, seleccionados)
    val itr = misRecetas.values
    for (k in misRecetas.keys){
        println("$k:")
        itr.forEach{
            println(it)
        }
    }
}
