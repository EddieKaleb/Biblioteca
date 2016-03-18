package bibliotecaUI;

import java.io.IOException;

import entidades.Volume;
import entidades.VolumeDAOImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroController {
	
	@FXML
	public TextField txtTitulo;
	@FXML
	public TextField txtVolume;
	@FXML
	public TextField txtPaginas;
	@FXML
	public TextField txtAutores;
	@FXML
	public TextField txtAno;
	@FXML
	public TextField txtEditora;
	@FXML
	public TextField txtDescricao;
	
	
	
	
	public void clickBtnConcluir() throws IOException, InterruptedException{
		Volume v = new Volume();
		String titulo = txtTitulo.getText();
		if(titulo.equals(""))
			v.setTitulo("SEM TÍTULO");
		else
		v.setTitulo(titulo);
		String volume = txtVolume.getText();
		v.setVolume(volume);
		String paginas = txtPaginas.getText();
		v.setPaginas(paginas);
		String autores = txtAutores.getText();
		v.setAutores(autores);
		String ano = txtAno.getText();
		v.setAno(ano);
		String editora = txtEditora.getText();
		v.setEditora(editora);
		String descricao = txtDescricao.getText();
		v.setDescricao(descricao);
		
		VolumeDAOImpl vD = new VolumeDAOImpl();
		vD.persist(v);
		
		Parent root = FXMLLoader.load(getClass().getResource("AlertaSucesso.fxml"));
		Scene screen = new Scene(root,600, 100);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
		
	}
	public void clickBtnVoltar() throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

		Scene screen = new Scene(root,800,600);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
	}
}
