module ku.cs {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.cs211671project to javafx.fxml;
    exports ku.cs.cs211671project;
    exports ku.cs.controllers;
    exports ku.cs.controllers.faculty to javafx.fxml;
    opens ku.cs.controllers to javafx.fxml;
    opens ku.cs.controllers.faculty to javafx.fxml;

}