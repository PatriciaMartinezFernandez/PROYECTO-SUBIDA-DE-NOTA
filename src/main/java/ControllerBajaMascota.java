package main.java;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerBajaMascota {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void volver(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/main/resources/fxml/menuPetCare.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}