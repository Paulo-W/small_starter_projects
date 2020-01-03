package paul.projects.dslinkotlin.lambdas

fun main(arg: Array<String>) {
	applyAndWhen()
}

fun applyAndWhen() {
	val map = mutableMapOf(1 to "one")

	map.apply { this[2] = "two" }

	map.apply { this[3] = "three" }

	with (map) {
		this[4] = "four"
	}

	println(map)
}
