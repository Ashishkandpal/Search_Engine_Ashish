module com.example.search_engine_ashish {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.search_engine_ashish to javafx.fxml;
    exports com.example.search_engine_ashish;
}