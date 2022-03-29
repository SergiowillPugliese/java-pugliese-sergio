module com.example.esempiojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.esempiojavafx to javafx.fxml;
    exports com.example.esempiojavafx;
}