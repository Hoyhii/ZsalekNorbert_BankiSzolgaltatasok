package hu.petrik.BankiSzolgaltatasok;

public class Kártya extends BankiSzolgaltatas{
    private String kartyaSzam;
    private Számla szamla;

    public Kártya(Tulajdonos tulaj, String kartyaSzam, Számla szamla) {
        super(tulaj);
        this.kartyaSzam = kartyaSzam;
        this.szamla = szamla;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean Vásárlás(double osszeg){
        if (osszeg < szamla.egyenleg){
            szamla.egyenleg -= osszeg;
            return true;
        }
        return false;
    }
}
