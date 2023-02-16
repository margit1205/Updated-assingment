module com.example.votingregistraion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.votingregistraion to javafx.fxml;
    exports com.example.votingregistraion;
}