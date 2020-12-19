fun main(args: Array<String>){
    println(":: Bienvenido a Recipe Maker ::")
    val bienvenida = """Selecciona la opción deseada
1. Hacer una receta
2. Ver mis recetas
3. Salir""".trimIndent()

    val recetas = mutableMapOf<String, java.util.ArrayList<String>>()
    do {
        println(bienvenida)

        val entrada: String? = readLine()
        when (entrada) {
            "1" -> {
                //1. Hacer una receta
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
                val entradaIngredientes = readLine().toString().split(",") as ArrayList<String>
                println("Escribe un nombre para tu receta...")
                val nombreReceta: String = readLine().toString()

                val ingredientes = mapOf<Int, String> ( 1 to "Agua",
                        2 to "Leche",
                        3 to "Carne",
                        4 to "Verduras",
                        5 to "Frutas",
                        6 to "Cereal",
                        7 to "Huevos",
                        8 to "Aceite")
                val filteredIngredientes = ArrayList<String>()
                for ( value in entradaIngredientes) {
                    if (value.toInt() in ingredientes.keys){
                        filteredIngredientes.add(ingredientes.getValue(value.toInt()))
                    }
                }
                recetas[nombreReceta] = filteredIngredientes
            }
            "2" -> {
                val menu2 = """
                    Desea buscar una receta por el nombre almacenado o listar todas:
                    1. Buscar por nombre
                    2. Listar todas
                """.trimIndent()
                println(menu2)
                val menuOption = readLine().toString()
                when (menuOption){
                    "1" ->{
                        println("Escriba el nombre de la receta a contirnuación...")
                        val tituloReceta = readLine().toString()
                        if (tituloReceta in recetas.keys){
                            println("\nSu receta $tituloReceta consta de los siguientes ingredientes: ")
                            recetas.getValue(tituloReceta).forEach { println(it)}
                        }
                    }
                    "2" -> {
                        for (k in recetas.keys){
                            println("\n"+k)
                            if (k in recetas.keys){
                                recetas.getValue(k).forEach { println(it)}
                            }
                        }
                    }
                    else -> {
                        println("Elija una opción válida...")
                    }

                }

            }
            "3" -> {
                //Salir
                println("\n¡Hasta luego!\n")
                recetas.clear()
            }
            else -> { // Opción default
                println("\nDigita una opción válida... entre el 1 y el 3\n")
            }
        }
    }while (!entrada.equals("3"))
}