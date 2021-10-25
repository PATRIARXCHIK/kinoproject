package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class ControllerFilms {
    String s ;
    @FXML
    public Button infors;
    @FXML
    public MenuItem Profile, tap , SOS;
    @FXML
    public  void click(ActionEvent event2) throws Exception {
        if(event2.getSource()==infors){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("info.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage6 = new Stage();
            stage6.setScene(new Scene(root));
            stage6.hide();
            stage6.show();
        }
        if(event2.getSource()== Profile){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profile.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage6 = new Stage();
            stage6.setScene(new Scene(root));
            stage6.hide();
            stage6.show();

        }
        if(event2.getSource()== tap){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("taps.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage6 = new Stage();
            stage6.setScene(new Scene(root));
            stage6.show();

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
