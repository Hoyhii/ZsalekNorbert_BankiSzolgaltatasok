package hu.petrik.BankiSzolgaltatasok;

public class Számla extends BankiSzolgaltatas{
    protected double egyenleg;

    public Számla(Tulajdonos tulaj, double egyenleg) {
        super(tulaj);
        this.egyenleg = egyenleg;
    }

    public double getEgyenleg() {
        return egyenleg;
    }


    public double befizet(double osszeg){
        egyenleg = egyenleg + osszeg;
        return egyenleg;
    }


    public boolean kivesz(double osszeg){
        boolean szabad;
        if(osszeg < egyenleg){
            egyenleg = egyenleg - osszeg;
            szabad = true;
        } else{
            szabad = false;
        }
        return szabad;
    }

    public Kártya újKártya(String kártyaSzám){
        Kártya kártya = new Kártya(getTulaj(),kártyaSzám,this);
        return kártya;
    }
}
