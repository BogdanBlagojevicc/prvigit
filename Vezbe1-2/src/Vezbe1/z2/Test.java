package Vezbe1.z2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Poljoprivredni poljoprivredni1 = new Poljoprivredni("Grasak");
        Poljoprivredni poljoprivredni2 = new Poljoprivredni("Repa");

        Industrijski industrijski = new Industrijski("secer");

        Poljoprivrednik poljoprivrednik = new Poljoprivrednik("Marko Markovic");

        Firma firma = new Firma("Poljolink", "21000");

        poljoprivrednik.dodajProizvod(poljoprivredni1, 50 );
        poljoprivrednik.dodajProizvod(poljoprivredni2, 100);
        poljoprivrednik.dodajProizvod(poljoprivredni1, 100);

        firma.dodajProizvod(industrijski, 400);
        firma.dodajProizvod(poljoprivredni2, 100);

        ArrayList<Proizvodjac> proizvodjaci = new ArrayList();

        proizvodjaci.add(poljoprivrednik);
        proizvodjaci.add(firma);

        for(int i=0; i<proizvodjaci.size(); i++){
            System.out.println(proizvodjaci.get(i));
        }

    }
}
