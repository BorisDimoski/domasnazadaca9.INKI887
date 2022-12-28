package zd1;

public class Main {
    public static void main(String[] args) {
        Vraboten v = new Vraboten();
        v.SetIme("Stefan");
        v.SetPrezime("Stefanovski");
        v.SetPlata("10000");
        XML xml = new XML();
        xml.createXMLFile("xml71.xml", v);
    }
}