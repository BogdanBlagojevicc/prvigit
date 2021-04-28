package Vezbe1.z2;

public class Firma extends Proizvodjac{
    private String PIB;

    public Firma(String ime, String PIB) {
        super(ime);
        this.PIB = PIB;
    }

    public void dodajProizvod(Proizvod proizvod,float cena){
        if(this.N.contains(proizvod)){
            int index = this.N.indexOf(proizvod);
            this.cene.set(index, cena + cena * 40.0F/100.0F);
        }else{
            this.N.add(proizvod);
            this.cene.add(cena + cena * 40.0F/100.0F);
        }
    }
}
