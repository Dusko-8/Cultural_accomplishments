package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {

    //Screan parameters custom for every PC
    int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
    int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("../Views/MenuScene.fxml"));
        //cosmetics
        primaryStage.setTitle("Cultural Accomplishment's");
        Image main_icone = new Image("images/main_icone.PNG");
        primaryStage.getIcons().add(main_icone);

        //flexible window changing based on your screen size
        int sceneWidth = Width_of_Screen(screenWidth,screenHeight);//returns optimal width
        int sceneHeight = Height_of_Screen(screenWidth,screenHeight);//returns optimal height

        //set scene with preferable parameters and display it
        primaryStage.setScene(new Scene(root, sceneWidth, sceneHeight));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
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
