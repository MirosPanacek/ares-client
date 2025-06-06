module com.github.mirospanacek.ares {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.fxml;
    requires org.slf4j;
    requires ch.qos.logback.classic;
    requires java.naming;
    requires java.net.http;
    requires jdk.crypto.ec;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires com.fasterxml.jackson.databind;
    requires java.desktop;

    exports com.github.mirospanacek.ares;
    opens com.github.mirospanacek.ares.controllers to javafx.fxml;
    opens com.github.mirospanacek.ares.model to com.fasterxml.jackson.databind, com.fasterxml.jackson.datatype.jsr310;
    opens com.github.mirospanacek.ares.model.pojo to com.fasterxml.jackson.databind, javafx.base;
}