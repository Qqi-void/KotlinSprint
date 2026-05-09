package org.example.app.lesson_11

class Member (
    val nickname: String,
    val avatarUrl: String,
    var status: String,
)

class Room (
    val coverUrl: String,
    val title: String,
    var members: MutableList<Member> = mutableListOf()
) {
    fun addMember(
        newMember: Member
    ) {
        members.add(newMember)
    }

    fun updateMemberStatus(
        name: String,
        newStatus: String
    ): Boolean {
        val foundMember = members.find { it.nickname == name }

        if (foundMember != null) {
            foundMember.status = newStatus
            return true
        }
        return false
    }
}

fun main() {
    val room1 = Room(
        coverUrl = "Philosophy Talk",
        title = "Philosophy Talk",
    )
    val member1 = Member(
        nickname = "baran",
        avatarUrl = "photo of ship",
        status = "talking"
    )
    val member2 = Member(
        nickname = "koteyka",
        avatarUrl = "photo of cat",
        status = "muted"
    )

    room1.addMember(member1)
    room1.addMember(member2)

    val isUpdated = room1.updateMemberStatus("baran", "away")

    if (isUpdated) {
        println("Status updated successfully!")
    } else {
        println("User not found in this room!")
    }

    println("Room: ${room1.title}:")
    for (m in room1.members) {
        println("${m.nickname} - [${m.status}]")
    }
}