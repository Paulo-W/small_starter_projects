package streams

/**
 * To be honest though the scope functions let and run don't really read well for what I want
 * A better description would be use, as I want to use the result of the list that would make
 * sense filter the Collection and then use it's result
 *
 * The following extension function is pretty much just a more specific `run`. It's a run that can only
 * be added to Collections which prevents any confusion for when to use it over run. It returns the
 * result of the receiver sent in, "Using the collection to do something else".
 *
 */

inline fun <T : Collection<Any>, R> T.use(block: T.() -> R): R {
	return block()
}

