package model

class Shoe(var sku: Int, var mark: String) { //Clases para Datos - Data Class

    init {
        println("SKU ID: $sku")
        println("Marca: $mark")
    }

    var size:Int = 34 //valor mínimo
        set(value) {
            field = if(value.compareTo(34)>=0) value else 34
        }
        get() = field //En este caso el get es redundante

    var color:String = "white"

    var model: String = "Boots" // No acepta Tenis
        set(value) {
            if (value.equals("Tenis"))
                field = "Boots"
            else
                field = value
        }
        get() = field //En este caso el get es redundante
}