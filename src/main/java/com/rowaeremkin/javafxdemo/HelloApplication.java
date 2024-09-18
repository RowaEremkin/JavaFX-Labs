package com.rowaeremkin.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Classic(stage);
    }
    public void FXML(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void Classic(Stage stage) {
        FlowPane flowPane = new FlowPane();
        Scene scene = new Scene(flowPane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        Button buttonOne = new Button("One");
        flowPane.getChildren().add(buttonOne);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}