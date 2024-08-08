package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class LoginController {
    @FXML
    private ImageView sampleImageView;

    @FXML
    public void initialize() {
        Image image = new Image(getClass().getResourceAsStream("/images/login_page.jpg"));
        sampleImageView.setImage(image);
    }
    @FXML
    public void onLoginButtonClick() {
        try {
            FXRouter.goTo("faculty-staff-table");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
