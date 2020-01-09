package paul.projects.dslinkotlin.infixfunction

infix fun <T> T.should(matcher: Matcher<T>) : Boolean {
	return matcher.test(this)
}

interface Matcher<T> {
	fun test(value: T) : Boolean
}

class startWith(private val preFix: String) : Matcher<String> {

	override fun test(value: String) : Boolean {
	 	return if (!value.startsWith(preFix)) {
			throw AssertionError("String $value does not start with $preFix")
		} else true
	}
}

fun main() {
	val doesMatch = "Kotlin" should startWith("Kot")
	println(doesMatch)
}




