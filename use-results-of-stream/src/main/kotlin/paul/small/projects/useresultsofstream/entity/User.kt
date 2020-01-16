package paul.small.projects.useresultsofstream.entity

data class Registry(val users : List<User>, val city: String)

data class User(val name: String, val email: String)
