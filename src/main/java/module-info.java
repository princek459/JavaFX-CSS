module com.example.javafxapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.desktop;



    opens com.example.javafxapplication to javafx.fxml;
    exports com.example.javafxapplication;
}