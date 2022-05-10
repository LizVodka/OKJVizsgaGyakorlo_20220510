package modell;

import java.util.ArrayList;

public class Galeria {
    private ArrayList<Festmeny> targyak;
    
    public Galeria() {
        targyak = new ArrayList<>();
    }
    
    public void felvesz(Festmeny festmeny) {
        targyak.add(festmeny);
    }

    @Override
    public String toString() {
        return "Galeria{" + "targyak=" + targyak + '}';
    }

    public ArrayList<Festmeny> getTargyak() {
        return targyak;
    }
    
    public void galeriaMegjelenit() {
        for(Festmeny targy : targyak) {
            System.out.println(targy);
        }
    }
}
