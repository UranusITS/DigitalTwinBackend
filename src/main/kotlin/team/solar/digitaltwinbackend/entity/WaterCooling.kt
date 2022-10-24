package team.solar.digitaltwinbackend.entity

import org.hibernate.annotations.CreationTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "water_cooling")
open class WaterCooling(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int?, @Column(name = "static_pressure")
    open var staticPressure: Double?, @Column(name = "temperature_1")
    open var temperature1: Double?, @Column(name = "temperature_2")
    open var temperature2: Double?, @CreationTimestamp
    @Column(name = "time_stamp")
    open var timeStamp: Timestamp?
)
