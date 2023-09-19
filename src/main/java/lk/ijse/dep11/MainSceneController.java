package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Optional;

public class MainSceneController {
    public AnchorPane root;
    public MenuItem mnuitmNew;
    public MenuItem mnuitmExit;
    public MenuItem mnuitmUserGuide;
    public MenuItem mnuitmAboutUs;


    public void mnuitmNewOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane scene1Root = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
        Scene scene1 = new Scene(scene1Root);
        Stage stage = new Stage();
        stage.setScene(scene1);
        stage.setTitle("Text Editor");
        stage.setMaximized(true);
        stage.show();
    }

    public void mnuitmExitOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane scene1Root = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
        Scene scene1 = new Scene(scene1Root);
        Stage stage = new Stage();
        stage.setScene(scene1);
        Stage loginStage = (Stage) root.getScene().getWindow();
        Optional<ButtonType> buttonRef = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure to exit?", ButtonType.YES, ButtonType.NO).showAndWait();
        if (buttonRef.get() == ButtonType.YES){
            loginStage.close();
            }

    }

    public void mnuitmUserGuideOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane userGuideSceneRoot = FXMLLoader.load(getClass().getResource("/view/UserGuideScene.fxml"));
        Scene userGuideScene = new Scene(userGuideSceneRoot);
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.setScene(userGuideScene);
        stage.setTitle("User Guide for Text Editor");
        stage.show();
        stage.setMaximized(true);


    }

    public void mnuitmAboutUsOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane aboutUsSceneRoot = FXMLLoader.load(getClass().getResource("/view/AboutUsScene.fxml"));
        Scene aboutUsScene = new Scene(aboutUsSceneRoot);
        Stage stage = new Stage();
        stage.setScene(aboutUsScene);
        stage.setTitle("About Us");

        stage.initStyle(StageStyle.TRANSPARENT);
        aboutUsSceneRoot.setBackground(Background.fill(Color.TRANSPARENT));
        aboutUsScene.setFill(Color.TRANSPARENT);
        stage.centerOnScreen();
        stage.show();
    }
}
