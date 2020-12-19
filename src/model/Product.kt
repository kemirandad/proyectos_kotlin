package model

open class Product(val name: String, var description: String, var sku: Int) {

    override fun toString(): String {
        return "\nName: $name \nDescription: $description \nSKU $sku"
    }

    open fun create(): String{
        return "Create"
    }
    open fun read(): String{
        return "Read"
    }
    open fun udpate(): String{
        return "Update"
    }
    open fun delete(): String{
        return "Delete"
    }


}