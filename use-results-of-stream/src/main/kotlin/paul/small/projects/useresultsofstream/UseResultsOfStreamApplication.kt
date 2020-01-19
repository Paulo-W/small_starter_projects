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

	list.filter { it.isEven() }.use {
		println()
		println(this.joinToString(separator = " "))
	}

}

private fun Int.isEven() = this % 2 == 0
private fun Int.isOdd() = this % 2 != 0
