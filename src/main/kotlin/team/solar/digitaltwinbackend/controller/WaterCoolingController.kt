package team.solar.digitaltwinbackend.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import team.solar.digitaltwinbackend.entity.WaterCooling
import team.solar.digitaltwinbackend.servicetest.WaterCoolingServiceTest

@RestController
@RequestMapping("/water-cooling")
class WaterCoolingController(private val service: WaterCoolingServiceTest) {
    @RequestMapping("/water-cooling")
    fun findById(@RequestParam("id") id: Int) = service.findById(id)

    @RequestMapping("/latest")
    fun findLatest() = service.findLatest()

    @RequestMapping("/add")
    fun add(@RequestBody waterCooling: WaterCooling) = service.add(waterCooling)
}
