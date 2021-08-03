package GUI;

import Control.Controller;
import Logic.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicInteger;

import static GUI.Main.audioBack;

public class Arache implements Initializable, Observer {

    public static AtomicInteger seconds =new AtomicInteger(61);
    Apple app = new Apple();
    Watermelon waterObject = new Watermelon();
    Orange or = new Orange();
    int index = 0;
    int indexApple = 0;
    int indexPine = 0;
    boolean sliced = false;
    boolean sliced1 = false;
    boolean sliced2 = false;
    boolean yes;
    int y;
    int ze;
    Score s = new Score();
    TranslateTransition translate = new TranslateTransition();
    TranslateTransition translate2 = new TranslateTransition();
    TranslateTransition translate3 = new TranslateTransition();
    Controller control = Controller.getInstance();
    ArrayList<GameObject> arr1 = control.addArray6();
    ArrayList<GameObject> arr2 = control.addArray7();
    ArrayList<GameObject> arr3 = control.addArray8();
    ArrayList<GameObject> list1 = control.addArray6();
    ArrayList<GameObject> list4 = control.addArray7();
    ArrayList<GameObject> list5 = control.addArray8();
    ArrayList<String> loaded;
    int t;
    int g;
    int i;
    int bestscore;
    String o11;
    String o22;
    String o33;
    Score score = new Score();
    Image sliceTofaha = new Image("sliceTofaha.png");
    Image sliceMoza = new Image("sliceorange.png");
    Image im = new Image("hoh.jpg");
    Image imApple = new Image("apple.png");
    Image imPineApple = new Image("orange.png");
    Image imWater = new Image("watermelon.png");
    Image slice = new Image("fruit-slice.png");
    Image banana = new Image("blue banana.png");
    Image bananasliced = new Image("sliced banana.png");
    Image grapes = new Image("grapes.png");
    Image slicedGrapes = new Image("slice grapes.png");
    Image sc=new Image("score.png");
    Image cl=new Image("clock.png");

  Image gameover =new Image("gameOver.jpg");
    int lifes = 3;
    int count = 0;
    boolean x;
@FXML
Button save;
@FXML
Button load;
@FXML
Label label;
    @FXML
    ImageView background2;

    @FXML
    ImageView apple;
    @FXML
    ImageView watermelon;
    @FXML
    ImageView pineapple;
    @FXML
    ImageView fruitSlice;
    @FXML
    Label maisoon;
@FXML
ImageView sr;
@FXML
Label labell;
@FXML
ImageView clock;
@FXML
    Button button1;
    @FXML
    public void moveWatermelon() throws InterruptedException, SAXException, ParserConfigurationException, IOException, TransformerException {
        //  Label label=new Label();
        System.out.println("hhhhhh");
        System.out.println(index);
        sliced = true;
        if (arr1.get(index) instanceof Apple) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            watermelon.setImage(sliceTofaha);
            y = update(new Apple());
            System.out.println("Score:" + y);
            //label.setText(String.valueOf(y));

        }

