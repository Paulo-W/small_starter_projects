package paul.small.projects.useresultsofstream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import streams.use

@SpringBootApplication
class UseResultsOfStreamApplication

fun main(args: Array<String>) {
	runApplication<UseResultsOfStreamApplication>(*args)

	val list: MutableList<Int> = mutableListOf()
	for (i in 1..10) list.add(i)

	list.filter { it % 2 == 0 }.use {
		println()
		println(this.joinToString(separator = " "))
	}
}

