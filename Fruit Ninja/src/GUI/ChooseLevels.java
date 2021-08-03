package GUI;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import sun.swing.plaf.windows.ClassicSortArrowIcon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChooseLevels implements Initializable {

    Image im = new Image("background.jpg");
    Image classic = new Image("Classic.png");
    Image arcade = new Image("Arcade.png");
    Image zen = new Image("Zen.png");
    Image level2= new Image("Level2.png");
    @FXML
    ImageView Classic;
    @FXML
    ImageView Arcade;
    @FXML
    ImageView Zen;
    @FXML
    ImageView background;
    @FXML
    ImageView level;
    public void moveToScene() throws IOException {
        System.out.println("hhhhhh");
        Parent gameScene = FXMLLoader.load(getClass().getResource("LevelScene.fxml"));
        //Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
        Main.window.setTitle("Hello World");

        Main.window.setScene(new Scene(gameScene, 660, 410));
        Main.window.show();

    }
    @FXML
    public void moveWithTime() throws IOException {
        System.out.println("hhhhhh");
        Parent gameScene = FXMLLoader.load(getClass().getResource("Arache.fxml"));
        //Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
        Main.window.setTitle("Hello World");

        Main.window.setScene(new Scene(gameScene, 660, 410));
        Main.window.show();
    }
    @FXML
    public void moveWithFruits() throws IOException {
        System.out.println("hhhhhh");
        Parent gameScene = FXMLLoader.load(getClass().getResource("Levelfruits.fxml"));
        //Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
        Main.window.setTitle("Hello World");

        Main.window.setScene(new Scene(gameScene, 660, 410));
        Main.window.show();
    }

    @FXML
    public void MoveForBombs() throws IOException {
        System.out.println("hhhhhh");
        Parent gameScene = FXMLLoader.load(getClass().getResource("LevelBombs.fxml"));
        //Stage window=(Stage)((Node) event.getSource()).getScene().getWindow();
        Main.window.setTitle("Hello World");

        Main.window.setScene(new Scene(gameScene, 660, 410));
        Main.window.show();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

background.setImage(im);
        Classic.setImage(classic);
        Arcade.setImage(arcade);
        Zen.setImage(zen);
        level.setImage(level2);
        RotateTransition rotate= new RotateTransition(Duration.seconds(2),Classic);
        rotate.setByAngle(360);
        rotate.setCycleCount(200);
        rotate.play();
        RotateTransition rotateAr= new RotateTransition(Duration.seconds(2),Arcade);
        rotateAr.setByAngle(360);
        rotateAr.setCycleCount(200);
        rotateAr.play();
        RotateTransition rotateZe= new RotateTransition(Duration.seconds(2),Zen);
        rotateZe.setByAngle(360);
        rotateZe.setCycleCount(200);
        rotateZe.play();
        RotateTransition rotatele= new RotateTransition(Duration.seconds(2),level);
        rotatele.setByAngle(360);
        rotatele.setCycleCount(200);
        rotatele.play();
    }
    
}