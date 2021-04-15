package jump.coder.sboot

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinWebApp

fun main(args: Array<String>) {
	runApplication<KotlinWebApp>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}

data class Message(val id: String?, val text: String)

@RestController
class MessageResource{
	@GetMapping("/")
	fun list(): List<Message> = listOf(
		Message("1", "Hello!"),
		Message("2", "Bonjour!"),
		Message("3", "Privet!"),
	)
	//    @GetMapping("/hello")
	@RequestMapping("/hello")
	fun hello(): String {
		return "Hello!"
	}
}