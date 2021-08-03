package GUI;

import Control.Controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameScene  implements Initializable{
    Controller control= Controller.getInstance();
    Image im = new Image("background.jpg");
    Image maw = new Image("button.png");

    @FXML
    ImageView background;
    @FXML
    ImageView button;
    @FXML
     Button start;

    //public static Stage window = new Stage();


    public void changeScene2() throws IOException {
        Parent gameScene = FXMLLoader.load(getClass().getResource("chooseLevels.fxml"));
        //Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
        Main.window.setTitle("Hello World");

        Main.window.setScene( new Scene(gameScene, 660, 410));
        Main.window.show();

        System.out.println("Eshta yabba Eshta kolo Eshta Eshta ya 3amy");

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        background.setImage(im);
        button.setImage(maw);
    }
}

