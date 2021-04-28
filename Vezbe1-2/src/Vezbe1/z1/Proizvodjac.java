package Vezbe1.z1;

import java.util.ArrayList;

public abstract class Proizvodjac {
    private String naziv;
    private String adresa;
    private ArrayList<String> proizvodi = new ArrayList<>();
    private ArrayList<Float> cene = new ArrayList<>();

    public Proizvodjac(String naziv) {
        this.naziv = naziv;
    }

    public void dodajProizvod(String nazivProizvoda, float cenaProizvoda){
        this.proizvodi.add(nazivProizvoda);
        this.cene.add(cenaProizvoda);
    }

    public abstract float getCena(String nazivProizvoda);

    public int prebroj(){
        return this.proizvodi.size();
    }

    public void izbaciProizvod(String nazivProizvoda){
            if(this.proizvodi.contains(nazivProizvoda)){
                int index = this.proizvodi.indexOf(nazivProizvoda);
                this.proizvodi.remove(index);
                this.cene.remove(index);
            }
    }

    @Override
    public String toString() {
        String povratna = "";
        povratna += "Naziv: " + this.naziv + System.lineSeparator();
        povratna += "Adresa: " + this.adresa + System.lineSeparator();
        povratna += "Proizvodi: " + System.lineSeparator();

        for(int i=0; i<prebroj(); i++){
            povratna += " "  + (i+1) + ". " + this.proizvodi.get(i) + " - " + this.cene.get(i) + System.lineSeparator();
        }
        return povratna;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public ArrayList<String> getProizvodi() {
        return proizvodi;
    }

    public ArrayList<Float> getCene() {
        return cene;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
