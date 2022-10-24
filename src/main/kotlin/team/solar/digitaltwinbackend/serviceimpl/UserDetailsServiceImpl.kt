package team.solar.digitaltwinbackend.serviceimpl

import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import team.solar.digitaltwinbackend.dao.UserDao
import team.solar.digitaltwinbackend.entity.LoginUser

@Service
class UserDetailsServiceImpl(private val dao: UserDao) : UserDetailsService {
    override fun loadUserByUsername(username: String?): LoginUser? {
        val user = dao.findByIUserName(username)
        //TODO Authentication
        return user?.let { LoginUser(it) }
    }
}