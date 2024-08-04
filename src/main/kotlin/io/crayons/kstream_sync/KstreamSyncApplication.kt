package io.crayons.kstream_sync

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KstreamSyncApplication

fun main(args: Array<String>) {
	runApplication<KstreamSyncApplication>(*args)
}
