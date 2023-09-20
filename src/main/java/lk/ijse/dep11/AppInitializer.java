package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;
import java.util.Optional;

import static javax.swing.text.StyleConstants.Background;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane rootPane = FXMLLoader.load(getClass().getResource("/view/SplashScreenScene.fxml"));
        Scene splashScene = new Scene(rootPane);
        primaryStage.setScene(splashScene);
        primaryStage.setTitle("Undecorated Window");

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.centerOnScreen();
        primaryStage.show();

        FadeTransition fadeIn = new FadeTransition(Duration.seconds(2),rootPane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.setCycleCount(1);

        FadeTransition fadeout = new FadeTransition(Duration.seconds(2),rootPane);
        fadeout.setFromValue(1);
        fadeout.setToValue(0);
        fadeout.setCycleCount(1);
        fadeIn.play();

        fadeIn.setOnFinished((event -> {
            fadeout.play();
        }));

        fadeout.setOnFinished((event -> {
            primaryStage.close();
            try{
                mainSceneMethod();
            }catch (Exception exp){
                throw new RuntimeException(exp);
            }
        }));

    }

    public void mainSceneMethod() throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
        Scene mainScene = new Scene(root);
        Stage EditorStage = new Stage();
        EditorStage.setScene(mainScene);
        EditorStage.setTitle("Edit Text Editor");
        EditorStage.centerOnScreen();
        EditorStage.show();
        EditorStage.setMaximized(true);

        EditorStage.setOnCloseRequest(e->{
            Optional<ButtonType> buttonRef = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure to exit?", ButtonType.YES, ButtonType.NO).showAndWait();
            if (buttonRef.get() == ButtonType.NO){
                e.consume();
            }
        });

    }

}
