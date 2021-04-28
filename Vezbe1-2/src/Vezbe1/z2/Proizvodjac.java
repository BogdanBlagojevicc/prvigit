package Vezbe1.z2;

import java.util.ArrayList;

public abstract class Proizvodjac implements Proizvodi{

   public ArrayList<Proizvod> N = new ArrayList();
   public ArrayList<Float> cene = new ArrayList();
   private String ime;

   public Proizvodjac(String ime) {
      this.ime = ime;
   }

   public ArrayList<Proizvod> dajListuProizvoda(){
      return this.N;
   }

   public abstract void dodajProizvod(Proizvod proizvod,float cena);

   public int nadjiProizvod(String naziv){
      int index = -1;
      if(this.N.contains(naziv)){
         index = N.indexOf(naziv);
         return index;
      }
      return index;
   }

   public float cena(String naziv){
      if(this.N.contains(naziv)){
         int index = this.N.indexOf(naziv);
         return this.cene.get(index);
      }
      return -1.0F;
   }

   public float cena(Proizvod proizvod){
      if(this.N.contains(proizvod)){
         int index = this.N.indexOf(proizvod);
         return this.cene.get(index);
      }
      return -1.0F;
   }

   @Override
   public String toString() {
      String povratna = "";
      povratna += "Ime: " + this.ime + System.lineSeparator();
      povratna += "Proizvodi: " + System.lineSeparator();

      for(int i=0; i<this.N.size(); i++){
         povratna += (i+1) + ". " + this.N.get(i).getNaziv() + " " +this.cene.get(i)
                 + System.lineSeparator();
      }
      return povratna;
   }
}
