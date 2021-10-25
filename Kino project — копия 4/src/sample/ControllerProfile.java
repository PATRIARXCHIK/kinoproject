package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;

public class ControllerProfile {
    String s = "C:\\Users\\user\\Pictures";
    @FXML
    ImageView wolfe;
    @FXML
    private MenuItem  taps , films, SOS;
    @FXML
    public  void click(javafx.event.ActionEvent event3) throws Exception {
        if(event3.getSource()== taps){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("taps.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage6 = new Stage();
            stage6.setScene(new Scene(root));
            stage6.getScene().getWindow();
            stage6.hide();
            stage6.show();


        }
        if(event3.getSource()== films){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Osnkno.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage6 = new Stage();
            stage6.setScene(new Scene(root));
            stage6.hide();
            stage6.show();
        }
        if (event3.getSource() == SOS){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SOS.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage6 = new Stage();
            stage6.setScene(new Scene(root));
            stage6.hide();
            stage6.show();
        }
    }

}
