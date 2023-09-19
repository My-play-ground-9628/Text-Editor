package lk.ijse.dep11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Optional;

public class AppInitializer extends Application {

    public static boolean isSplash = false;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/MainScene.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Text Editor");
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setMaximized(true);

        primaryStage.setOnCloseRequest(e->{
            Optional<ButtonType> buttonRef = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure to exit?", ButtonType.YES, ButtonType.NO).showAndWait();
            if (buttonRef.get() == ButtonType.NO){
                e.consume();
            }
        });

    }

}
