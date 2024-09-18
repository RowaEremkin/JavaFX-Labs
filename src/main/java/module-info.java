module com.rowaeremkin.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.incubator.vector;


    opens com.rowaeremkin.javafxdemo to javafx.fxml;
    exports com.rowaeremkin.javafxdemo;
}