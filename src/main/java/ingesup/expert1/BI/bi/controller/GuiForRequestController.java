package ingesup.expert1.BI.bi.controller;

import ingesup.expert1.BI.bi.entity.Country;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.HBoxBuilder;
import javafx.stage.Stage;

public class GuiForRequestController implements Initializable {

	// DEFINE Country list

	@FXML
	ComboBox<Country> countries = null;

	private final static ObservableList strings = FXCollections.observableArrayList(
			"Option 1", "Option 2", "Option 3", "Option 4", "Option 5",
			"Option 6", "Longer ComboBox item", "Option 7", "Option 8",
			"Option 9", "Option 10", "Option 12");

	public static void init(Stage primaryStage) {
		Group root = new Group();
		primaryStage.setScene(new Scene(root));

		HBox hbox = HBoxBuilder.create().alignment(Pos.CENTER).spacing(15).build();

		// Editable combobox. Use the default item display length
		ComboBox<String> editableComboBox = new ComboBox<String>();
		editableComboBox.setId("second-editable");
		editableComboBox.setPromptText("Edit or Choose...");
		editableComboBox.setItems(strings);
		editableComboBox.setEditable(true);

		hbox.getChildren().addAll(editableComboBox);
		root.getChildren().add(hbox);
	}
	

	public void start(Stage primaryStage) throws Exception {
		init(primaryStage);
		primaryStage.show();
	}

	public void initialize(URL location, ResourceBundle resources) {

	}

}
