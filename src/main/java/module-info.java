module uk.ac.aston.jpc.calc {
    requires javafx.controls;
    requires javafx.fxml;

    opens uk.ac.aston.jpc.calc to javafx.fxml;
    exports uk.ac.aston.jpc.calc;
}
