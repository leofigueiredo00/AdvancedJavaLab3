module com.example.week8lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week8lab3 to javafx.fxml;
    exports com.example.week8lab3;
}