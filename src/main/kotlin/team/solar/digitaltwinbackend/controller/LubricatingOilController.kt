package team.solar.digitaltwinbackend.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import team.solar.digitaltwinbackend.entity.LubricatingOil
import team.solar.digitaltwinbackend.servicetest.LubricatingOilServiceTest

@RestController
@RequestMapping("/lubricating-oil")
class LubricatingOilController(private val service: LubricatingOilServiceTest) {
    @RequestMapping("/lubricating-oil")
    fun findById(@RequestParam("id") id: Int) = service.findById(id)

    @RequestMapping("/latest")
    fun findLatest() = service.findLatest()

    @RequestMapping("/add")
    fun add(@RequestBody lubricatingOil: LubricatingOil) = service.add(lubricatingOil)
}
