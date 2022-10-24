package team.solar.digitaltwinbackend.servicetestimpl

import org.springframework.stereotype.Service
import team.solar.digitaltwinbackend.dao.OutletPipeDao
import team.solar.digitaltwinbackend.entity.OutletPipe
import team.solar.digitaltwinbackend.servicetest.OutletPipeServiceTest
import java.sql.Timestamp
import kotlin.random.Random

@Service
class OutletPipeServiceTestImpl(private val dao: OutletPipeDao) : OutletPipeServiceTest {
    override fun findById(id: Int?): OutletPipe? {
        return OutletPipe(
            id,
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(100.0),
            Random.nextDouble(100.0),
            Random.nextDouble(100.0),
            Random.nextDouble(100.0),
            Timestamp(System.currentTimeMillis())
        )
    }

    override fun findLatest(): OutletPipe? {
        return findById(Random.nextInt(100))
    }

    override fun add(outletPipe: OutletPipe): OutletPipe? {
        return findById(Random.nextInt(100))
    }
}
