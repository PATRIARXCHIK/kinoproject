package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.image.ImagingOpException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Controller1 {
    @FXML
    PasswordField tort;
    @FXML
    Button registr;
    @FXML
    Button entrance;
    @FXML
    public void click1(javafx.event.ActionEvent event) throws Exception {
        if (event.getSource() == registr) {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));

            Stage stage;
            stage = (Stage) registr.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.close();
            stage.show();
        }
    }
    @FXML
        public void click2(javafx.event.ActionEvent event) throws Exception {
            if (event.getSource() == entrance ) {
                Parent root = FXMLLoader.load(getClass().getResource("profile.fxml"));

                Stage stage;
                stage = (Stage) entrance.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.close();
                stage.show();
            }
        }
    }