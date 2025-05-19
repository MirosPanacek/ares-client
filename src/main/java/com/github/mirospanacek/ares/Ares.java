package com.github.mirospanacek.ares;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ares extends Application{
    private static final Logger LOG =
            LoggerFactory.getLogger(Ares.class);
    private static final String RESOURCES_PATH = "/com/github/mirospanacek/ares/";
    public void ares() {
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        LOG.info("RUNNING");
        Parent root = FXMLLoader.load(getClass().getResource(RESOURCES_PATH +"Main.fxml"));
        Scene screne = new Scene(root);
        screne.getStylesheets()
                .add(getClass().getResource(RESOURCES_PATH + "application.css").toExternalForm());
        stage.setScene(screne);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        ;
    }

}
