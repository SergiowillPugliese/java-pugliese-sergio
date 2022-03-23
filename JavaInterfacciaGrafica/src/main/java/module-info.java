module com.engim.javainterfacciagrafica {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.engim.javainterfacciagrafica to javafx.fxml;
    exports com.engim.javainterfacciagrafica;
}