package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainSceneController {
    public AnchorPane root;
    public MenuItem menuItemNew;
    public MenuItem menuItemExit;
    public MenuItem menuItemUserGuide;
    public MenuItem menuItemAboutUs;


    public void menuItmNewOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane scene1Root = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
        Scene scene1 = new Scene(scene1Root);
        Stage stage = new Stage();
        stage.setScene(scene1);
        stage.setTitle("Text Editor");
        stage.setMaximized(true);
        stage.show();
    }

    public void menuItemExitOnAction(ActionEvent actionEvent) throws Exception{
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

    public void menuItemUserGuideOnAction(ActionEvent actionEvent) throws Exception {

        AnchorPane userGuideSceneRoot = FXMLLoader.load(getClass().getResource("/view/UserGuideScene.fxml"));
        Scene userGuideScene = new Scene(userGuideSceneRoot);
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.setScene(userGuideScene);
        stage.setTitle("User Guide for Text Editor");
        stage.show();
        stage.setMaximized(false);


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

//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        if (!AppInitializer.isSplash){
//            loadSplashScreen();
//
//        }
//    }
//
//    private void loadSplashScreen (){
//        try {
//            AppInitializer.isSplash = true;
//            StackPane pane = FXMLLoader.load(getClass().getResource("/view/SplashScreenScene.fxml"));
//            root.getChildren().setAll(pane);
//
//            FadeTransition fadeIn = new FadeTransition(Duration.seconds(2),pane);
//            fadeIn.setFromValue(0);
//            fadeIn.setToValue(1);
//            fadeIn.setCycleCount(1);
//
//            FadeTransition fadeout = new FadeTransition(Duration.seconds(2),pane);
//            fadeout.setFromValue(1);
//            fadeout.setToValue(0);
//            fadeout.setCycleCount(1);
//
//            fadeIn.play();
//
//            fadeIn.setOnFinished((event -> {
//                fadeout.play();
//            }));
//
//            fadeout.setOnFinished((event -> {
//                try {
//                    AnchorPane textEditor = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
//                    root.getChildren().setAll(textEditor);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//    }
}
