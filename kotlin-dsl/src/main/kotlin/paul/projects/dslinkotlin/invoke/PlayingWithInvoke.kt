package paul.projects.dslinkotlin.invoke

import paul.projects.dslinkotlin.entities.Issue

fun main(args : Array<String>) {
	val i1 = Issue("IDEA-154446", "IDEA", "Bug", "Major",
		"Save settings failed")
	val i2 = Issue("KT-12183", "Kotlin", "Feature", "Normal",
	"Intention: convert several calls on the same receiver to with/apply")

	// the invoke method will get called once the filter operation
	// takes place. val -> a lambda as a function
	val predicate = ImportantIssue("IDEA")

	// this works because When you invoke a lambda as a function,
	// the operation is translated into a call of the invoke method
	for (issue in listOf(i1, i2).filter(predicate)) {
		println(issue.id)
	}
}

// Class that is of tpe Lambda must override the invoke method
// invoke allows you to call objects of custom types as functions
class ImportantIssue(private val project: String) : (Issue) -> Boolean {

	// the invoke method implement a function type interface
	// this is the method that will get called when you call the object
	override fun invoke(issue: Issue): Boolean {
		// notice the extension function added on the issue sent in
		return issue.project == project && issue.isImportant()
	}

	private fun Issue.isImportant(): Boolean {
		return type == "Bug" && (priority == "Major" || priority == "Critical")
	}
}