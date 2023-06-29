package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {

	@FXML
	private ColorPicker myColorPicker;
	@FXML
	private Pane myPane;
	
	public void setBackgroundColor(ActionEvent event) {
		
		Color myColor = myColorPicker.getValue();
		myPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
	}
}
