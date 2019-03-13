package com.sirolf2009.muse.akka.server.graph

import com.fxgraph.cells.AbstractCell
import com.fxgraph.graph.Graph
import javafx.beans.property.DoubleProperty
import javafx.beans.property.SimpleDoubleProperty
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.ProgressBar
import javafx.scene.layout.BorderPane
import javafx.scene.text.Text
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor @Accessors class ServerCell extends AbstractCell {

	val String path
	val DoubleProperty loadProperty = new SimpleDoubleProperty()

	override getGraphic(Graph graph) {
		val pane = new BorderPane()
		pane.getStyleClass().add("graph-cell")
		pane.setPrefSize(50, 50)

		new Text(path) => [
			getStyleClass().add("white-text")
			BorderPane.setMargin(it, new Insets(10))
			BorderPane.setAlignment(it, Pos.CENTER)
			pane.setCenter(it)
		]

		new ProgressBar() => [
			progressProperty().bind(loadProperty)
			setMouseTransparent(true)
			BorderPane.setAlignment(it, Pos.CENTER)
			pane.setBottom(it)
		]

		return pane
	}
	
	
	override toString() {
		return '''ServerCell [«path»]'''
	}

}
