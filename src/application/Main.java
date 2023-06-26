package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			String css = this.getClass().getResource("application.css").toExternalForm();			
			scene.getStylesheets().add(css);
			primaryStage.show();
			
			// Used when we click on the X button in the right-top corner:
			primaryStage.setOnCloseRequest(event -> {
				// we consume the event so that when we click Cancel after X we will not logout:
				event.consume();
				logout(primaryStage);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Used when we click on the X button in the right-top corner:
	public void logout(Stage stage) {
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to logout");
		alert.setContentText("Do you want to save before exiting?: ");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("You successfully logged out!");
			stage.close();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
