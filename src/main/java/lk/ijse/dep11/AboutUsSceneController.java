package lk.ijse.dep11;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Optional;

public class AboutUsSceneController {

    public Button btClose;
    public AnchorPane root;

    Stage stage;

    public void btnCloseOnAction(ActionEvent e) throws Exception{
        stage = (Stage) root.getScene().getWindow();
        stage.close();
    }
}
