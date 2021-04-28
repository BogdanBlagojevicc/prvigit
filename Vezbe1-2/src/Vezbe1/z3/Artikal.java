package Vezbe1.z3;

public abstract class Artikal {
    private String naziv;
    private JedinicaMere jm;

    public Artikal(String naziv, JedinicaMere jm) {
        this.naziv = naziv;
        this.jm = jm;
    }

    @Override
    public String toString() {
        String povratna = "";
        povratna += "Naziv artikla: " + this.naziv + System.lineSeparator();
        return povratna;
    }

    public JedinicaMere getJm() {
        return jm;
    }

    public void setJm(JedinicaMere jm) {
        this.jm = jm;
    }



}
