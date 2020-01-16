package paul.small.projects.useresultsofstream.service

import paul.small.projects.useresultsofstream.entity.Registry
import paul.small.projects.useresultsofstream.entity.User

/**
 * The following file shows different scenarios of achieving the same result, how to use the final
 * result of a stream which has been mapped, filtered, reduced etc etc whatever. How do we best use that
 * result after we are finished with it.
 *
 * @see usingVals -> assign the result to a value
 * @see usingParams -> offset the logic to a function but use the result of that function where needed
 * @see usingKotlinsScopingFunctions -> use scoping functions to use the result in the same line
 *
 */

fun main() {
	val names = listOf("Paul Wood", "Bob Chappy", "Cindy Shin", "Sarah Gally", "Steve Wonder")

	val result1 = usingVals(names)
	val result2 = usingParams(names)
	val result3 = usingKotlinsScopingFunctions(names)
}

/**
 * This was always fine in JAVA there was no problem doing this or even anything similar to this
 * but have to create and store that extra variable is such as waste. Surely there was a better
 * way to use the variable so that we could save an extra variable space
 *
 */
fun usingVals(names: List<String>) : Registry {

	val users = names.map { User(it, "${it.toLowerCase().trim()}@gmail.com") }
	return Registry(users, "Pretoria")
}

/**
 * This way we don't create extra variables but calling another function is just as expensive and wasteful.
 * Sometimes it will be necessary to extract mapping or filtering operations into separate services but for simple
 * tasks like this it is quite a costly operation.
 */

fun usingParams(names: List<String>) : Registry {
	return Registry(generateUsers(names), "Pretoria")
}

private fun generateUsers(names: List<String>): List<User> {
	return names.map { User(it, "${it.toLowerCase().trim()}@gmail.com") }
}

/**
 * Now here we have a unique way of using streams. instead of iterating over each element one by one we are
 * using the entire collection or set and mapping it to a new object that has that list as one of its fields.
 * Very simple and yet at the same time really helpful.
 * Either `let` or `run` can be used at the end of the collection, because both let and run return the result
 * of the lambda. Which one to use is dependant on how complex the function is and
 * what you as the developer prefer. I chose `run` as I felt `this` in the case below was more descriptive
 * than `it`, but `let` would have worked just fine
 */

fun usingKotlinsScopingFunctions(names: List<String>): Registry {
	return names.map { User(it, "${it.toLowerCase().trim()}@gmail.com") }.run {
		Registry(this, "Pretoria")
	}
}
