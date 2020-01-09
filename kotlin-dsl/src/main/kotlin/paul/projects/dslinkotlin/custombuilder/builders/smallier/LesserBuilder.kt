package paul.projects.dslinkotlin.custombuilder.builders.smallier

import paul.projects.dslinkotlin.entities.Book

fun bookBuilder2(init: BookBuilder2.() -> Unit) : Book =
		BookBuilder2().apply(init).build()

class BookBuilder2 {

	// essentially a default value
	var title: String = ""

	//TODO the rest of the book variables
	fun build() : Book {
		return Book(title = title, pages = 0, author = null, chapters = null)
	}
}

val result =
		bookBuilder2 {
			title = "Kotlin DSL"
			//TODO the rest of these
		}