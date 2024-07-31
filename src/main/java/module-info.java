module ku.cs {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ku.cs.basicjavafx to javafx.fxml;
    exports ku.cs.basicjavafx;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;

    exports ku.cs.models;
    opens ku.cs.models to javafx.base;
}