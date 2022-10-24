package team.solar.digitaltwinbackend.daoimpl

import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.dao.WaterCoolingDao
import team.solar.digitaltwinbackend.entity.WaterCooling
import team.solar.digitaltwinbackend.repository.WaterCoolingRepository

@Repository
class WaterCoolingDaoImpl(private val repo: WaterCoolingRepository) : WaterCoolingDao {
    override fun findById(id: Int?) = repo.findById(id)

    override fun findAll() = repo.findAll().toList()

    override fun add(waterCooling: WaterCooling) = repo.save(waterCooling)
}
