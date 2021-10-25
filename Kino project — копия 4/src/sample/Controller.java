package sample;

import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.Objects;


public class Controller {

    public static String a="" , b="", g="";

    @FXML
    private TextField log;
    @FXML
    private PasswordField password1 , password2;
    @FXML
    private Button back1, reg;

    public Controller() {
    }


    @FXML
    public void click(javafx.event.ActionEvent event) throws Exception {
        a = password1.getText();
        b = password2.getText();


        if (event.getSource() == back1) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/sample/Enter.fxml")));
            Stage stage = (Stage) back1.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            password1.setText(a);
            password2.setText(b);
        }
        if (event.getSource()== reg) {
            if (a.equals(b) ) {
                Parent root = FXMLLoader.load(getClass().getResource("/sample/Enter.fxml"));
                    Stage stage = (Stage) reg.getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.close();
                    stage.show();
                    password1.setText(a);
                    password2.setText(b);

        }
            else{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/error.fxml"));
                Parent root4 = (Parent) fxmlLoader.load();
                Stage stage5 = new Stage();
                stage5.setScene(new Scene(root4));
                stage5.show();
            }
        }
    }
}



