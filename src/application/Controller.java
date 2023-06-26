package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML

	ImageView myImageView;
	Button myButton;
	
	Image myImage = new Image(getClass().getResourceAsStream("shrek2.jpg"));
	
	public void displayImage() {
		myImageView.setImage(myImage);
	}

}
