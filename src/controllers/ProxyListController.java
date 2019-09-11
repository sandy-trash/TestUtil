package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.CheckComboBox;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ProxyListController implements Initializable {

	@FXML
	private Button btnGo;

	private ObservableList<String> cmbxEnvList = FXCollections.observableArrayList("HPP IDC", "HINT1", "DEV3", "DEV4","HREG2");

	@FXML
	private CheckComboBox<String> cmbxEnv;
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cmbxEnv.getItems().addAll(cmbxEnvList);
		cmbxEnv.getCheckModel().getCheckedItems().addListener(new ListChangeListener<String>() {
		     public void onChanged(ListChangeListener.Change<? extends String> c) {
		         System.out.println(cmbxEnv.getCheckModel().getCheckedItems());
		     }
		 });
	}

}

