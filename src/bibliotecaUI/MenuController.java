package bibliotecaUI;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import bibliotecaUI.Main;

public class MenuController {

	@FXML
	public Button btnConsultar;
	@FXML
	public Button btnCadastrar;
	@FXML
	public Button btnEditar;
	@FXML
	public Button btnRemover;
	


	public void clickBtnConsultar() throws IOException{

		Parent root2 = FXMLLoader.load(getClass().getResource("Consulta.fxml"));
		
		
		Scene screen = new Scene(root2,801, 589);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();

	}
	public void clickBtnCadastrar() throws IOException{
		Parent root2 = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));

		Scene screen = new Scene(root2,801, 589);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
	}
	public void clickBtnEditar() throws IOException{
		Parent root2 = FXMLLoader.load(getClass().getResource("Edicao.fxml"));

		Scene screen = new Scene(root2,801, 589);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
	}
	public void clickBtnRemover() throws IOException{
		Parent root2 = FXMLLoader.load(getClass().getResource("Remocao.fxml"));

		Scene screen = new Scene(root2,801, 589);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
	}
}