        if (arr1.get(index) instanceof Orange) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            watermelon.setImage(sliceMoza);
            y = update(new Orange());
            System.out.println("Score:" + y);
        }

        if (arr1.get(index) instanceof Watermelon) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            watermelon.setImage(slice);
            y = update(new Watermelon());
            System.out.println("Score:" + y);

        }
        if (arr2.get(indexApple) instanceof BlueBanana) {
            AudioClip audio = new AudioClip(getClass().getResource("Tada.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            y = update(new BlueBanana());
            System.out.println("Score:" + y);
            apple.setImage(bananasliced);
        }
        if (arr2.get(indexApple) instanceof Grapes) {
            AudioClip audio = new AudioClip(getClass().getResource("Tada.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            y = update(new Grapes());
            System.out.println("Score:" + y);
            apple.setImage(slicedGrapes);
        }

    }

    @FXML
    public void moveApple() throws IOException, TransformerException, SAXException, ParserConfigurationException {
        System.out.println("hhhhhh");
        System.out.println(index);
        sliced1 = true;
        if (arr2.get(indexApple) instanceof Apple) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            apple.setImage(sliceTofaha);
            y = update(new Apple());
            System.out.println("Score:" + y);
        }
        if (arr2.get(indexApple) instanceof Orange) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            apple.setImage(sliceMoza);
            y = update(new Orange());
            System.out.println("Score:" + y);
        }

        if (arr2.get(indexApple) instanceof Watermelon) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            apple.setImage(slice);
            y = update(new Watermelon());
            System.out.println("Score:" + y);
        }

        if (arr2.get(indexApple) instanceof BlueBanana) {
            AudioClip audio = new AudioClip(getClass().getResource("Tada.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            y = update(new BlueBanana());
            System.out.println("Score:" + y);
            apple.setImage(bananasliced);
        }
        if (arr2.get(indexApple) instanceof Grapes) {
            AudioClip audio = new AudioClip(getClass().getResource("Tada.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            y = update(new Grapes());
            System.out.println("Score:" + y);
            apple.setImage(slicedGrapes);
        }
    }

    @FXML
    public void movePine() throws IOException, TransformerException, SAXException, ParserConfigurationException {

        sliced2 = true;
        if (arr3.get(indexPine) instanceof Apple) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            pineapple.setImage(sliceTofaha);
            y = update(new Apple());
            System.out.println("Score:" + y);
        }
        if (arr3.get(indexPine) instanceof Orange) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            pineapple.setImage(sliceMoza);
            y = update(new Orange());
            System.out.println("Score:" + y);
        }

        if (arr3.get(indexPine) instanceof Watermelon) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            pineapple.setImage(slice);
            y = update(new Watermelon());
            System.out.println("Score:" + y);
        }


        if (arr3.get(indexPine) instanceof BlueBanana) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            pineapple.setImage(bananasliced);
            y = update(new BlueBanana());
            System.out.println("Score:" + y);
        }
        if (arr3.get(indexPine) instanceof Grapes) {
            AudioClip audio = new AudioClip(getClass().getResource("slicingSound.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);

            audio.play();
            pineapple.setImage(slicedGrapes);
            y = update(new Grapes());
            System.out.println("Score:" + y);
        }
    }

public void doTime()
{
    Timeline timeline=new Timeline();
    timeline.setCycleCount(Timeline.INDEFINITE);
    System.out.println("d5lt fn");
    if(timeline==null)
    {
        timeline.stop();
        System.out.println("d5lt if null");
    }
    KeyFrame frame=new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            System.out.println("d5lt if null");
            seconds.getAndDecrement();
            AudioClip audio = new AudioClip(getClass().getResource("ticktock.mp3").toString());
            //audio.setVolume(0.5f);
            audio.setCycleCount(1);
            audio.play();

            System.out.println("TimeDown:"+seconds);
            maisoon.setText(String.valueOf(seconds));

           if(seconds.get()==10)
           {
               audio.stop();
               AudioClip audioStop = new AudioClip(getClass().getResource("last10secs.mp3").toString());
               //audio.setVolume(0.5f);
               audioStop.setCycleCount(1);
               audioStop.play();
            maisoon.setTextFill(Color.RED);


           }
        //    System.out.println("Seconds"+seconds.equals(0));

            if(seconds.get()==0)
            {
                try {
                    endGame();
                } catch (IOException | TransformerException | ParserConfigurationException | SAXException e) {
                    e.printStackTrace();
                }
                timeline.pause();
            }
        }
    });
    timeline.getKeyFrames().add(frame);
    timeline.playFromStart();

}


    public void translate() throws InterruptedException {

        translate.setDuration(Duration.seconds(2.5));
        translate2.setDuration(Duration.seconds(3));
        translate3.setDuration(Duration.seconds(2));
        translate.setNode(apple);
        translate.setToY(-500);
        translate2.setNode(watermelon);
        translate2.setToY(-500);
        translate3.setNode(pineapple);
        translate3.setToY(-500);
        translate.setCycleCount(2);
        translate.setAutoReverse(true);
        translate2.setCycleCount(2);
        translate2.setAutoReverse(true);
        translate3.setCycleCount(2);
        translate3.setAutoReverse(true);
        translate.play();
        translate2.play();
        translate3.play();
      //  maisoon.setText(String.valueOf(seconds));

        translate2.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//doTime();
                sliced = false;
                index++;
                if (index == arr1.size())
                    index = 0;
                if (arr1.get(index) instanceof Apple) {
                    watermelon.setImage(imApple);
                    translate2.setDuration(Duration.seconds(arr1.get(index).getInitialVelocity()));
                }
                if (arr1.get(index) instanceof Orange) {
                    watermelon.setImage(imPineApple);

                }

                if (arr1.get(index) instanceof Watermelon) {
                    watermelon.setImage(imWater);
                }

                if (arr1.get(index) instanceof BlueBanana) {
                    watermelon.setImage(banana);
                    translate2.setDuration(Duration.seconds(arr1.get(index).getInitialVelocity()));
                }
                if (arr1.get(index) instanceof Grapes) {
                    watermelon.setImage(grapes);
                    translate2.setDuration(Duration.seconds(arr1.get(index).getInitialVelocity()));
                }

                translate2.setNode(watermelon);
                translate2.play();
            }
        });
        translate.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                sliced1 = false;
                indexApple++;
                if (indexApple == arr2.size())
                    indexApple = 0;
                if (arr2.get(indexApple) instanceof Apple) {
                    apple.setImage(imApple);
                    translate.setDuration(Duration.seconds(arr2.get(indexApple).getInitialVelocity()));
                }
                if (arr2.get(indexApple) instanceof Orange) {
                    apple.setImage(imPineApple);
                    translate.setDuration(Duration.seconds(arr2.get(indexApple).getInitialVelocity()));
                }

                if (arr2.get(indexApple) instanceof Watermelon) {
                    apple.setImage(imWater);
                    translate.setDuration(Duration.seconds(arr2.get(indexApple).getInitialVelocity()));
                }

                if (arr2.get(indexApple) instanceof BlueBanana) {
                    apple.setImage(banana);
                    translate.setDuration(Duration.seconds(arr2.get(indexApple).getInitialVelocity()));
                }
                if (arr2.get(indexApple) instanceof Grapes) {
                    apple.setImage(grapes);
                    translate.setDuration(Duration.seconds(arr2.get(indexApple).getInitialVelocity()));
                }

                translate.setNode(apple);
                translate.play();
            }
        });
        translate3.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                sliced2 = false;
                indexPine++;
                if (indexPine == arr3.size())
                    indexPine = 0;
                if (arr3.get(indexPine) instanceof Apple) {
                    pineapple.setImage(imApple);
                    translate3.setDuration(Duration.seconds(arr3.get(indexPine).getInitialVelocity()));
                }
                if (arr3.get(indexPine) instanceof Orange) {
                    pineapple.setImage(imPineApple);
                    translate3.setDuration(Duration.seconds(arr3.get(indexPine).getInitialVelocity()));
                }

                if (arr3.get(indexPine) instanceof Watermelon) {
                    pineapple.setImage(imWater);
                    translate3.setDuration(Duration.seconds(arr3.get(indexPine).getInitialVelocity()));
                }

                if (arr3.get(indexPine) instanceof BlueBanana) {
                    pineapple.setImage(banana);
                    translate3.setDuration(Duration.seconds(arr3.get(indexPine).getInitialVelocity()));
                }
                if (arr3.get(indexPine) instanceof Grapes) {
                    pineapple.setImage(grapes);
                    translate3.setDuration(Duration.seconds(arr3.get(indexPine).getInitialVelocity()));
                }

                translate3.setNode(pineapple);
                translate3.play();
            }
        });



    }
    public int resett(){
        ze=score.reset();
        return ze;
    }


    public void buttonclick()
{
    ze=resett();
    labell.setText(String.valueOf(ze));
   control.ResetGame(seconds);
    System.out.println("sceconds"+seconds);
    seconds=control.getSec();
}


    @Override
    public void initialize(URL location, ResourceBundle resources)  {
doTime();

        try {
            int bs=control.Loadscore();
            String e=Integer.toString(bs);
            System.out.println("e=" +e);
            label.setText(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        background2.setImage(im);
        sr.setImage(sc);
        apple.setImage(imApple);
        clock.setImage(cl);
        if (arr1.get(index) instanceof Apple) {
            watermelon.setImage(imApple);
        }
        if (arr1.get(index) instanceof Orange) {
            watermelon.setImage(imPineApple);
        }

        if (arr1.get(index) instanceof Watermelon) {
            watermelon.setImage(imWater);
        }

        if (arr1.get(index) instanceof BlueBanana) {
            watermelon.setImage(banana);
        }
        if (arr1.get(index) instanceof Grapes) {
            watermelon.setImage(grapes);
        }

        if (arr2.get(indexApple) instanceof Apple) {
            apple.setImage(imApple);
        }
        if (arr2.get(indexApple) instanceof Orange) {
            apple.setImage(imPineApple);
        }

        if (arr2.get(indexApple) instanceof Watermelon) {
            apple.setImage(imWater);
        }


        if (arr2.get(indexApple) instanceof BlueBanana) {
            apple.setImage(banana);
        }
        if (arr2.get(indexApple) instanceof Grapes) {
            apple.setImage(grapes);
        }

        if (arr3.get(indexPine) instanceof Apple) {
            pineapple.setImage(imApple);
        }
        if (arr3.get(indexPine) instanceof Orange) {
            pineapple.setImage(imPineApple);
        }

        if (arr3.get(indexPine) instanceof Watermelon) {
            pineapple.setImage(imWater);
        }


        if (arr3.get(indexPine) instanceof BlueBanana) {
            pineapple.setImage(banana);
        }
        if (arr3.get(indexPine) instanceof Grapes) {
            pineapple.setImage(grapes);
        }


        try {
            translate();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pineapple.setImage(imPineApple);
    //    fruitSlice.setImage(slice);
      //  fruitSlice.setVisible(false);


    }


   @Override
    public int update(GameObject fruit) throws SAXException, TransformerException, ParserConfigurationException, IOException {
        ze=score.addScore(fruit);
       int bs=control.Loadscore();
        System.out.println("bestt in updat" +bestscore);
        if(ze>bs)
            label.setText(String.valueOf(ze));
        System.out.println("SCORE"+ze);
        labell.setText(String.valueOf(ze));
        return ze;
    }
    public void Save() throws TransformerException, ParserConfigurationException, IOException, SAXException {
        GameObject object1=list1.get(index);
        GameObject object4=list4.get(indexApple);
        GameObject object5=list5.get(indexPine);
        control.saveGame(ze,lifes,object1,object4,object5);


    }
    public void Load() throws TransformerException, ParserConfigurationException, IOException, SAXException, InterruptedException {
        bestscore=control.Loadscore();
        loaded=control.loadGame();
        ze=control.Loadcurrent();
        o11=loaded.get(0);
        o22=loaded.get(1);
        o33=loaded.get(2);
        if (o11.equals("apple"))
        {
            for(i=0;i<list1.size();i++) {
                if (list1.get(i) instanceof Apple)
                {index=i;
                    watermelon.setImage(imApple);
                }
            }
        }
        else if (o11.equals("orange"))
        {
            for(i=0;i<list1.size();i++) {
                if (list1.get(i) instanceof Orange)
                {index=i;
                    watermelon.setImage(imPineApple);
                }

            }
        }
        else if (o11.equals("watermelon"))
        {
            for(i=0;i<list1.size();i++) {
                if (list1.get(i) instanceof Watermelon)
                {index=i;
                    watermelon.setImage(imWater);
                }

            }
        }
        else if (o11.equals("banana"))
        {
            for(i=0;i<list1.size();i++) {
                if (list1.get(i) instanceof BlueBanana)
                {index=i;
                    watermelon.setImage(banana);
                }

            }
        }
        else if (o11.equals("grapes"))
        {
            for(i=0;i<list1.size();i++) {
                if (list1.get(i) instanceof Grapes)
                {index=i;
                    watermelon.setImage(grapes);
                }

            }
        }

        System.out.println("indnex= " +index);
        if (o22.equals("apple"))
        {
            for(g=0;g<list4.size();g++) {
                if (list4.get(g) instanceof Apple)
                {indexApple=g;
                    apple.setImage(imApple);
                }

            }
        }
        else if (o22.equals("orange"))
        {
            for(g=0;g<list4.size();g++) {
                if (list4.get(g) instanceof Orange)
                {indexApple=g;
                    apple.setImage(imPineApple);
                }

            }
        }
        else if (o22.equals("watermelon"))
        {
            for(g=0;g<list4.size();g++) {
                if (list4.get(g) instanceof Watermelon)
                {indexApple=g;
                    apple.setImage(imWater);
                }

            }
        }

        else if (o22.equals("banana"))
        {
            for(g=0;g<list4.size();g++) {
                if (list4.get(g) instanceof BlueBanana)
                {indexApple=g;
                    apple.setImage(banana);
                }

            }
        }
        else if (o22.equals("grapes"))
        {
            for(g=0;g<list4.size();g++) {
                if (list4.get(g) instanceof Grapes)
                {indexApple=g;
                    apple.setImage(grapes);
                }


            }
        }

        System.out.println("indexApple= " +indexApple);
        if (o33.equals("apple"))
        {
            for(t=0;t<list5.size();t++) {
                if (list5.get(t) instanceof Apple)
                {indexPine=t;
                    pineapple.setImage(imApple);
                }
            }
        }
        else if (o33.equals("orange"))
        {
            for(t=0;t<list5.size();t++) {
                if (list5.get(t) instanceof Orange)
                {indexPine=t;
                    pineapple.setImage(imPineApple);
                }
            }
        }
        else if (o33.equals("watermelon"))
        {
            for(t=0;g<list5.size();t++) {
                if (list5.get(t) instanceof Watermelon)
                {indexPine=t;
                    pineapple.setImage(imWater);
                }
            }
        }

        else if (o33.equals("banana"))
        {
            for(t=0;t<list5.size();t++) {
                if (list5.get(t) instanceof BlueBanana)
                {indexPine=t;
                    pineapple.setImage(banana);
                }

            }
        }
        else if (o33.equals("grapes"))
        {
            for(t=0;t<list5.size();t++) {
                if (list5.get(t) instanceof Grapes)
                {indexPine=t;
                    pineapple.setImage(grapes);
                }
            }
        }


        System.out.println("indexP= " +indexPine);
        translate();
    }
    public void endGame() throws IOException, TransformerException, ParserConfigurationException, SAXException {

        if (seconds.get()==0) {

            audioBack.stop();
            translate.pause();
            translate2.pause();
            translate3.pause();
            Save();

            Parent gameScene = FXMLLoader.load(getClass().getResource("GameOver.fxml"));
            Main.window.setTitle("Hello World");
            Main.window.setScene(new Scene(gameScene, 660, 410));
            Main.window.show();


        }
    }
}
