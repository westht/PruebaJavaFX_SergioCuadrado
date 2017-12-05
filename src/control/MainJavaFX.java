package control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * Este proyecto es la Prueba de Desarrollo de Interfaces. Se trata de una ventana
 * login y de otra ventana llamada FreeSolo.
 * 
 * @author Sergio Cuadrado
 * 
 * 
 * @version 1.6
 *
 */
public class MainJavaFX extends Application {
	private AnchorPane rootLayout;	
	Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			loadWindow();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public void loadWindow(){
		try {

			FXMLLoader loader=new FXMLLoader(getClass().getResource("../vista/Login.fxml"));
	        AnchorPane pane=loader.load();
	        stage.setScene(new Scene(pane));
	        stage.setTitle("Login");
	        stage.show();
 

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
