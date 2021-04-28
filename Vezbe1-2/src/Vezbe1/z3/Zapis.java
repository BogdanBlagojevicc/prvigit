package Vezbe1.z3;

public class Zapis {
    private Artikal artikal;
    private float kolicina;
    private float jedCena;
    private float vrednost;

    public Zapis(Artikal artikal, float kolicina, float jedCena) {
        this.artikal = artikal;
        this.kolicina = kolicina;
        this.jedCena = jedCena;
        this.vrednost = this.kolicina * this.jedCena;
    }

    public Artikal getArtikal() {
        return artikal;
    }

    public void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }

    public float getKolicina() {
        return kolicina;
    }

    public void setKolicina(float kolicina) {
        this.kolicina = kolicina;
    }

    public float getJedCena() {
        return jedCena;
    }

    public void setJedCena(float jedCena) {
        this.jedCena = jedCena;
    }

    public float getVrednost() {
        return vrednost;
    }

    @Override
    public String toString() {
        String povratna = "";
        povratna += this.artikal.toString() + System.lineSeparator();
        povratna += ", Kolicina: "  + this.kolicina + System.lineSeparator();
        povratna += ", jedCena: " + this.jedCena + System.lineSeparator();
        povratna += ", vrednost: " + this.vrednost + System.lineSeparator();
        return povratna;
    }
}
