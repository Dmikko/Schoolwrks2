package com.example.test1.aflevering3
import java.util.*

class RedditPost(private var title: String, private var author: String) : Comparable<RedditPost> {
    private val datePosted: String = getCurrentDate()
    private var voteBalance: Int = 1

    // Getters and Setters
    fun getTitle(): String = title
    fun setTitle(newTitle: String) { title = newTitle }

    fun getAuthor(): String = author
    fun setAuthor(newAuthor: String) { author = newAuthor }

    fun getDatePosted(): String = datePosted

    fun getVoteBalance(): Int = voteBalance
    fun upvote() { voteBalance++ }
    fun downvote() { voteBalance-- }

    override fun compareTo(other: RedditPost): Int {
        return other.voteBalance - this.voteBalance // Sorting in descending order
    }

    override fun toString(): String {
        return "Title: '$title', Author: '$author', Date: $datePosted, Votes: $voteBalance"
    }

    companion object {
        private fun getCurrentDate(): String {
            val calendar = Calendar.getInstance()
            return "${calendar.get(Calendar.YEAR)}-${calendar.get(Calendar.MONTH) + 1}-${calendar.get(Calendar.DAY_OF_MONTH)}"
        }
    }
}
