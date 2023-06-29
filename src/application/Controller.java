package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller implements Initializable {

	@FXML
	private Label myLabel;
	@FXML
	private ChoiceBox<String> myChoiceBox;
	
	private String[] foods = {"pizza", "sushi", "ramen"};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		myChoiceBox.getItems().addAll(foods);
		
// First option:		
//		myChoiceBox.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent arg0) {
//				getFood(arg0);
//			}
//		});
		
// Second option:
		myChoiceBox.setOnAction(this::getFood);
	}
	
	public void getFood(ActionEvent event) {
		myLabel.setText(myChoiceBox.getValue());
	}
}
