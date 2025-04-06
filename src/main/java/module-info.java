module com.github.mirospanacek.ares {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.fxml;
    requires org.slf4j;
    requires com.fasterxml.jackson.annotation;
    requires java.net.http;
    exports com.github.mirospanacek.ares;
    opens com.github.mirospanacek.ares.controllers to javafx.fxml;
    
}