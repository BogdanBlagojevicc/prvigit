package Vezbe1.z3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Vrednosno> red = new ArrayList();
        Korpa korpa1 = new Korpa(3);
        Korpa korpa2 = new Korpa(3);
        Secer secer = new Secer("Podrvka");
        Mleko mleko = new Mleko("Imlek");

        korpa1.dodaj(new Zapis(secer, 1f, 100));
        korpa1.dodaj(new Zapis(secer, 1f,50));
        korpa2.dodaj(new Zapis(mleko, 1, 150));
        korpa2.dodaj(new Zapis(mleko, 1, 150));

        red.add(korpa1);
        red.add(korpa2);


        for(int i=0; i< red.size(); i++){
            System.out.println(red.get(i));
        }


    }
}
