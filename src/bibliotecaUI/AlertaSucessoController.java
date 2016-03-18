package bibliotecaUI;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AlertaSucessoController {
	@FXML
	public static Button btnOk;
	

	public void clickBtnOk() throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		
		Scene screen = new Scene(root,800, 600);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
	}
	
}
