package application;
	
import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
// event handling using Scene Builder:			
//			BorderPane root = new BorderPane();
//			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
//			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			String css = this.getClass().getResource("application.css").toExternalForm();			
//			scene.getStylesheets().add(css);
//			primaryStage.setScene(scene);
			
// CSS styling:
//			Parent root = FXMLLoader.load(getClass().getResource("Main2.fxml"));
//			Scene scene2 = new Scene(root);
//			String css = this.getClass().getResource("application.css").toExternalForm();			
//			scene2.getStylesheets().add(css);
//			primaryStage.setScene(scene2);
			
// switch scene:
//			Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
//			Scene scene3 = new Scene(root);
//			//String css = this.getClass().getResource("application.css").toExternalForm();			
//			//scene3.getStylesheets().add(css);
//			primaryStage.setScene(scene3);
			
// communication between controllers:
			Parent root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
			Scene scene5 = new Scene(root);
			primaryStage.setScene(scene5);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
