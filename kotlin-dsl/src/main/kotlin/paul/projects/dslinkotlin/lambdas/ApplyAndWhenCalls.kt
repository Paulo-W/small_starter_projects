package paul.projects.dslinkotlin.lambdas

import java.lang.StringBuilder

fun main(arg: Array<String>) {
	applyAndWhen()

	val builderAction : StringBuilder.() -> Unit = {
		append("Hello World!")
	}
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

/**
 * The apply method effectively takes the object on which it was called and
 * uses it as an implicit receiver to call the function/lambda passed in as the
 * argument
 */
inline fun <T> T.apply(block: T.() -> Unit): T {
	block()
	return this
}
