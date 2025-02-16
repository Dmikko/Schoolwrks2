package com.example.test1.aflevering3



class ProductInventory {
    private val inventory: MutableMap<String, Int> = mutableMapOf()

    // Function to add a product
    fun addProduct(name: String, quantity: Int) {
        if (quantity > 0) {
            inventory[name] = inventory.getOrDefault(name, 0) + quantity
            println("Added $quantity of $name to inventory.\n")
        } else {
            println("Invalid quantity. Must be greater than zero.\n")
        }
    }

    // Function to remove a product
    fun removeProduct(name: String, quantity: Int) {
        if (inventory.containsKey(name)) {
            val currentQuantity = inventory[name]!!
            if (quantity >= currentQuantity) {
                inventory.remove(name)
                println("$name removed from inventory.\n")
            } else {
                inventory[name] = currentQuantity - quantity
                println("Removed $quantity of $name. Remaining: ${inventory[name]}\n")
            }
        } else {
            println("$name does not exist in the inventory.\n")
        }
    }

    // Function to display the inventory
    fun displayInventory() {
        if (inventory.isEmpty()) {
            println("Inventory is empty.\n")
        } else {
            println("Current Inventory:")
            for ((product, quantity) in inventory) {
                println("$product: $quantity")
            }
            println()
        }
    }
}
