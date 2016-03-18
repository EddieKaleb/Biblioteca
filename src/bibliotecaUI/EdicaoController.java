package bibliotecaUI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Volume;
import entidades.VolumeDAOImpl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class EdicaoController {
	@FXML
	public TextField txtId;
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
		
	public void clickBtnConcluir() throws IOException{
			try{
			VolumeDAOImpl vD = new VolumeDAOImpl();
			Integer id = Integer.parseInt(txtId.getText());
			Volume v = vD.selectById(id);
			String titulo = txtTitulo.getText();
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
			vD.merge(v);
	
			
			Parent root = FXMLLoader.load(getClass().getResource("AlertaSucesso.fxml"));
			Scene screen = new Scene(root,600, 100);
			Main.primaryStage.setTitle("Biblioteca");
			Main.primaryStage.setScene(screen);
			Main.primaryStage.show();
			}catch(Exception e){
				Parent root = FXMLLoader.load(getClass().getResource("AlertaErroDigitado.fxml"));
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
