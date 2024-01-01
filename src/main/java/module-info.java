module com.example.gametest01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.gametest01 to javafx.fxml;
    exports com.example.gametest01;
}