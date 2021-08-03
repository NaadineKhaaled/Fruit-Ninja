package Logic;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Load implements Command{
    private LoadXML Load=new LoadXML();
    public int Excute() throws IOException, SAXException, ParserConfigurationException {
        int x=Load.loadlives();
        return x;
    }
    public int Excute1() throws IOException, SAXException, ParserConfigurationException {
        int y=Load.loadscore();
        return y;
    }

}
