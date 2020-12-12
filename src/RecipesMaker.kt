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
}

fun doRecets() {
    println("\nAquí podrás realizar tus recetas nuevas\n")
}
