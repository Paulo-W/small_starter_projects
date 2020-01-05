package paul.projects.dslinkotlin.primatives

import java.time.LocalDate
import java.time.Period

fun main() {

	println(1.days.fromNow)
	print(1.days.ago)
}

val Int.days: Period get() = Period.ofDays(this)

val Period.ago: LocalDate get() = LocalDate.now() - this

val Period.fromNow: LocalDate get() = LocalDate.now() + this

