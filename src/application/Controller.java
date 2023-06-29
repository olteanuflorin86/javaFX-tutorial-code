package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML
	private CheckBox myCheckBox;
	@FXML	
	private ImageView myImageView;
	@FXML
	private Label myLabel;
	
	Image image1 = new Image("D:\\Work\\Java\\workspace9_2\\HelloSceneBuilder\\src\\application\\lightbulb1.jpg");
	Image image2 = new Image("D:\\Work\\Java\\workspace9_2\\HelloSceneBuilder\\src\\application\\lightbulb2.jpg");

//	Image image1 = new Image(getClass().getResourceAsStream("lightbulb1.jpg"));
//	Image image2 = new Image(getClass().getResourceAsStream("lightbulb2.jpg"));
	
	public void change(ActionEvent event) {
		if(myCheckBox.isSelected()) {
			myImageView.setImage(image1);
			myLabel.setText("ON");
		} else {
			myImageView.setImage(image2);
			myLabel.setText("OFF");
		}
	}
	
}
