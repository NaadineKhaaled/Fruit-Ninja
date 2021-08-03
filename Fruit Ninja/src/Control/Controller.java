package Control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Logic.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


/**
 *
 * @author mayar abu zeid
 */
public class Controller implements GameActions, ObserverLogic {
    
private static Controller instance=null;
public static Controller getInstance(){
if(instance==null)
{instance =new Controller();
}
    return instance;
}
public int previousbest;
public int bestscore=0;
public int currentscore;
    AtomicInteger sec;
    public AtomicInteger getSec() {
        return sec;
    }
public int lives;
ArrayList<String> objectss;
String o1;
String o2;
String o3;
SaveXML Savee;
LoadXML Load=new LoadXML();
Manager manager=new Manager();
Logic.Load load=new Load();
int count=0;
    public ArrayList<GameObject> objects1=new ArrayList<>();
    public ArrayList<GameObject> objects2=new ArrayList<>();
   public ArrayList<GameObject> objects3=new ArrayList<>();
    public ArrayList<GameObject> objects4=new ArrayList<>();
    public ArrayList<GameObject> objects5=new ArrayList<>();
    public ArrayList<GameObject> objects6=new ArrayList<>();
    public ArrayList<GameObject> objects7=new ArrayList<>();
    public ArrayList<GameObject> objects8=new ArrayList<>();
    Apple apple=new Apple();
    Orange orange=new Orange();
    Watermelon watermelon=new Watermelon();
    Dangerous dangerous=new Dangerous();
    Fatal fatal=new Fatal();
    BlueBanana banana=new BlueBanana();
    Grapes grapes=new Grapes();
    public ArrayList addArray1(){
        objects1.add(apple);
        objects1.add(orange);
        objects1.add(watermelon);
        objects1.add(banana);
        objects1.add(fatal);
        objects1.add(dangerous);
        objects1.add(grapes);
        return objects1;
    }
    public ArrayList addArray2(){
        objects2.add(watermelon);
        objects2.add(banana);
        objects2.add(dangerous);
        objects2.add(grapes);
        objects2.add(fatal);
        objects2.add(apple);
        objects2.add(orange);
        return objects2;
    }
    public ArrayList addArray3(){
        objects3.add(orange);
        objects3.add(fatal);
        objects3.add(apple);
        objects3.add(watermelon);
        objects3.add(dangerous);
        objects3.add(grapes);
        objects3.add(banana);
        return objects3;
    }
    public ArrayList addArray4(){
        objects4.add(grapes);
        objects4.add(banana);
        objects4.add(fatal);
        objects4.add(dangerous);
        objects4.add(watermelon);
        objects4.add(dangerous);
        objects4.add(banana);
        return objects4;
    }
    public ArrayList addArray5(){
        objects5.add(watermelon);
        objects5.add(apple);
        objects5.add(orange);
        objects5.add(fatal);
        objects5.add(dangerous);
        objects5.add(fatal);
        objects5.add(grapes);
        return objects5;
    }
    public ArrayList addArray6(){
        objects6.add(watermelon);
        objects6.add(apple);
        objects6.add(orange);
        objects6.add(grapes);
        objects6.add(watermelon);
        objects6.add(orange);
        objects6.add(grapes);
        return objects6;
    }
    public ArrayList addArray7(){
        objects7.add(watermelon);
        objects7.add(banana);
        objects7.add(orange);
        objects7.add(watermelon);
        objects7.add(banana);
        objects7.add(apple);
        objects7.add(grapes);
        return objects7;
    }
    public ArrayList addArray8(){
        objects8.add(grapes);
        objects8.add(banana);
        objects8.add(apple);
        objects8.add(watermelon);
        objects8.add(banana);
        objects8.add(apple);
        objects8.add(watermelon);
        return objects8;
    }


    @Override
    public GameObject createGameObject() {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateObjectsLocations() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sliceObjects() {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }




      @Override
      public void saveGame(int x, int y, GameObject o1, GameObject o2, GameObject o3) throws TransformerException, ParserConfigurationException, IOException, SAXException {
          previousbest=Load.loadscore();
          System.out.println("previouss" +previousbest);
          System.out.println("currentt" +x);
        bestscore=Math.max(previousbest,x);
          System.out.println("bestscoreeeee" +bestscore);
         Savee=new SaveXML(x,bestscore,y,o1,o2,o3);
         Savee.Save();
         count++;
      }

public int Loadscore() throws IOException, SAXException, ParserConfigurationException, TransformerException {
        int g=0;
        if(count>0)
        {
            g=bestscore;}
        else if(count==0) {
           g = load.Excute1();
           manager.Command(load);
        }
        return g;
}
    public int Loadcurrent() throws IOException, SAXException, ParserConfigurationException, TransformerException {
        currentscore=Load.loadcurrent();
        return currentscore;
    }
    public int Loadlives() throws IOException, SAXException, ParserConfigurationException, TransformerException {
        lives=load.Excute();
        manager.Command(load);
        return lives;
    }
    @Override
    public ArrayList<String> loadGame() throws TransformerException, ParserConfigurationException, IOException, SAXException {
        objectss=Load.loadobjects();
        o1=objectss.get(0);
        o2=objectss.get(1);
        o3=objectss.get(2);
return objectss;
    }


    @Override
    public void ResetGame(AtomicInteger seconds) {
        sec=new AtomicInteger(61);
        currentscore=score.reset();
        //  seconds=new AtomicInteger(61);


    }


public int reset(){
        currentscore=score.reset();
        return currentscore;

}
    @Override
    public int update(GameObject fruit) {
       currentscore=score.addScore(fruit);
        System.out.println("SCORE"+currentscore);
        return currentscore;
    }
}

