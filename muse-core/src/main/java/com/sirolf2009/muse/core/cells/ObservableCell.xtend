package com.sirolf2009.muse.core.cells

import com.fxgraph.cells.AbstractCell
import com.fxgraph.graph.Graph
import io.reactivex.Observable
import javafx.scene.control.Label
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor @Accessors class ObservableCell<T> extends AbstractCell implements MuseCell<T> {
	
	val Observable<T> observable
	
	override getGraphic(Graph graph) {
		return new Label(observable.toString())
	}
	
	override getLastOutput() {
		return observable
	}
	
}