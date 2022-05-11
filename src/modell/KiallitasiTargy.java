package modell;

import java.time.LocalDate;
import java.util.Comparator;


class CimComparator implements Comparator<KiallitasiTargy> {

    @Override
    public int compare(KiallitasiTargy o1, KiallitasiTargy o2) {
        return o1.getCim().compareTo(o2.getCim());
    }

}

class KeszitoComparator implements Comparator<KiallitasiTargy> {

    @Override
    public int compare(KiallitasiTargy o1, KiallitasiTargy o2) {
        return o1.getKeszito().compareTo(o2.getKeszito());
    }

}

public abstract class KiallitasiTargy {
    private LocalDate datum;
    private String keszito, cim;

    public KiallitasiTargy(String keszito, String cim) throws HibasDatumException {
        this(LocalDate.now(), keszito, cim);
    }

    public KiallitasiTargy(LocalDate datum, String keszito, String cim) throws HibasDatumException {
        if(datum.isAfter(LocalDate.now())){
            throw new HibasDatumException("Nem létező dátum");
        }
        this.datum = datum;
        
        this.keszito = keszito;
        this.cim = cim;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "KiallitasiTargy{" + "datum=" + datum + ", keszito=" + keszito + ", cim=" + cim + '}';
    }
    
    public static KeszitoComparator KeszitoRendezo() {
        return new KeszitoComparator();
    }
    
    public static CimComparator CimRendezo() {
        return new CimComparator();
    }
}
