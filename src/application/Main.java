package application;
	

import javafx.application.Application;  
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
//			Stage stage2 = new Stage();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Image icon = new Image("icon.png");
			
			primaryStage.setTitle("Stage Demo Program");
			primaryStage.getIcons().add(icon);
			primaryStage.setWidth(650);
			primaryStage.setHeight(650);
			primaryStage.setResizable(false);
//			primaryStage.setX(50);
//			primaryStage.setY(50);
//			primaryStage.setFullScreen(true);
//			primaryStage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
//			primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
			
			Text text1 = new Text();
			text1.setText("Some text");
			text1.setX(50);
			text1.setY(50);
			text1.setFont(Font.font("Verdana",30));
			text1.setFill(Color.LIMEGREEN);
			
			Line line1 = new Line();
			line1.setStartX(100);
			line1.setStartY(200);
			line1.setEndX(200);
			line1.setEndY(200);
			line1.setStrokeWidth(5);
			line1.setStroke(Color.BLUEVIOLET);
			line1.setOpacity(0.5);
			line1.setRotate(45);
			
			Rectangle rectangle1 = new Rectangle();
			rectangle1.setX(75);
			rectangle1.setY(75);
			rectangle1.setWidth(50);
			rectangle1.setHeight(50);
			rectangle1.setFill(Color.BLUE);
			rectangle1.setStrokeWidth(5);
			rectangle1.setStroke(Color.BLACK);
			
			Polygon triangle1 = new Polygon();
			triangle1.getPoints().setAll(
					200.0,200.0,
					300.0,300.0,
					200.0,300.0
					);
			triangle1.setFill(Color.YELLOW);
			
			Circle circle1 = new Circle();
			circle1.setCenterX(350);
			circle1.setCenterY(350);
			circle1.setRadius(50);
			circle1.setFill(Color.ORANGE);
			
			Image image = new Image("pizza.jpg");
			ImageView imageView = new ImageView(image);
			imageView.setX(400);
			imageView.setY(400);
			
			root.getChildren().add(text1);
			root.getChildren().add(line1);
			root.getChildren().add(rectangle1);
			root.getChildren().add(triangle1);
			root.getChildren().add(circle1);
			root.getChildren().add(imageView);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
