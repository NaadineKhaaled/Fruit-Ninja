package GUI;

import Control.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.media.MediaPlayer.INDEFINITE;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
public static Stage window;
  public   static AudioClip audioBack;
    @Override
    public void start(Stage primaryStage) throws IOException {

        int s = INDEFINITE;
       window=primaryStage;
       // String path = "Chicken_Invaders_3_-_Revenge_of_the_yolk_(hydro.fm).mp3";

        //Instantiating Media class
        //Media media= new Media(path);


        //MediaPlayer mediaPlayer = new MediaPlayer(media);

        //mediaPlayer.setAutoPlay(true);
        audioBack = new AudioClip(getClass().getResource("background.mp3.mp3").toString());
        //audio.setVolume(0.5f);
        audioBack.setCycleCount(2);
        audioBack.play();
        Parent root = FXMLLoader.load(getClass().getResource("GameScene.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene( new Scene(root, 660, 410));

        primaryStage.show();



        Controller control = null ;
        control=control.getInstance();

    }
}
