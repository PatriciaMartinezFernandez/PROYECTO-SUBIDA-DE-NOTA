package main.java;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerMenu {

	private Stage stage;
	private Scene scene;
	private Parent root;

	public void altaMascota(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/main/resources/fxml/altaMascota.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void bajaMascota(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/main/resources/fxml/bajaMascota.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void editarMascota(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/main/resources/fxml/editarMascota.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void listaMascota(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/main/resources/fxml/listaMascotas.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
