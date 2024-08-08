package ku.cs.cs211671project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "CS211 Project", 800, 600);
        configRoutes();
        FXRouter.goTo("login");
    }

    private void configRoutes() {
        String viewPath = "ku/cs/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
        FXRouter.when("faculty-staff-approved", viewPath + "faculty-staff-approved.fxml");
        FXRouter.when("faculty-staff-management", viewPath + "faculty-staff-management.fxml");
        FXRouter.when("faculty-staff-table", viewPath + "faculty-staff-table.fxml");
        FXRouter.when("login", viewPath + "login.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}