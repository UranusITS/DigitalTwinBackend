package team.solar.digitaltwinbackend.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.entity.User

@Repository
interface UserRepository : JpaRepository<User, Int> {
    fun findById(id: Int?): User?

    @Query("select u from User u where u.user_name = ?1")
    fun findByUserName(user_name: String?): User?
}