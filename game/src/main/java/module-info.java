module com.example.game {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.game to javafx.fxml;
    exports com.example.game;
    exports com.example.ViewPackage;
    opens com.example.ViewPackage to javafx.fxml;
}