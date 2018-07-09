package com.sirolf2009.muse.core.consumer

import com.sirolf2009.muse.core.KafkaPair
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Properties
import java.util.function.Consumer
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors class RunnableConsumer<K, V> extends KafkaConsumer<K, V> implements Runnable {

	val Consumer<KafkaPair<K, V>> onValues
	val List<Consumer<? super RunnableConsumer<K, V>>> commands

	new(Properties properties, Consumer<KafkaPair<K, V>> onValues) {
		super(properties)
		this.onValues = onValues
		commands = Collections.synchronizedList(new ArrayList())
	}

	override run() {
		while(true) {
			try {
				commands.forEach[accept(this)]
			} catch(Exception e) {
			}
			try {
				poll(100).forEach [
					try {
						onValues.accept(new KafkaPair(key(), value()))
					} catch(Exception e) {
						e.printStackTrace()
					}
				]
			} catch(Exception e) {
				e.printStackTrace()
			}
		}
	}

	def addCommand(Consumer<? super RunnableConsumer<K, V>> command) {
		commands.add(command)
	}

}
