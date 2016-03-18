package bibliotecaUI;

import java.io.IOException;
import java.util.ArrayList;

import entidades.Volume;
import entidades.VolumeDAOImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.StackPane;

public class ConsultaController {
	@FXML
	ListView<String> listView = new ListView<String>();
	ObservableList<String> items =FXCollections.observableArrayList ();
	
     @FXML
     public void initialize(){
    	 Volume v;
    	 VolumeDAOImpl vD = new VolumeDAOImpl();
    	 int i = 1;
    	 while(i != 100){
	    		v = vD.selectById(i);
	    		if(v != null)
	    			items.add(v.getId().toString() + " - " + v.getTitulo());
	    		i++;
    	 }
     
	  listView.setItems(items);
    	
    }
	public void clickBtnVoltar() throws IOException{
	
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

		Scene screen = new Scene(root,800, 600);
		Main.primaryStage.setTitle("Biblioteca");
		Main.primaryStage.setScene(screen);
		Main.primaryStage.show();
	}
}
