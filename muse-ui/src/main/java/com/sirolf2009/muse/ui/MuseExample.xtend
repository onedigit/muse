package com.sirolf2009.muse.ui

import com.fxgraph.graph.Graph
import com.fxgraph.layout.AbegoTreeLayout
import com.sirolf2009.muse.core.IGraphic
import com.sirolf2009.muse.core.KafkaPair
import com.sirolf2009.muse.core.MRXStream
import com.sirolf2009.muse.core.MStreamBuilder
import com.sirolf2009.muse.core.properties.KafkaConsumerProperties
import com.sirolf2009.muse.core.properties.LocalProperties
import javafx.application.Application
import javafx.collections.FXCollections
import javafx.scene.Scene
import javafx.scene.chart.LineChart
import javafx.scene.chart.NumberAxis
import javafx.scene.chart.XYChart
import javafx.scene.chart.XYChart.Series
import javafx.stage.Stage
import org.apache.kafka.common.serialization.Serdes
import org.eclipse.xtend.lib.annotations.Data

class MuseExample extends Application {

	def static void main(String[] args) throws Exception {
		launch(args)
	}

	override void start(Stage stage) throws Exception {
		val props = LocalProperties.withSerdes("example-application", Serdes.Long(), Serdes.Double())
		val builder = new MStreamBuilder(props)

		val MRXStream<KafkaPair<Long, Double>> consumerStream = builder.consume("prices", KafkaConsumerProperties.apply("consumer-group", "localhost:9092", Serdes.Long(), Serdes.Double()))
		consumerStream.map("*2") [
			getValue() * 2
		].map("/2") [
			it / 2
		].subscribe("print to screen") [
			println('''value: «it»''')
		]

//		val MKafkaStream<Long, Double> stream = builder.stream("prices")
//		stream.mapValues[it * 2].mapValues[it / 2].foreach[key, value|]
//		stream.mapValues[it * 2].mapValues[it / 2].foreach[key, value|]
//		stream.mapValues[new Number(it * 2)].mapValues[new Number(value / 2)].mapValues[new Number(value / 2)].mapValues[new Number(value * 2)].foreach("forEach")[]
//
//		val MKafkaStream<String, Integer> stream2 = builder.stream("random")
//		stream2.mapValues[it * 2].mapValues[it / 2].foreach[key, value|]
//
//		val MRXStream<Integer> numbers = builder.stream("numbers", #[0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
//		val numbers1Transformed = numbers.map("*2 ") [
//			it * 2
//		].map("/2") [
//			it / 2
//		]
//
//		val MRXStream<Integer> numbers2 = builder.stream("numbers2", #[0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
//		val numbers2Transformed = numbers2.map("*2 ") [
//			it * 2
//		].map("/2") [
//			it / 2
//		]
//
//		numbers1Transformed.concatWith("merge", numbers2Transformed).map("*2")[it * 2]

		val streams = builder.build()
		streams.cleanUpAndStart()
		val graph = new Graph(streams.getModel())
		graph.endUpdate()

		val scene = new Scene(graph.getScrollPane(), 1200, 600)
		scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm())

		stage.setTitle("Hello JavaFX and Maven")
		stage.setScene(scene)
		stage.show()

		graph.layout(new AbegoTreeLayout())
	}

	@Data static class Number implements IGraphic {
		val double value

		override getGraphic() {
			val chart = new LineChart(new NumberAxis(), new NumberAxis())
			chart.getData().add(new Series("Value", FXCollections.observableArrayList(new XYChart.Data(0, 0), new XYChart.Data(1, value))))
			chart.prefWidth = 32
			chart.prefHeight = 32
			return chart
		}

	}

}
