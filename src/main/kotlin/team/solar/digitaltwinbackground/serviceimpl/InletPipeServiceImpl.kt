package team.solar.digitaltwinbackground.serviceimpl

import org.springframework.stereotype.Service
import team.solar.digitaltwinbackground.dao.InletPipeDao
import team.solar.digitaltwinbackground.entity.InletPipe
import team.solar.digitaltwinbackground.service.InletPipeService

@Service
class InletPipeServiceImpl(private val dao: InletPipeDao) : InletPipeService {
    override fun findById(id: Int?) = dao.findById(id)

    override fun findLatest(): InletPipe? {
        val inletPipes = dao.findAll().sortedByDescending { it.timeStamp }
        return inletPipes.firstOrNull()
    }

    override fun add(inletPipe: InletPipe) = dao.add(inletPipe)
}