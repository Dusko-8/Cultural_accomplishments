package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("MenuScene.fxml"));
        primaryStage.setTitle("Cultural Accomplishment's");
        Image main_icone = new Image("Icons/main_icone.PNG");
        primaryStage.getIcons().add(main_icone);

        primaryStage.setScene(new Scene(root, 600, 575));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
