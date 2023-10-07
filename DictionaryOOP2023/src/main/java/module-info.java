module com.example.dictionaryoop2023 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.dictionaryoop2023 to javafx.fxml;
    exports com.example.dictionaryoop2023;
}