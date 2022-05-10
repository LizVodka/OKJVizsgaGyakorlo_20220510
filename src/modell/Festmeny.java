package modell;

import java.io.File;
import java.util.Comparator;
import java.util.Date;

class KeszitoComparator implements Comparator<Festmeny> {

    @Override
    public int compare(Festmeny o1, Festmeny o2) {
        return o1.getKeszito().compareTo(o2.getKeszito());
    }

}

public class Festmeny extends KiallitasiTargy implements Comparable<Festmeny>{
    private String utvonal;
    
    public Festmeny(Date datum, String keszito, String cim) {
        super(datum, keszito, cim);
        this.utvonal = "";
    }

    public Festmeny(String utvonal, Date datum, String keszito, String cim) {
        super(datum, keszito, cim);
        this.utvonal = utvonal;
    }

    public Festmeny(String utvonal, String keszito, String cim) {
        super(keszito, cim);
        this.utvonal = utvonal;
    }
    
    public Festmeny(String keszito, String cim) {
        super(keszito, cim);
        this.utvonal = "";
    }

    public String getUtvonal() {
        return utvonal;
    }
    
    public void megjelenit(Festmeny festmeny) {
        File myObj = new File(festmeny.getUtvonal());
        if (myObj.exists()) {
            System.out.println("Megjelenítés folyamatban...");
        } else {
            System.out.println("Nem lehet megjeleníteni!");
        }
    }

    @Override
    public int compareTo(Festmeny o) {
        return this.getCim().compareTo(o.getCim());
    }
    
    public static KeszitoComparator KeszitoRendezo() {
        return new KeszitoComparator();
    }
}
