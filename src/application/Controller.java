package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;

public class Controller implements Initializable {

	@FXML
	private Label myLabel;
	
	@FXML
	private ListView<String> myListView;
	
	private String[] foods = {"pizza", "sushi", "ramen"};
	
	private String currentFood;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		myListView.getItems().addAll(foods);
		
		myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {

				currentFood = myListView.getSelectionModel().getSelectedItem();
				
				myLabel.setText(currentFood);
			}
		});
		
	}
}
