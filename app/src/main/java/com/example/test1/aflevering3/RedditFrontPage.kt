package com.example.test1.aflevering3

class RedditFrontPage {
    private val posts: MutableList<RedditPost> = mutableListOf()

    fun addPost(post: RedditPost) {
        posts.add(post)
    }

    fun deletePost(index: Int) {
        if (index in posts.indices) {
            posts.removeAt(index)
        } else {
            println("Invalid index")
        }
    }

    fun getPostsSortedByVotes(): List<RedditPost> {
        return posts.sorted()
    }

    fun displayPosts() {
        for ((index, post) in posts.withIndex()) {
            println("[$index] $post")
        }
    }
}