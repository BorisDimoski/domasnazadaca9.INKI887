package zd2;
import java.io.File;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class XML {
    public void createXMLFile(String fileName, List<Vraboten> Vraboten) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element root = document.createElement("Vraboteni");
            document.appendChild(root);
            for (Vraboten v : Vraboten) {
                Element vrabotenElement = document.createElement("Vraboten");
                root.appendChild(vrabotenElement);
                Element Ime =  document.createElement("Ime");
                vrabotenElement.appendChild(Ime);
                Element Prezime = document.createElement("Prezime");
                vrabotenElement.appendChild(Prezime);
                Element Plata = document.createElement("Plata");
                vrabotenElement.appendChild(Plata);
                Ime.appendChild(document.createTextNode(v.GetPrezime()));
                Prezime.appendChild(document.createTextNode(v.GetIme()));
                Plata.appendChild(document.createTextNode(v.GetPlata()));
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);
            System.out.println("Fajlot e kreiran, imeto e: "+ fileName);
            System.out.println("Fajlot e zachuvan.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}