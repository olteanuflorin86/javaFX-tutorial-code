package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller implements Initializable{

	@FXML
	private Label myLabel;
	@FXML
	private Slider myVerticalSlider;
	
	private int myTemperature;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		myTemperature = (int)myVerticalSlider.getValue();
		myLabel.setText(Integer.toString(myTemperature) + " degrees C");
		
		myVerticalSlider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				
				myTemperature = (int)myVerticalSlider.getValue();
				myLabel.setText(Integer.toString(myTemperature) + " degrees C");
				
			}
			
		});
		
	}

	
}
