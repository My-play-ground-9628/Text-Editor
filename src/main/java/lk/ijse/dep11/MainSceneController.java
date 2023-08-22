package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainSceneController {
    public AnchorPane root;
    public MenuItem mnuitmNew;
    public MenuItem mnuitmExit;
    public MenuItem mnuitmUserGuide;

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
        loginStage.close();

    }

    public void mnuitmUserGuideOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane userGuideSceneRoot = FXMLLoader.load(getClass().getResource("/view/UserGuideScene.fxml"));
        Scene userGuideScene = new Scene(userGuideSceneRoot);
        Stage stage = new Stage();
        stage.setScene(userGuideScene);
        stage.setTitle("User Guide for Text Editor");
        stage.show();
        stage.setMaximized(true);


    }
}
