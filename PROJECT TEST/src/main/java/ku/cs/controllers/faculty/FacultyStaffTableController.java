package ku.cs.controllers.faculty;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class FacultyStaffTableController {
    @FXML private ImageView sampleImageView;

    @FXML
    public void initialize() {
        Image image = new Image(getClass().getResourceAsStream("/images/temp_avatar.png"));
        sampleImageView.setImage(image);
    }
    @FXML
    public void onFacultyStaffApprovedButtonClick() {
        try {
            FXRouter.goTo("faculty-staff-approved");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    public void onFacultyStaffManagementButtonClick() {
        try {
            FXRouter.goTo("faculty-staff-management");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void onLogoutButtonClick() {
        try {
            FXRouter.goTo("login");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
