package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene6Controller {
	
	@FXML
	Label nameLabel;
	
	public void displayName(String username) {
		nameLabel.setText("Hello: " + username);
	}
}