package Vezbe1.z1;

public class Firma extends Proizvodjac{
    private String PIB;

    public Firma(String naziv, String PIB) {
        super(naziv);
        this.PIB = PIB;
    }

    @Override
    public float getCena(String nazivProizvoda) {
        float cena = 0;
        if(getProizvodi().contains(nazivProizvoda)){
            int index = getProizvodi().indexOf(nazivProizvoda);
            cena = getCene().get(index);
        }
        return cena;
    }
}
