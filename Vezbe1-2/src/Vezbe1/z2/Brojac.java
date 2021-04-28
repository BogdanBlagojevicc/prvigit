package Vezbe1.z2;

public class Brojac {
    private int vrd;

    public int getNext(){
        ++this.vrd;
        return this.vrd;
    }

    public void reset(){
        this.vrd = 0;
    }

    public Brojac() {
    }
}
