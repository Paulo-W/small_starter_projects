package paul.projects.dslinkotlin.infixfunction


fun main() {
	"Kotlin" should startWith("Kot")
}

infix fun <T> T.should(matcher: Matcher<T>) {
	matcher.test(this)
}

interface Matcher<T> {
	fun test(value: T)
}

class startWith(private val preFix: String) : Matcher<String> {

	override fun test(value: String) {
		if (!value.startsWith(preFix)) {
			throw AssertionError("String $value does not start with $preFix")
		}
	}
}