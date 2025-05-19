package com.github.mirospanacek.ares.controllers;

import com.github.mirospanacek.ares.model.AresClient;
import com.github.mirospanacek.ares.model.pojo.EconomicEntity;
import com.github.mirospanacek.ares.model.pojo.RootOfRequest;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URISyntaxException;

public class AresController {
    private static final Logger LOG =
            LoggerFactory.getLogger(AresController.class);

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
        LOG.info("INIT!!!");
        initTable();
    }

    @FXML
    public void searchEntity(ActionEvent event) throws IOException,InterruptedException, URISyntaxException {
        AresClient client = new AresClient();
        LOG.info("GO!!!");
        String input = searchFieldIco.getText();
        try {

            RootOfRequest root = client.getResult(client.search(input));
            ObservableList<EconomicEntity> data = FXCollections.observableArrayList(
                    root.getEconomicEntities().getFirst()
            );
            LOG.info("DATA: {}", root.getEconomicEntities().getFirst().toString());
            tableView.setItems(data);
            LOG.info("Zadaná hodnota: " + input);
        } catch (NumberFormatException e) {
            LOG.error(e.getMessage());
        }
        LOG.info("Search");
    }

    private void initTable() {
        tableView = new TableView<>();
        tableView.setPlaceholder(new Label("No data to display"));
        TableColumn<EconomicEntity, String> ico = new TableColumn("ICO");
        ico.setPrefWidth(100);
        TableColumn<EconomicEntity, String> vat = new TableColumn("VAT");
        vat.setPrefWidth(100);
        TableColumn<EconomicEntity, String> name = new TableColumn("NAME");
        name.setPrefWidth(250);
        TableColumn<EconomicEntity, String> streetName = new TableColumn("Street name");
        streetName.setPrefWidth(100);
        TableColumn<EconomicEntity, Integer> buildingNumber = new TableColumn("Building number");
        buildingNumber.setPrefWidth(150);
        TableColumn<EconomicEntity, String> postalCode = new TableColumn("Postal code");
        postalCode.setPrefWidth(100);
        TableColumn<EconomicEntity, String> establisehmentDay = new TableColumn("Establisehment day");
        establisehmentDay.setPrefWidth(150);

        ico.setCellValueFactory(new PropertyValueFactory<>("ico"));
        vat.setCellValueFactory(new PropertyValueFactory<>("vatNumber"));
        name.setCellValueFactory(new PropertyValueFactory<>("tradeName"));
        streetName.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getAddress().getStreetName()));
        buildingNumber.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().getAddress().getBuildingNumber()));
        postalCode.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getAddress().getPostalCode()));
        establisehmentDay.setCellValueFactory(new PropertyValueFactory<>("establishmentDate"));

        tableView.getColumns().addAll(ico,
                vat,
                name,
                streetName,
                buildingNumber,
                postalCode,
                establisehmentDay);
        dataContainer.getChildren().add(tableView);
    }


}
