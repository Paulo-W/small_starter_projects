package paul.projects.dslinkotlin.invoke

fun main() {

	val dependencies = DependencyHandler()
	dependencies.compile(" Java11 ")

	// You can chose if you want to explicitly call the invoke method or
	dependencies.invoke {
		compile("Kotlin")
	}

	// you can omit it
	dependencies {
		compile("Kotlin")
	}
}

class DependencyHandler() {

	fun compile(title: String) {
		println("added new dependency $title")
	}

	// notice the lambda with receiver that has been passed in
	// is of the type of the class above
	operator fun invoke(body : DependencyHandler.() -> Unit) {
		body()
	}
}