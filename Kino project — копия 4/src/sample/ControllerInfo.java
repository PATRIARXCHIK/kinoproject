package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerInfo {
 @FXML
 public Button back5;
 @FXML
 public void click(javafx.event.ActionEvent event2) throws Exception{
     if(event2.getSource()== back5){
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Osnkno.fxml"));
         Parent root = (Parent) fxmlLoader.load();
         Stage stage6 = new Stage();
         stage6.setScene(new Scene(root));
         stage6.show();
     }
 }
}
