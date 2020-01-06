package paul.projects.dslinkotlin.custombuilder.builders

import paul.projects.dslinkotlin.entities.Chapter

class ChaptersBuilder : Builder<Chapter> {

	var name: String = ""
	var pages: Int = 0

	override fun build(): Chapter {
		return Chapter(name, pages)
	}
}


/**
 * This is a utility class and should not be exposed to the BookBuilder class
 * 1-level higher. Notice this class is of type Arraylist (it extends that class)
 * so we can call methods like add and remove without specifying a list.
 *
 */
@BuilderDsl
class CHAPTERS : ArrayList<Chapter>() {

	fun chapter(init: ChaptersBuilder.() -> Unit) {
		add(ChaptersBuilder().apply(init).build())
	}
}

