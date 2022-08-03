package team.solar.digitaltwinbackend.daoimpl

import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.dao.InletPipeDao
import team.solar.digitaltwinbackend.entity.InletPipe
import team.solar.digitaltwinbackend.repository.InletPipeRepository

@Repository
class InletPipeDaoImpl(private val repo: InletPipeRepository) : InletPipeDao {
    override fun findById(id: Int?) = repo.findById(id)

    override fun findAll() = repo.findAll().toList()

    override fun add(inletPipe: InletPipe) = repo.save(inletPipe)
}
