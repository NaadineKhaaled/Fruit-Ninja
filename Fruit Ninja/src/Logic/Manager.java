package Logic;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Manager {
    public int Command(Command Order) throws ParserConfigurationException, SAXException, IOException {Order.Excute();
        return 0;
    }
}
