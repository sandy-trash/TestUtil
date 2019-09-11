package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HomeController implements Initializable{

	@FXML
    private Button btnSingle;

    @FXML
    private Button btnMulti;

    @FXML
    private Button btnProxy;

    @FXML
    private Button btnEnv;
    
    @FXML
    private void handleButtonClicks(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == btnSingle) {
            loadStage("/view/SingleTestData.fxml");
        } else if (mouseEvent.getSource() == btnMulti) {
            loadStage("/view/MultiTestData.fxml");
        } else if (mouseEvent.getSource() == btnProxy) {
            loadStage("/view/ProxyList.fxml");
        }else if (mouseEvent.getSource() == btnEnv) {
            loadStage("/view/EnvHealth.fxml");
        }
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	 private void loadStage(String fxml) {
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource(fxml));
	            Stage stage = new Stage();
	            stage.setScene(new Scene(root));
	            stage.getIcons().add(new Image("/icons/kplogo.png"));
	            stage.initModality(Modality.APPLICATION_MODAL);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
