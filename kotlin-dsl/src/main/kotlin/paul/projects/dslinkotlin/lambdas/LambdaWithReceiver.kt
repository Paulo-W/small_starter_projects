package paul.projects.dslinkotlin.lambdas

class LambdaWithReceiver {

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