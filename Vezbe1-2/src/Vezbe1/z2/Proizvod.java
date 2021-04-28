package Vezbe1.z2;

import java.util.ArrayList;

public abstract class Proizvod {
    private String naziv;
    private int ID;
    private Brojac b = new Brojac();
    private char tip;

    public ArrayList<Proizvod> listaProizvoda = new ArrayList<>();
    public ArrayList<Proizvod> getProizvodi(){ return this.listaProizvoda;}

    public Proizvod(String naziv, char tip) {
        boolean postoji = false;
        /*for(int i=0; i<this.listaProizvoda.size(); ++i){
            if((this.listaProizvoda.get(i)).equals(naziv)){
                postoji = true;
            }
        }*/
        if(this.listaProizvoda.contains(naziv)){
            postoji = true;
        }

        if(postoji){
            new Greska("Postoji vec Proizvod sa takvim nazivom");
        }else {
            this.naziv = naziv;
            this.tip = tip;
            this.ID = this.b.getNext();
        }
    }

    public void dodajUListuProizvoda(Proizvod proizvod){
        this.listaProizvoda.add(proizvod);
    }

    public Proizvod nadjiProizvod(String ime){
       /* for(int i=0; i<this.listaProizvoda.size(); i++){
            if((this.listaProizvoda.get(i)).equals(ime)){
                return this.listaProizvoda.get(i);
            }
        }
        return null;*/

        if(this.listaProizvoda.contains(ime)){
            int index = this.listaProizvoda.indexOf(ime);
            return this.listaProizvoda.get(index);
        }
        return null;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getID() {
        return ID;
    }

    public char getTip() {
        return tip;
    }

    @Override
    public String toString() {
        String povratna = "Proizvod: " + System.lineSeparator();
        povratna  += "ID: " + this.ID + System.lineSeparator();
        povratna += "Naziv: " + this.naziv + System.lineSeparator();
        return povratna;
    }
}
