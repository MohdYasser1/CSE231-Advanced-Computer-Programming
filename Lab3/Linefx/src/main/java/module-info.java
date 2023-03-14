module Lab3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens Lab3 to javafx.fxml;
    exports Lab3;
}
