package Vezbe1.z2;

import java.util.ArrayList;

public interface Proizvodi{
    ArrayList<Proizvod> dajListuProizvoda();

    float cena(String naziv);

    float cena(Proizvod proizvod);
}
