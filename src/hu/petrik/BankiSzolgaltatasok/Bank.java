package hu.petrik.BankiSzolgaltatasok;


import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Számla> számlaList;

    public Bank() {
        this.számlaList = new ArrayList<>();
    }

    public Számla szamlaNyitas(Tulajdonos tulajdonos,int hitelkeret){
        Számla szamla;
        double egyenleg = 0;
        double kamat = 0;
        if (hitelkeret < 0){
            szamla = new MegtakarításiSzámla(tulajdonos,egyenleg,kamat);
        }else
        {
            szamla = new HitelSzámla(tulajdonos,egyenleg,hitelkeret);
        }
        számlaList.add(szamla);
        return szamla;
    }
    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int ossz = 0;
        for (Számla darab: számlaList) {
            if (darab.getTulaj() == tulajdonos){
                ossz = (int) (ossz + darab.getEgyenleg());
            }
        }
        return ossz;
    }

}
