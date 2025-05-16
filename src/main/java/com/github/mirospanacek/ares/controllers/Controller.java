package com.github.mirospanacek.ares.controllers;

import com.github.mirospanacek.ares.model.AresClient;
import com.github.mirospanacek.ares.model.pojo.EconomicEntity;
import com.github.mirospanacek.ares.model.pojo.Root;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

public class Controller{
    private static final Logger LOG = 
            LoggerFactory.getLogger(Controller.class);

    @FXML
    private TextField searchFieldIco;
    @FXML
    private Button buttonSearch;
    @FXML
    private VBox dataContainer;
    @FXML
    private TableView tableView;

    @FXML
    private void initialize() {
        initTable();
    }
    
    @FXML
    public void searchEntity(ActionEvent event) {
        AresClient client = new AresClient();

        String input = searchFieldIco.getText();
        try {

            Root root = client.getResult(client.search(input));
            ObservableList<EconomicEntity> data = FXCollections.observableArrayList(
                    root.getEconomicEntities().getFirst()
            );
            LOG.info("DATA: {}", root.getEconomicEntities().getFirst().toString());
            tableView.setItems(data);
            LOG.info("Zadaná hodnota: " + input);
        } catch (NumberFormatException | IOException | InterruptedException | URISyntaxException e) {
            LOG.error("Neplatné číslo!");
        }
        LOG.info("Search");
    }

    private void initTable() {
        tableView = new TableView<>();
        TableColumn ico = new TableColumn("ICO");
        ico.setCellValueFactory(new PropertyValueFactory("ico"));
        TableColumn name = new TableColumn("NAME");
        name.setCellValueFactory(new PropertyValueFactory("tradeName"));
        tableView.getColumns().addAll(ico, name);
        dataContainer.getChildren().add(tableView);
    }
    
    
}
