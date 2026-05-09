package org.example.app.lesson_11

class ForumMember(
    val userId: Int,
    var userName: String,
)


class ForumMessage(
    val authorId: Int,
    var message: String,
)


class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages =  mutableListOf<ForumMessage>()
    private var userIdCounter = 0


    fun createNewUser(userName: String): ForumMember {
        userIdCounter++
        val newMember = ForumMember(
            userId = userIdCounter,
            userName = userName
        )
        members.add(newMember)
        return newMember
    }


    fun createNewMessage(
        authorId: Int,
        userMessage: String,
    ) {
        val userExists = members.any { it.userId == authorId }
        if (userExists) {
            val newMessage = ForumMessage(
                authorId = authorId,
                message = userMessage
            )
            messages.add(newMessage)
        }
    }


    fun printThread() {
        println("--- FORUM THREAD ---")
        for (m in messages) {
            val authorName = members.find { it.userId == m.authorId }?.userName ?: "Unknown"
            println("$authorName: ${m.message}")
        }
    }
}


fun main() {
    val forum1 = Forum()

    val member1 = forum1.createNewUser("Findus")
    val member2 = forum1.createNewUser("Stesha")

    forum1.createNewMessage(member1.userId, "Meow! I am a cat.")
    forum1.createNewMessage(member1.userId, "I like fish.")
    forum1.createNewMessage(member2.userId, "Meow!")
    forum1.createNewMessage(member2.userId, "Where are we?")

    forum1.printThread()
}