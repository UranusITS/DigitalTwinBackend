package team.solar.digitaltwinbackend.servicetestimpl

import org.springframework.stereotype.Service
import team.solar.digitaltwinbackend.dao.WaterCoolingDao
import team.solar.digitaltwinbackend.entity.WaterCooling
import team.solar.digitaltwinbackend.servicetest.WaterCoolingServiceTest
import java.sql.Timestamp
import kotlin.random.Random

@Service
class WaterCoolingServiceTestImpl(private val dao: WaterCoolingDao) : WaterCoolingServiceTest {
    override fun findById(id: Int?): WaterCooling? {
        return WaterCooling(
            id,
            Random.nextDouble(10.0),
            Random.nextDouble(100.0),
            Random.nextDouble(100.0),
            Timestamp(System.currentTimeMillis())
        )
    }

    override fun findLatest(): WaterCooling? {
        return findById(Random.nextInt(100))
    }

    override fun add(waterCooling: WaterCooling): WaterCooling? {
        return findById(Random.nextInt(100))
    }
}
