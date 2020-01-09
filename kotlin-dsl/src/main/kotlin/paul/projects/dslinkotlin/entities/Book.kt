package paul.projects.dslinkotlin.entities

import java.util.*

data class Book(
		val title: String,
		val pages: Int,
		val author: Author?,
		val chapters: List<Chapter>?)

data class Author(
		val name: String,
		val dateOfBirth: Date
)

data class Chapter(
		val name: String,
		val pages: Int
)
