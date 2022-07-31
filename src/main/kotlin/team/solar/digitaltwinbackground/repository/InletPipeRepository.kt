package team.solar.digitaltwinbackground.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackground.entity.InletPipe

@Repository
interface InletPipeRepository : JpaRepository<InletPipe, Int> {
    fun findById(id: Int?): InletPipe?
}
