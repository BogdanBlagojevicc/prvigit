package Vezbe1.z1;

public class Poljoprivrednik extends Proizvodjac{
    private int brojHektara;

    public Poljoprivrednik(String naziv, int brojHektara) {
        super(naziv);
        this.brojHektara = brojHektara;
    }

    @Override
    public float getCena(String nazivProizvoda){
        float cena = 0;
        if(getProizvodi().contains(nazivProizvoda)){
            int index = getProizvodi().indexOf(nazivProizvoda);
            cena = getCene().get(index);
            if(this.brojHektara > 1){
                cena = cena - (this.brojHektara - 1) * 2f/100 * cena;
            }
        }
        return cena;
    }
}
