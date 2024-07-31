package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class StudentController {
    @FXML
    private Label nameLabel;

    @FXML
    public void initialize() {
        Student student = new Student("6610450358", "Pattarakarn Benghor");
        showStudent(student);
    }

    private void showStudent(Student student) {
        nameLabel.setText(student.getName());
    }

    @FXML
    public void onNextStudentListButtonClick() {
        try {
            FXRouter.goTo("student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}