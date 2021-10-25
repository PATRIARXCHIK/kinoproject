package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Zacladki {
    String s = "C:\\Users\\user\\Pictures";
    @FXML
    ImageView picture1,picture2,picture3,picture4,picture5 ;
    @FXML
    private MenuItem Profile , films, SOS;
    @FXML
    public  void click(javafx.event.ActionEvent event3) throws Exception {
        if(event3.getSource()== Profile){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profile.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage5 = new Stage();
            stage5.setScene(new Scene(root));
            stage5.show();
        }
        if(event3.getSource()== films){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Osnkno.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage7 = new Stage();
            stage7.setScene(new Scene(root));
            stage7.show();
        }
        if (event3.getSource() == SOS){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SOS.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage8 = new Stage();
            stage8.setScene(new Scene(root));
            stage8.show();
        }
    }


}
