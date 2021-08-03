package Logic;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class SaveXML {
    public static final String xmlFilePath = "C:\\Users\\mayar abu zeid\\Desktop\\Fruit Ninja\\src.xml";
    int bestscore; //bestscore
    int current;
    int lives; //lives
 GameObject objects1;
    GameObject objects2;
    GameObject objects3;
    public SaveXML(int score, int bs, int l, GameObject o1, GameObject o2, GameObject o3)
    {   current=score;
        bestscore=bs;
        lives=l;
        objects1=o1;
        objects2=o2;
        objects3=o3;
    }
    public void Save() throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();
        Element root = document.createElement("State");
        document.appendChild(root);
        //bestscore
        Element score=document.createElement("BestScore");
        String m=Integer.toString(bestscore);
        score.appendChild(document.createTextNode(m));
        root.appendChild(score);
        //score
        Element currscore=document.createElement("CurrentScore");
        String t=Integer.toString(current);
        currscore.appendChild(document.createTextNode(t));
        root.appendChild(currscore);
        //lives
        Element livess=document.createElement("Lives");
        String n=Integer.toString(lives);
        livess.appendChild(document.createTextNode(n));
        root.appendChild(livess);
        //lists
        Element object=null;
        Element object2=null;
        Element object3=null;
        Element place=null;
        Element place2=null;
        Element place3=null;
        Element list1=null;
        Element list2=null;
        Element list3=null;
        list1=document.createElement("list");
        root.appendChild(list1);
                if(objects1 instanceof Apple)
                {
                    object=document.createElement("object");
                    object.appendChild(document.createTextNode("0"));
                    list1.appendChild(object);
                }
                else if(objects1 instanceof Orange)
                {
                    object=document.createElement("object");
                    object.appendChild(document.createTextNode("1"));
                    list1.appendChild(object);
                }
                else if(objects1 instanceof Watermelon)
                {
                    object=document.createElement("object");
                    object.appendChild(document.createTextNode("2"));
                    list1.appendChild(object);
                }
                else if(objects1 instanceof BlueBanana)
                {
                    object=document.createElement("object");
                    object.appendChild(document.createTextNode("3"));
                    list1.appendChild(object);
                }
                else if(objects1 instanceof Grapes)
                {
                    object=document.createElement("object");
                    object.appendChild(document.createTextNode("4"));
                    list1.appendChild(object);
                }
                else if(objects1 instanceof Fatal)
                {
                    object=document.createElement("object");
                    object.appendChild(document.createTextNode("5"));
                    list1.appendChild(object);
                }
                else if(objects1 instanceof Dangerous)
                {
                    object=document.createElement("object");
                    object.appendChild(document.createTextNode("6"));
                    list1.appendChild(object);
                }
        place=document.createElement("Place");
        place.appendChild(document.createTextNode("1"));
        list1.appendChild(place);


        list2=document.createElement("list");
        root.appendChild(list2);
                if(objects2 instanceof Apple)
                {
                    object2=document.createElement("object");
                    object2.appendChild(document.createTextNode("0"));
                    list2.appendChild(object2);
                }
                else if(objects2 instanceof Orange)
                {
                    object2=document.createElement("object");
                    object2.appendChild(document.createTextNode("1"));
                   list2.appendChild(object2);
                }
                else if(objects2 instanceof Watermelon)
                {
                    object2=document.createElement("object");
                    object2.appendChild(document.createTextNode("2"));
                    list2.appendChild(object2);
                }
                else if(objects2 instanceof BlueBanana)
                {
                    object2=document.createElement("object");
                    object2.appendChild(document.createTextNode("3"));
                    list2.appendChild(object2);
                }
                else if(objects2 instanceof Grapes)
                {
                    object2=document.createElement("object");
                    object2.appendChild(document.createTextNode("4"));
                    list2.appendChild(object2);
                }
                else if(objects2 instanceof Fatal)
                {
                    object2=document.createElement("object");
                    object2.appendChild(document.createTextNode("5"));
                    list2.appendChild(object2);
                }
                else if(objects2 instanceof Dangerous)
                {
                    object2=document.createElement("object");
                    object2.appendChild(document.createTextNode("6"));
                    list2.appendChild(object2);
                }
        place2=document.createElement("Place");
        place2.appendChild(document.createTextNode("2"));
        list2.appendChild(place2);


       list3=document.createElement("list");
        root.appendChild(list3);

                if(objects3 instanceof Apple)
                {
                    object3=document.createElement("object");
                    object3.appendChild(document.createTextNode("0"));
                    list3.appendChild(object3);
                }
                else if(objects3 instanceof Orange)
                {
                    object3=document.createElement("object");
                    object3.appendChild(document.createTextNode("1"));
                    list3.appendChild(object3);
                }
                else if(objects3 instanceof Watermelon)
                {
                    object3=document.createElement("object");
                    object3.appendChild(document.createTextNode("2"));
                    list3.appendChild(object3);
                }
                else if(objects3 instanceof BlueBanana)
                {
                    object3=document.createElement("object");
                    object3.appendChild(document.createTextNode("3"));
                    list3.appendChild(object3);
                }
                else if(objects3 instanceof Grapes)
                {
                    object3=document.createElement("object");
                    object3.appendChild(document.createTextNode("4"));
                    list3.appendChild(object3);
                }
                else if(objects3 instanceof Fatal)
                {
                    object3=document.createElement("object");
                    object3.appendChild(document.createTextNode("5"));
                    list3.appendChild(object3);
                }
                else if(objects3 instanceof Dangerous)
                {
                    object3=document.createElement("object");
                    object3.appendChild(document.createTextNode("6"));
                    list3.appendChild(object3);
                }
        place3=document.createElement("Place");
        place3.appendChild(document.createTextNode("3"));
        list3.appendChild(place3);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File(xmlFilePath));
        transformer.transform(domSource, streamResult);
        System.out.println("Done creating XML File");
    }

}
