package paul.projects.dslinkotlin.custombuilder.builders

import paul.projects.dslinkotlin.entities.Author
import java.text.SimpleDateFormat
import java.util.*

class AuthorBuilder : Builder<Author> {

	var name: String = ""


	// allow the user to send in a string and format the result to a date variable
	// but hide the variable so as not to confuse the user
	private var dob: Date = Date()

	var dateOfBirth: String = ""
		set(value) {
			dob = SimpleDateFormat("yyyy-mm-dd").parse(value)
		}

	override fun build(): Author {
		return Author(name, dob)
	}
}
