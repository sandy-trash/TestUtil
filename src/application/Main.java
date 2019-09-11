package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		 Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
	        primaryStage.setTitle("KP Utility Tool");
	        primaryStage.getIcons().add(new Image("/icons/kplogo.png"));
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
