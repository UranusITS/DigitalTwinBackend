package team.solar.digitaltwinbackend.daoimpl

import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.dao.UserDao
import team.solar.digitaltwinbackend.entity.User
import team.solar.digitaltwinbackend.repository.UserRepository

@Repository
class UserDaoImpl(private val repo: UserRepository) : UserDao {
    override fun findById(id: Int?) = repo.findById(id)

    override fun findByIUserName(user_name: String?) = repo.findByUserName(user_name)

    override fun findAll() = repo.findAll().toList()

    override fun add(user: User) = repo.save(user)
}
