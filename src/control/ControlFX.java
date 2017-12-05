package control;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 * Este controlador es la Prueba de Desarrollo de Interfaces. Esta clase contiene las operaciones necesarias para
 * la funcionalidad del programa.
 * 
 * @author Sergio Cuadrado
 * 
 * 
 * @version 1.5
 *
 */

public class ControlFX {
	public void NuevaScreen() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainJavaFX.class.getResource("../vista/FreeSolo.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("FREESOLOYOLO");
            sendStage.initStyle(StageStyle.UNDECORATED);
            Scene scene = new Scene(page);
             sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void EndThePain(){
		System.exit(0);
	}

}
