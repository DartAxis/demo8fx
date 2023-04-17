package ru.dartinc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image icon = new Image(Objects.requireNonNull(Main.class.getResourceAsStream("/icon/finance2.png")));

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/forms/loginForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 400);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }
}