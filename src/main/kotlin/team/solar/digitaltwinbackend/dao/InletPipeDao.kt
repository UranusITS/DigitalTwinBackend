package team.solar.digitaltwinbackend.dao

import team.solar.digitaltwinbackend.entity.InletPipe

interface InletPipeDao {
    fun findById(id: Int?): InletPipe?

    fun findAll(): List<InletPipe>

    fun add(inletPipe: InletPipe): InletPipe
}
