package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;


public class Controller2 {

    @FXML
    private MenuItem Profile, tap , film, SOS;

    @FXML
    public  void click(javafx.event.ActionEvent event2) throws Exception {
        if(event2.getSource()== Profile){
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
        if(event2.getSource()== film){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Osnkno.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage7 = new Stage();
            stage7.setScene(new Scene(root));
            stage7.close();
            stage7.show();
        }
        if (event2.getSource() == SOS){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SOS.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage8 = new Stage();
            stage8.setScene(new Scene(root));
            stage8.show();
        }
    }
}
