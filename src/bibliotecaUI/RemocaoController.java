package bibliotecaUI;

import java.io.IOException;

import entidades.Volume;
import entidades.VolumeDAOImpl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RemocaoController {
	@FXML 
	public Button btnDeletar;
	@FXML
	public TextField txtId;
	
	public void clickBtnDeletar() throws IOException{
		try{
		Integer id = Integer.parseInt(txtId.getText());
		VolumeDAOImpl vD = new VolumeDAOImpl();
		vD.removeById(id);
		Parent root = FXMLLoader.load(getClass().getResource("AlertaSucesso.fxml"));
		Scene screen = new Scene(root,600, 100);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
		}catch(Exception e){
			Parent root = FXMLLoader.load(getClass().getResource("AlertaErroPersistencia.fxml"));
			Scene screen = new Scene(root,600, 100);
			Main.primaryStage.setTitle("Biblioteca");
			Main.primaryStage.setScene(screen);
			Main.primaryStage.show();
		}
	}
	public void clickBtnVoltar() throws IOException{
		Parent root2 = FXMLLoader.load(getClass().getResource("Menu.fxml"));

		Scene screen = new Scene(root2,801, 589);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
	}
}
