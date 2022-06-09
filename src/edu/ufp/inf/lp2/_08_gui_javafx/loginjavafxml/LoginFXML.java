package edu.ufp.inf.lp2._08_gui_javafx.loginjavafxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFXML extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("login_fxml0.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("login_fxml1.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("login_fxml2.fxml"));
        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
