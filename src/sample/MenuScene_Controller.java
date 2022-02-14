package sample;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuScene_Controller {

    @FXML
    private AnchorPane MenuA_Pane;

    @FXML
    private JFXButton MenuExit_BTN;

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void logout(ActionEvent event){

        stage = (Stage) MenuA_Pane.getScene().getWindow();
        stage.close();

    }

    public void switchToFilm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FilmScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
