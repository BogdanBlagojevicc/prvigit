package Vezbe1.z3;

import java.util.ArrayList;

public class Korpa extends Vrednosno {
    private ArrayList<Zapis> sadrzaj = new ArrayList();
    private int max;

    public Korpa(int max) {
        this.max = max;
    }

    public void dodaj(Zapis zapis){
        if(this.max > this.sadrzaj.size()) {
            this.sadrzaj.add(zapis);
        }else{
            Exception e = new Exception("Maksimalni kapacitet korpe je premasen");
            e.printStackTrace();
        }
    }

    public double vrednost(){
        double vred = 0.0;
        for(int i=0; i<this.sadrzaj.size(); i++){
            vred += this.sadrzaj.get(i).getVrednost();
        }
        return vred;
    }

    @Override
    public String toString() {
        String povratna = "[";
        for(int i=0; i<this.sadrzaj.size(); i++){
            povratna += "(" + this.sadrzaj.get(i).getArtikal().toString() + ", " + this.sadrzaj.get(i).getKolicina() + ", "
                    + this.sadrzaj.get(i).getJedCena() + ", " + this.sadrzaj.get(i).getVrednost() + ")";
            if(i!=this.sadrzaj.size() - 1){
                povratna += ", ";
            }
        }
        povratna += "]";
        return povratna;
    }
}
