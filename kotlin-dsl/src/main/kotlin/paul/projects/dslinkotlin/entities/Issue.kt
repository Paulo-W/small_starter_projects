package paul.projects.dslinkotlin.entities

data class Issue (val id: String, val project: String, val type: String,
				  val priority: String, val description: String)