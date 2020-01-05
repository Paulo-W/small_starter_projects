package paul.projects.dslinkotlin.lambdas

class LambdaWithReceiver {

	/**
	 * The following functions shows a function with a receiver object
	 * The StringBuilder param is actually an extension function type
	 * When you declare an extension function type you essentially pull
	 * one of the paramters out of the parenthisis and place it in front
	 * @see RegularLambdaFunction.buildString
	 *
	 * This is called a receiver type and the value passed in is the receiver object
	 * Why an extension function??
	 * It describes a block of code that can be run as an extension
	 */
	private fun buildSting(receiver: StringBuilder.() -> Unit) : String {
		val sb = StringBuilder()
		sb.receiver()
		return sb.toString()
	}

	fun receiverBuilder() {
		val s = buildSting {
			append("Hello ")
			append("World!")
		}

		println("Receiver Lambda builder: $s")
	}

	private fun buildStringImp(receiver: StringBuilder.() -> Unit) : String {
		return StringBuilder().apply(receiver).toString()
	}

}