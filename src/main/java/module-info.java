module com.example.postfija {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires jdk.jfr;

    opens com.example.postfija to javafx.fxml;
    exports com.example.postfija;
}