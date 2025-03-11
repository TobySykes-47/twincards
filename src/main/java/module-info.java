module level5.software {
    requires javafx.controls;
    requires javafx.fxml;

    opens level5.software to javafx.fxml;
    exports level5.software;
}
