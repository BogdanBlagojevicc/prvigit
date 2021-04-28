package Vezbe1.z2;

public class Poljoprivrednik extends Proizvodjac{

    public Poljoprivrednik(String ime) {
        super(ime);
    }

    public void dodajProizvod(Proizvod proizvod, float cena){
        if(proizvod.getTip() == 'P'){
            if(this.N.contains(proizvod)){
                int index = this.N.indexOf(proizvod);
                this.cene.set(index, cena + cena * 20.0F/100.0F);
            }else{
                this.N.add(proizvod);
                this.cene.add(cena + cena * 20.0F/100.0F);
            }
        }else{
            new Greska("Proizvod nije tipa 'P'. ");
        }
    }
}
