package  sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerError {

    @FXML
     Button nazad;

    @FXML
    public void click111(javafx.event.ActionEvent event) throws Exception {
        if (event.getSource() == nazad) {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));

            Stage stage;
            stage = (Stage) nazad.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.close();

        }
    }



}



