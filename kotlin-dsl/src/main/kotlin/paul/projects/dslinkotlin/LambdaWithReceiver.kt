package paul.projects.dslinkotlin

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

}