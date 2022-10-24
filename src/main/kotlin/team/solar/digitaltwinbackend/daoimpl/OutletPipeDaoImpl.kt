package team.solar.digitaltwinbackend.daoimpl

import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.dao.OutletPipeDao
import team.solar.digitaltwinbackend.entity.OutletPipe
import team.solar.digitaltwinbackend.repository.OutletPipeRepository

@Repository
class OutletPipeDaoImpl(private val repo: OutletPipeRepository) : OutletPipeDao {
    override fun findById(id: Int?) = repo.findById(id)

    override fun findAll() = repo.findAll().toList()

    override fun add(outletPipe: OutletPipe) = repo.save(outletPipe)
}
