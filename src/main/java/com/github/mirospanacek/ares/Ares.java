package com.github.mirospanacek.ares;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ares extends Application{
    private String resourcesPath = "/com/github/mirospanacek/ares/";
    public void ares() {
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(resourcesPath +"Main.fxml"));
        Scene screne = new Scene(root);
        screne.getStylesheets()
                .add(getClass().getResource(resourcesPath + "application.css").toExternalForm());
        stage.setScene(screne);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        ;
    }

}
