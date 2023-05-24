/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package projetogradleJavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    
    public static void main(String[] args) {
        launch();
    }

	@Override
	public void start(Stage palco) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("ProjetoGradleFX.fxml"));
	    
        Scene scene = new Scene(root, 300, 275);
    
        palco.setTitle("FXML Welcome");
        palco.setScene(scene);
        palco.show();
		
	}
}

