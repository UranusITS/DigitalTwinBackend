package team.solar.digitaltwinbackend.dao

import team.solar.digitaltwinbackend.entity.User

interface UserDao {
    fun findById(id: Int?): User?

    fun findByIUserName(user_name: String?): User?

    fun findAll(): List<User>

    fun add(user: User): User
}