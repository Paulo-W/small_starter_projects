package paul.projects.dslinkotlin

class RegularLambdaFunction {

	/**
	 * This method passes a string builder to a lambda function
	 * The lambda created expects an instance of StringBuilder to be passed in
	 * but how it uses it can be represented multiple different ways
	 *
	 * @see s uses explicit StringBuilder -> lambda syntax
	 * @see s2 uses key word it
	 * @see s3 still looks like a function with a lambda passed in
	 *
	 * All 3 values return the same value
	 */
	private fun buildString(builderAction: (StringBuilder) -> Unit): String {
		val sb = StringBuilder()

		builderAction(sb)
		return sb.toString()
	}

	val s = buildString { stringBuilder ->
		stringBuilder.append("Hello ")
		stringBuilder.append("World!")
	}

	val s2 = buildString {
		it.append("Hello")
		it.append("World")
	}

	val s3 = buildString({
		it.append("Hello")
		it.append("World")
	})

	/**
	 *
	 * Close but not ideal we still need to use explicit "it" or pre-defined name
	 * but all we want the lambda to do
	 *
	 */
}