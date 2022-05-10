package modell;

import java.util.Date;

public abstract class KiallitasiTargy {
    private Date datum;
    private String keszito, cim;

    public KiallitasiTargy(Date datum, String keszito, String cim) {
        this.datum = datum;
        this.keszito = keszito;
        this.cim = cim;
    }

    public KiallitasiTargy(String keszito, String cim) {
        this.keszito = keszito;
        this.cim = cim;
        this.datum = new Date();
    }

    public Date getDatum() {
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
    
    
}
