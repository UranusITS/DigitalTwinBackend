package team.solar.digitaltwinbackend.entity

import org.hibernate.annotations.CreationTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "engine")
open class Engine(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int?, @Column(name = "dynamic_pressure")
    open var dynamicPressure: Double?, @Column(name = "static_pressure_1")
    open var staticPressure1: Double?, @Column(name = "static_pressure_2")
    open var staticPressure2: Double?, @Column(name = "angle")
    open var angle: Double?, @Column(name = "speed_1")
    open var speed1: Double?, @Column(name = "speed_2")
    open var speed2: Double?, @CreationTimestamp
    @Column(name = "time_stamp")
    open var timeStamp: Timestamp?
)
