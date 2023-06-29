package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
			Parent root = loader.load();
			
			Controller controller = loader.getController();
			
			Scene scene = new Scene(root);
			
			scene.setOnKeyPressed(event -> {
					
//					System.out.println(event.getCode());
//					String keyValue = event.getCode().toString();
					
					switch(event.getCode()) {
						case UP: // W:
							controller.moveUp();
							break;
						case DOWN: // S:
							controller.moveDown();
							break;
						case LEFT: // A:
							controller.moveLeft();
							break;			
						case RIGHT: // D:
							controller.moveRight();
							break;				
						default:
							System.out.println(event.getCode().toString() + " was pressed");
					}
				
			});
			
			
			primaryStage.setScene(scene);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			String css = this.getClass().getResource("application.css").toExternalForm();			
			scene.getStylesheets().add(css);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
