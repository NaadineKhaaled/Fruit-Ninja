package Logic;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface Command {
    int Excute() throws IOException, SAXException, ParserConfigurationException;
    int Excute1() throws IOException, SAXException, ParserConfigurationException;
}
