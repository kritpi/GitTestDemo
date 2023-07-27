module ku.cs.gittest {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.gittest to javafx.fxml;
    exports ku.cs.gittest;
}