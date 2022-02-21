package Controller;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuScene_Controller {
    //Screan parameters custom for every PC
    int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
    int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

    @FXML
    private AnchorPane MenuA_Pane;

    @FXML
    private JFXButton MenuExit_BTN;

    private Stage stage;
    private Parent root;


    public void logout(ActionEvent event){

        stage = (Stage) MenuA_Pane.getScene().getWindow();
        stage.close();

    }

    public void switchToFilm(ActionEvent event) throws IOException {
        int sceneWidth = Width_of_Screen(screenWidth,screenHeight);//returns optimal width
        int sceneHeight = Height_of_Screen(screenWidth,screenHeight);//returns optimal height

        Parent root = FXMLLoader.load(getClass().getResource("../Views/FilmScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        stage.setScene(scene);
        stage.show();
    }
    //they return best posible value for size of app
    public static int Width_of_Screen(int screenWidth , int screenHeight){
        if (screenWidth <= 800 && screenHeight <= 600) {
            return 600;

        } else if (screenWidth <= 1280 && screenHeight <= 768) {
            return 800;

        } else if (screenWidth <= 1920 && screenHeight <= 1080) {
            return 1000;

        }
        else {
            return 800;
        }
    }
    public static int Height_of_Screen(int screenWidth , int screenHeight){
        if (screenWidth <= 800 && screenHeight <= 600) {
            return 350;

        } else if (screenWidth <= 1280 && screenHeight <= 768) {
            return 450;

        } else if (screenWidth <= 1920 && screenHeight <= 1080) {
            return 650;

        }else {
            return 450;
        }
    }
}
