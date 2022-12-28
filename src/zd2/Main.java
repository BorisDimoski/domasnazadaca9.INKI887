package zd2;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Vraboten> v = new ArrayList<>();
        v.add(new Vraboten("Stefan", "Stefanovski", "10000"));
        v.add(new Vraboten("Aleksandar", "Ristevski", "15000"));
        v.add(new Vraboten("Igor", "Zavojchevski", "20000"));
        XML xml = new XML();
        xml.createXMLFile("xml2.xml", v);
    }
}