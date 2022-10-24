package team.solar.digitaltwinbackend.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.entity.OutletPipe

@Repository
interface OutletPipeRepository : JpaRepository<OutletPipe, Int> {
    fun findById(id: Int?): OutletPipe?
}
