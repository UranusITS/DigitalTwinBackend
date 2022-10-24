package team.solar.digitaltwinbackend.daoimpl

import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.dao.LubricatingOilDao
import team.solar.digitaltwinbackend.entity.LubricatingOil
import team.solar.digitaltwinbackend.repository.LubricatingOilRepository

@Repository
class LubricatingOilDaoImpl(private val repo: LubricatingOilRepository) : LubricatingOilDao {
    override fun findById(id: Int?) = repo.findById(id)

    override fun findAll() = repo.findAll().toList()

    override fun add(lubricatingOil: LubricatingOil) = repo.save(lubricatingOil)
}
