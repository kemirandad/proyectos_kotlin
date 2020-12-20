package model

class Shoe(name: String, description: String, sku: Int, var brand: String):
        Product(name, description, sku) { //Clases para Datos - Data Class

    override fun create(): String {
        return "Create shoe"
    }

    override fun read(): String {
        return "Read shoe"
    }

    override fun udpate(): String {
        return "Update show"
    }

    override fun delete(): String {
        return "Delete shoe"
    }

    override fun toString(): String {
        return super.toString() + "SKU id: $sku \nMarca: $brand \nModelo: $model \nSize: $size \nColor: $color"
    }

    init {
        println("SKU ID: $sku")
        println("Brand: $brand")
        toString()
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