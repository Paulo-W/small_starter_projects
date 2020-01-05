package paul.projects.dslinkotlin.custombuilder.builders

/**
 * This custom annotation limits the scope of functions that have the annotations
 * This prevents the dsl from being able to call authors inside authors for example
 *
 */
@DslMarker
annotation class BuilderDsl


/**
 * The benifit of inheriting from one class means I only need to apply this anntation
 * once on the super class all children classes will inherit it from their parent
 *
 */
@BuilderDsl
interface Builder<T> {
	fun build() : T
}