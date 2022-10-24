package team.solar.digitaltwinbackend.entity

import javax.persistence.*

@Entity
@Table(name = "user")
open class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null, @Column(name = "user_name")
    open var user_name: String? = null, @Column(name = "nick_name")
    open var nick_name: String? = null, @Column(name = "password")
    open var password: String? = null
) {}