package team.solar.digitaltwinbackground.dao

import team.solar.digitaltwinbackground.entity.InletPipe

interface InletPipeDao {
    fun findById(id: Int?): InletPipe?

    fun findAll(): List<InletPipe>

    fun add(inletPipe: InletPipe): InletPipe
}
