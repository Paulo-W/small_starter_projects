package paul.projects.dslinkotlin.custombuilder.builders

import paul.projects.dslinkotlin.entities.Author
import paul.projects.dslinkotlin.entities.Book
import paul.projects.dslinkotlin.entities.Chapter

/**
 * The BookBuilder is responsible for temporarily holding values
 * that will be used to construct the Book Object
 *
 * For lists and complicated objects the same strategy that was used to create
 * a custom BookBuilder can be used to create sub objects
 *
 * @see AuthorBuilder
 * @see CustomBookBuilder
 *
 */

class BookBuilder : Builder<Book> {

	var title: String = ""

	var pages: Int = 0

	// the remaining two fields are set by author and chapter functions t
	// we do not want to expose these variables to be seen by the bookBuilder
	// function 1-level higher so we must make these fields private
	private var author: Author? = null

	private var chapters: MutableList<Chapter> = mutableListOf()

	fun author(init: AuthorBuilder.() -> Unit) {
		author = AuthorBuilder().apply(init).build()
	}

	// we want to create a chapters block so we are making use of a utility class here
	fun chapters(init: CHAPTERS.() -> Unit) {
		chapters.addAll(CHAPTERS().apply(init))
	}


	// this is unfortunately exposed 1 level higher and can be called inside the dsl
	// it is not ideal but there is not much other choice
	override fun build(): Book {
		return Book(title, pages, author, chapters)
	}
}
