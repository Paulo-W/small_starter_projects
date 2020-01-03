package paul.projects.dslinkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import paul.projects.dslinkotlin.lambdas.LambdaWithReceiver
import paul.projects.dslinkotlin.lambdas.RegularLambdaFunction

@SpringBootApplication
class DslInKotlinApplication

fun main(args: Array<String>) {
	runApplication<DslInKotlinApplication>(*args)
	regularLambda()
	LambdaWithReceiver().receiverBuilder()

}

fun regularLambda() {
	val basic = RegularLambdaFunction()
	println("result: ${basic.s}")
}