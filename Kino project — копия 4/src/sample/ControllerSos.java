package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class ControllerSos {
    @FXML
    private MenuItem Profile, tap , films;
    @FXML
    public  void click(javafx.event.ActionEvent event2) throws Exception {
        if (event2.getSource() == Profile) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profile.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage5 = new Stage();
            stage5.setScene(new Scene(root));
            stage5.show();
        }
        if(event2.getSource()== tap){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("taps.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage6 = new Stage();
            stage6.setScene(new Scene(root));
            stage6.show();
        }
        if(event2.getSource()== films){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Osnkno.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage7 = new Stage();
            stage7.setScene(new Scene(root));
            stage7.show();
        }
    }
}
