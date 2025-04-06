package com.github.mirospanacek.ares.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller{
    private static final Logger LOG = 
            LoggerFactory.getLogger(Controller.class);
    
    @FXML
    public void searchEntity(ActionEvent e) {
        LOG.info("Search");
    }
    
    
}
