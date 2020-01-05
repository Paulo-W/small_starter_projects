package paul.projects.dslinkotlin.custombuilder

import paul.projects.dslinkotlin.custombuilder.builders.BookBuilder
import paul.projects.dslinkotlin.entities.Book

/**
 * The following example class shows us how to use Kotlins DSL
 * To create a custom Type Safe builder that returns a book object
 *
 * @see Book
 *
 * Thoughts:
 * 1) The custom builder reads well but is not really type safe.
 * It would be more accuate to say this builder is gramatically correct
 * but there is no clear way of ensuring required parameters in objects.
 * i) 	For Instance if I wanted to make sure that a book always has to be created with a
 * 		title there is no surety that a user of the dsl will specify it.
 * ii) Custom objects that exist inside other objects like the Author object in this
 * 		example are not Immutable, if you did want them to be Immutable you would have to create
 * 		default values on the BooksBuilder level but that can get quite ugly
 *
 * 2) It reads very well but I feel still requires some knowledge of the domain
 * as it is not completely type safe
 *
 * 3) Declaring multiple values is completely allowed ie. in the example below I could
 * declare two "title" fields and there would be no problem. In such a case the later
 * definition would be seen as the correct
 *
 */
fun main() {

	val book = bookBuilder {
		title = "Learning Kotlin"
		pages = 10
		author {
			name = "Paul Wood"
			dateOfBirth = "1996-12-19"
		}
		chapters {
			chapter {
				name = "Learning the basics"
				pages = 1
			}
			chapter {
				name = "Learning about DSL's"
				pages = 9
			}
		}
	}

	println(book)
}

/**
 * A function is all that is needed to start the builder object
 * @param init : is a BookBuilder receiver type the value passed in will be
 * the receiver object of a book builder which holds all needed values for the book
 *
 * @see BookBuilder
 *
 */
fun bookBuilder(init: BookBuilder.() -> Unit) : Book = BookBuilder().also(init).build()

