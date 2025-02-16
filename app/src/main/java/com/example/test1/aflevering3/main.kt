package com.example.test1.aflevering3




fun main() {








   //Assignment 1
    println("\n Assignment 1")

    val articles = arrayListOf(
        Article("John Doe", "The Future of AI"),
        Article("Jane Smith", "Kotlin for Beginners"),
        Article("Alice Johnson", "Cybersecurity in 2025"),
        Article("Bob Brown", "The Rise of Quantum Computing"),
        Article("Emma Wilson", "Understanding Blockchain")
    )

    for (article in articles) {
        println(article)
    }


//Assigntment 2+3
println("\n Assigntment 2+3")

    val posts = arrayListOf(
        RedditPost("JohnDoe", "Kotlin is Awesome!"),
        RedditPost("JaneSmith", "Why Rust is the Future?"),
        RedditPost("AliceJohnson", "AI in 2025: What to Expect"),
        RedditPost("BobBrown", "10 Best VS Code Extensions"),
        RedditPost("EmmaWilson", "Cybersecurity Trends in 2024")
    )

    // Simulating votes
    posts[0].upvote()
    posts[0].upvote()
    posts[1].downvote()
    posts[2].upvote()
    posts[2].upvote()
    posts[2].upvote()
    posts[3].downvote()
    posts[4].upvote()

    // Sorting posts by balance (highest to lowest)
    posts.sort()

    // Print sorted posts
    for (post in posts) {
        println(post)
    }



//Assignment 4
    println("\n Assignment 4")


    val words = listOf(
        "apple", "banana", "apple", "orange", "banana", "apple",
        "orange", "banana", "apple", "banana", "apple", "orange",
        "banana", "banana", "apple", "orange", "apple", "orange",
        "banana"
    )

    val wordFrequency: MutableMap<String, Int> = mutableMapOf()

    for (word in words) {
        wordFrequency[word] = wordFrequency.getOrDefault(word, 0) + 1
    }

    for ((word, count) in wordFrequency) {
        println("$word: $count")
    }







//Assignment 5
    println("\n Assignment 5")




    val inventory = ProductInventory()

    // Adding products
    inventory.addProduct("Laptop", 10)
    inventory.addProduct("Mouse", 25)
    inventory.addProduct("Keyboard", 15)

    // Displaying inventory
    inventory.displayInventory()

    // Removing products
    inventory.removeProduct("Mouse", 5)
    inventory.removeProduct("Laptop", 10)

    // Displaying inventory after removal
    inventory.displayInventory()






}