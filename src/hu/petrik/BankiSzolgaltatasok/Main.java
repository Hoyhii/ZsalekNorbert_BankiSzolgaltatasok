package hu.petrik.BankiSzolgaltatasok;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t = new Tulajdonos("asd");
	    Bank b = new Bank();
        BankiSzolgaltatas bSz = new BankiSzolgaltatas(t);
        HitelSzámla HSZ = new HitelSzámla(t,333,444);
        MegtakarításiSzámla MSZ = new MegtakarításiSzámla(t,222,4);
        Számla szamla = new Számla(t,321);
        szamla.újKártya("123");
        Kártya kartya = new Kártya(t,"123",szamla);
        kartya.Vásárlás(222);

        System.out.println(MSZ);
        System.out.println(HSZ);
        System.out.println(bSz);
        System.out.println(b);
        System.out.println(t);


        HSZ.befizet(3123);
        System.out.println(HSZ.getEgyenleg());
        HSZ.kivesz(31);
        System.out.println(HSZ.getEgyenleg());

        System.out.println("tulaj neve: "+bSz.getTulaj());

        MSZ.újKártya("123");
        MSZ.befizet(3213);
        System.out.println(MSZ.egyenleg);
        MSZ.kivesz(33);
        System.out.println(MSZ.egyenleg);
        MSZ.setKamat(3);
        MSZ.kamatjovairas();
        System.out.println("egyenleg kamatjóváirás után: "+MSZ.egyenleg);
        System.out.println("KAMAT: "+MSZ.getKamat());


        szamla.befizet(123);
        System.out.println(szamla.egyenleg);



    }
}
