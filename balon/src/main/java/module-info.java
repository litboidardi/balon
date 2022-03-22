module com.example.balon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.balon to javafx.fxml;
    exports com.example.balon;
}