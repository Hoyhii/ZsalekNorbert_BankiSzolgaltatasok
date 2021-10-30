package hu.petrik.BankiSzolgaltatasok;

public class MegtakarításiSzámla extends Számla{
    private double kamat;
    private static double alapkamat;

    public MegtakarításiSzámla(Tulajdonos tulaj, double egyenleg, double kamatmerteke) {
        super(tulaj, egyenleg);
        this.kamat = kamatmerteke;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(double osszeg) {
        if (getEgyenleg() - osszeg > 0){
            egyenleg = egyenleg - osszeg;
            return true;
        }

        return false;
    }

    public void kamatjovairas(){
        egyenleg = (kamat * 0.01 * egyenleg) + egyenleg;
    }
}
