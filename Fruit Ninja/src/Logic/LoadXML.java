package Logic;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class LoadXML {
    public static final String xmlFilePath = "C:\\Users\\mayar abu zeid\\Desktop\\Fruit Ninja\\src.xml";
    int y = 0; //bestscore
    int k = 0; //lives
    String m = null;
    ArrayList<String> obcts = new ArrayList<>();
    Apple apple = new Apple();
    Watermelon watermelon = new Watermelon();
    Orange orange = new Orange();
    BlueBanana banana = new BlueBanana();
    Grapes grapes = new Grapes();
    Fatal fatal = new Fatal();
    Dangerous dangerous = new Dangerous();
  String o1=null ;
    String o2=null ;
    String o3=null ;
    int p = 0;
    int q=0;
    int s = 0;
    String o = null;

    public int loadscore() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        File file = new File(xmlFilePath);
        if (file.exists()) {
            Document doc = db.parse(file);
            Element element = doc.getDocumentElement();

// Print root element of the document
            System.out.println("Root element of the document: " + element.getNodeName());
            //bestscore
            NodeList SCORE = element.getElementsByTagName("BestScore");
            Node n = SCORE.item(0);
            System.out.println("Current Element  :" + n.getNodeName());
            String x = SCORE.item(0).getChildNodes().item(0).getNodeValue();
            y = Integer.parseInt(x);
            System.out.println("previousbest: " + y);

        }
        return y;
    }
    public int loadcurrent() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        File file = new File(xmlFilePath);
        if (file.exists()) {
            Document doc = db.parse(file);
            Element element = doc.getDocumentElement();
            //currentscore
            NodeList SCORE = element.getElementsByTagName("CurrentScore");
            Node n = SCORE.item(0);
            System.out.println("Current Element  :" + n.getNodeName());
            String f = SCORE.item(0).getChildNodes().item(0).getNodeValue();
            q = Integer.parseInt(f);
            System.out.println("current: " + q);

        }
        return q;
    }
    public int loadlives() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        File file = new File(xmlFilePath);
        if (file.exists()) {
            Document doc = db.parse(file);
            Element element = doc.getDocumentElement();
            NodeList Lives = element.getElementsByTagName("Lives");
            Node nn = Lives.item(0);
            System.out.println("Current Element  :" + nn.getNodeName());
            String xx = Lives.item(0).getChildNodes().item(0).getNodeValue();
            k = Integer.parseInt(xx);
            System.out.println("lives: " + k);
            //


        }
        return k;
    }


    public ArrayList<String> loadobjects() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        File file = new File(xmlFilePath);
        if (file.exists()) {
            Document doc = db.parse(file);
            Element element = doc.getDocumentElement();

            //objects
            NodeList lists = element.getElementsByTagName("list");
            if (lists != null && lists.getLength() > 0) {
                System.out.println("length =" + lists.getLength());
                for (int i = 0; i < lists.getLength(); i++) {
                    Node n = lists.item(i);
                    System.out.println("Current Element  :" + n.getNodeName());
                    System.out.println("num" + i);
                    if (n.getNodeType() == Node.ELEMENT_NODE) {
                        Element e = (Element) n;
                        NodeList nodeList4 = e.getElementsByTagName("Place");
                        String x = nodeList4.item(0).getChildNodes().item(0).getNodeValue();
                        p = Integer.parseInt(x);
                        System.out.println("Place: " + p);
                        NodeList nodeList0 = e.getElementsByTagName("object");
                        for (int j = 0; j < nodeList0.getLength(); j++) {
                            Node nn = nodeList0.item(j);
                            if (nn.getNodeType() == Node.ELEMENT_NODE) {
                                o = nodeList0.item(j).getTextContent();
                                s = Integer.parseInt(o);
                                if (p == 1) {
                                    if (s == 0) {
                                        o1 ="apple";
                                        System.out.println("apple");
                                    }
                                        else if (s == 1) {
                                        System.out.println("orange");
                                        o1 = "orange";
                                    }
                                    else if (s == 2) {
                                        o1 = "watermelon";
                                        System.out.println("melon ");
                                    }
                                    else if (s == 3) {
                                        o1 = "banana";
                                        System.out.println("blue");
                                    }
                                    else if (s == 4) {
                                        System.out.println("grapes");
                                        o1 = "grapes";
                                    }
                                    else if (s == 5) {
                                        o1 ="fatal";
                                        System.out.println("fatal");
                                    }
                                    else if (s == 6) {
                                        o1 = "dangerous";
                                        System.out.println("danger");
                                    }
                                    System.out.println("s=" + s);
                                } else if (p == 2) {
                                    if (s == 0) {
                                        o2 = "apple";
                                        System.out.println("apple");
                                    }
                                    else if (s == 1) {
                                        System.out.println("orange");
                                        o2 = "orange";
                                    }
                                    else if (s == 2) {
                                        o2 = "watermelon";
                                        System.out.println("melon ");
                                    }
                                    else if (s == 3) {
                                        o2 = "banana";
                                        System.out.println("blue");
                                    }
                                    else if (s == 4) {
                                        System.out.println("grapes");
                                        o2 = "grapes";
                                    }
                                    else if (s == 5) {
                                        o2 = "fatal";
                                        System.out.println("fatal");
                                    }
                                    else if (s == 6) {
                                        o2= "dangerous";
                                        System.out.println("danger");
                                    }
                                    System.out.println("s2=" + s);
                                } else if (p == 3) {
                                    if (s == 0) {
                                        o3 = "apple";
                                        System.out.println("apple");
                                    }
                                    else if (s == 1) {
                                        System.out.println("orange");
                                        o3 = "orange";
                                    }
                                    else if (s == 2) {
                                        o3 = "watermelon";
                                        System.out.println("melon ");
                                    }
                                    else if (s == 3) {
                                        o3 = "banana";
                                        System.out.println("blue");
                                    }
                                    else if (s == 4) {
                                        System.out.println("grapes");
                                        o3 = "grapes";
                                    }
                                    else if (s == 5) {
                                        o3 = "fatal";
                                        System.out.println("fatal");
                                    }
                                    else if (s == 6) {
                                        o3 = "dangerous";
                                        System.out.println("danger");
                                    }
                                    System.out.println("s3=" + s);
                                }
                            }
                        }
                    }
                }
            }
        }
        obcts.add(o1);
        obcts.add(o2);
        obcts.add(o3);
        return obcts;
    }
}



