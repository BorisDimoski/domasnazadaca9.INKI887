package zd1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XML {
    public void createXMLFile(String fileName, Vraboten vraboten) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element root = document.createElement("Vraboten");
            document.appendChild(root);
            Element Ime =  document.createElement("Ime");
            root.appendChild(Ime);
            Element Prezime = document.createElement("Prezime");
            root.appendChild(Prezime);
            Element Plata = document.createElement("Plata");
            root.appendChild(Plata);
            Prezime.appendChild(document.createTextNode(vraboten.GetIme()));
            Ime.appendChild(document.createTextNode(vraboten.GetPrezime()));
            Plata.appendChild(document.createTextNode(vraboten.GetPlata()));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);
            System.out.println("Fajlot e kreiran, imeto e: "+ fileName);
            System.out.println("Fajlot e zachuvan.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}