package hu.petrik.BankiSzolgaltatasok;

public class HitelSzámla extends Számla{
    private double hitelkeret;
    public HitelSzámla(Tulajdonos tulaj, double egyenleg, double hitelkeret) {
        super(tulaj, egyenleg);
        this.hitelkeret = hitelkeret;
    }

    public double getHitelkeret() {
        return hitelkeret;
    }

    @Override
    public boolean kivesz(double osszeg) {
        if (hitelkeret < getEgyenleg() - osszeg){
            egyenleg = egyenleg - osszeg;
            return true;
        }
        return false;
    }
}
