package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {

	@FXML
	private Label myLabel;
	@FXML
	private DatePicker myDatePicker;

	public void onSelectDate(ActionEvent event) {
		LocalDate myDate = myDatePicker.getValue();
		String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		myLabel.setText(myFormattedDate);
	}
	
}
