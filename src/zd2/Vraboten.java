package zd2;

public class Vraboten {
    private String Ime;
    private String Prezime;
    private String Plata;
    public Vraboten (String Ime, String Prezime, String Plata) {
        this.Ime = Ime;
        this.Prezime = Prezime;
        this.Plata = Plata;
    }
    public String GetIme() {
        return Ime;
    }
    public String GetPrezime() {
        return Prezime;
    }
    public String GetPlata() {
        return Plata;
    }
}