package Control;


import Logic.GameObject;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mayar abu zeid
 */
public interface GameActions {
    public GameObject createGameObject();
/*
* update moving objects locations

*/
public void updateObjectsLocations();
/*
* it is used to slice fruits located in your swiping region
This method can take your swiping region as parameters (they
depend on how you calculate it).
*/
public void sliceObjects();
/*
*saves the current state of the game
*/
public void saveGame(int x, int y, GameObject o1, GameObject o2, GameObject o3) throws TransformerException, ParserConfigurationException, IOException, SAXException;
/*
*loads the last saved state of the game
*/
public ArrayList<String> loadGame() throws TransformerException, ParserConfigurationException, IOException, SAXException;
/*
*resets the game to its initial state
*/
public void ResetGame(AtomicInteger seconds);


}
