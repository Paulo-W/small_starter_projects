package paul.projects.dslinkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DslInKotlinApplication

fun main(args: Array<String>) {
	runApplication<DslInKotlinApplication>(*args)
}
