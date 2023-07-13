package energister.springcloudstreamkafkasamples.avro.polyglot.reader

import org.apache.avro.generic.GenericRecord
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.messaging.Message
import java.util.function.Consumer

fun main(args: Array<String>) {
	runApplication<AvroPolyglotReaderApp>(*args)
}

@SpringBootApplication
class AvroPolyglotReaderApp {
	@Bean("topicConsumer")
	fun consumer(): Consumer<Message<GenericRecord>> {
		return Consumer { cloudMessage ->
			val i = 0
		}
	}
}
