package Vezbe1.z3;


public class JedinicaMere {
    private String oznaka;

    public JedinicaMere(String oznaka) {
        if(!oznaka.equals("kom") && !oznaka.equals("l") && !oznaka.equals("m") && !oznaka.equals("kg")){
            Exception e = new Exception("Nije odgovarajuca oznaka");
            e.printStackTrace();
        }else{
            this.oznaka = oznaka;
        }
    }

    @Override
    public String toString() {
        String povratna = "";
        povratna += "Oznaka: "  + this.oznaka + System.lineSeparator();
        return povratna;
    }
}
