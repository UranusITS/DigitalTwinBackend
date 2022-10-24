package team.solar.digitaltwinbackend.service

import team.solar.digitaltwinbackend.entity.LubricatingOil

interface LubricatingOilService {
    fun findById(id: Int?): LubricatingOil?

    fun findLatest(): LubricatingOil?

    fun add(lubricatingOil: LubricatingOil): LubricatingOil?
}
