package team.solar.digitaltwinbackend.daoimpl

import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.dao.EngineDao
import team.solar.digitaltwinbackend.entity.Engine
import team.solar.digitaltwinbackend.repository.EngineRepository

@Repository
class EngineDaoImpl(private val repo: EngineRepository) : EngineDao {
    override fun findById(id: Int?) = repo.findById(id)

    override fun findAll() = repo.findAll().toList()

    override fun add(engine: Engine) = repo.save(engine)
}
