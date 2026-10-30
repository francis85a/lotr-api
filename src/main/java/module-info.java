module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires tools.jackson.databind;

    opens com.example to javafx.fxml;
    opens com.example.models to tools.jackson.databind;
    exports com.example;
    exports com.example.models;
}
