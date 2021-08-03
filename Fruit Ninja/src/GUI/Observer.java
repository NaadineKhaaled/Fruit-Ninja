package GUI;

import Logic.GameObject;
import Logic.Score;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface Observer {
    Score score = new Score();
   public int update(GameObject fruit) throws SAXException, TransformerException, ParserConfigurationException, IOException;


}
