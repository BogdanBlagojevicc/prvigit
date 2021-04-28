package Vezbe1.z1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Poljoprivrednik poljoprivrednik = new Poljoprivrednik("Marko Markovic", 2);
        poljoprivrednik.setAdresa("Brace Popovic");
        Firma firma = new Firma("Poljolink", "20133");
        firma.setAdresa("Sumadijska");

        poljoprivrednik.dodajProizvod("grasak", 50);
        poljoprivrednik.dodajProizvod("repa", 100);

        firma.dodajProizvod("secer", 400);
        firma.dodajProizvod("repa", 100);

        ArrayList<Proizvodjac> proizvodjaci = new ArrayList<>();
        proizvodjaci.add(poljoprivrednik);
        proizvodjaci.add(firma);

        for (Proizvodjac p: proizvodjaci) {
            System.out.println(p);
        }

        for(int i=0; i<poljoprivrednik.prebroj(); i++){
            System.out.println("Proizvod: " + poljoprivrednik.getProizvodi().get(i) +
                    " Cena: " + poljoprivrednik.getCena(poljoprivrednik.getProizvodi().get(i)));
        }
    }
}
