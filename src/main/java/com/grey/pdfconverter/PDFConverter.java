package com.grey.pdfconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PDFConverter extends Application {
    @Override
    public void start(Stage mainWindow) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PDFConverter.class.getResource("main-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainWindow.setTitle("Hello!");
        mainWindow.setScene(scene);
        mainWindow.show();
    }

    public static void main(String[] args) {
        launch();
    }
}