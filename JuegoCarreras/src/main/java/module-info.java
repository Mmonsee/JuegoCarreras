module com.example.juegocarreras {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.juegocarreras to javafx.fxml;
    exports com.example.juegocarreras;
}