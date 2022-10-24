package team.solar.digitaltwinbackend.dao

import team.solar.digitaltwinbackend.entity.LubricatingOil

interface LubricatingOilDao {
    fun findById(id: Int?): LubricatingOil?

    fun findAll(): List<LubricatingOil>

    fun add(lubricatingOil: LubricatingOil): LubricatingOil
}
