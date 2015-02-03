package ingesup.expert1.BI.bi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

	@FXML
	private Label lblMessage;
	@FXML
	private TextField txtUsername;
	@FXML
	private PasswordField txtPassword;

	@FXML
	private void btnLoginAction(ActionEvent event) throws Exception{

		if (txtUsername.getText().equals("0") && txtPassword.getText().equals("0")) {
			
			// lblMessage.setText(" Welcome  " + txtUsername.getText());
			
			((Node)(event.getSource())).getScene().getWindow().hide();
			
			Parent parent = FXMLLoader.load(getClass().getResource("/fxml/GuiForRequest.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Request Window");
			stage.show();
			
		} else {
			lblMessage.setText("UserName or Password Invalid !!!");
		}
	}
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
