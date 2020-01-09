package paul.projects.dslinkotlin.infixfunction

fun main() {
	"Kotlin" should start with "Kot"
	"Kotlin" should end with "lin"
}

object end  		// passed for type not value
object start

infix fun String.should(x: end): EndsWith = EndsWith(this)
infix fun String.should(x: start): StartsWith = StartsWith(this)


class EndsWith(val value: String) {
	infix fun with(suffix: String) {
		if (!value.endsWith(suffix))
			throw AssertionError("String: $value does not end with $value ")
	}
}


class StartsWith(val value: String) {
	infix fun with(prefix: String) {
		if (!value.startsWith(prefix))
			throw AssertionError("String: $value does not start with ")
	}
}


