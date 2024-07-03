package com.example.week8lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField contactNumberField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private Button validateButton;

    public void initialize() {
        // Initialize method, if needed
    }

    @FXML
    private void handleValidation() {
        String username = usernameField.getText();
        String contactNumber = contactNumberField.getText();
        String postalCode = postalCodeField.getText();

        boolean isUsernameValid = validateUsername(username);
        boolean isContactNumberValid = validateContactNumber(contactNumber);
        boolean isPostalCodeValid = validatePostalCode(postalCode);

        if (isUsernameValid && isContactNumberValid && isPostalCodeValid) {
            // Valid input, do something
            System.out.println("Input is valid!");
        } else {
            // Invalid input, show error message or handle accordingly
            System.out.println("Invalid input! Please check your fields.");
        }
    }

    private boolean validateUsername(String username) {
        // Validate username
        return username.matches("[A-Z][a-zA-Z]*");
    }

    private boolean validateContactNumber(String contactNumber) {
        // Validate contact number
        return contactNumber.matches("\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4}");
    }

    private boolean validatePostalCode(String postalCode) {
        // Validate postal code
        return postalCode.matches("[A-Za-z]\\d[A-Za-z][-\\s]?\\d[A-Za-z]\\d");
    }
}
