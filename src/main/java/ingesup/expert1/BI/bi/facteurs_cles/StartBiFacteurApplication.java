package ingesup.expert1.BI.bi.facteurs_cles;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartBiFacteurApplication extends Application {

	@Override
	public void start(Stage primaryStage) {

		try {
			Parent root = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Identification Windown");
	//		ingesup.expert1.BI.bi.controller.GuiForRequestController.init(primaryStage);
			primaryStage.show();

		} catch (Exception e) {
			Logger.getLogger(StartBiFacteurApplication.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	
	
	
	
	public static void main(String[] args) {

		launch(args);

	}

}
