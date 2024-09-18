module com.rowaeremkin.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rowaeremkin.javafxdemo to javafx.fxml;
    exports com.rowaeremkin.javafxdemo;
}