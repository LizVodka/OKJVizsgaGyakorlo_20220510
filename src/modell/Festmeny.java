package modell;

import java.io.File;
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Festmeny extends KiallitasiTargy implements Serializable{
    private File utvonal;
    
    public Festmeny(String keszito, String cim) throws HibasDatumException {
        this(new File("nincs"), keszito, cim);
    }

    public Festmeny(File utvonal, String keszito, String cim) throws HibasDatumException {
        this(utvonal, LocalDate.now(), keszito, cim);
    }

    public Festmeny(LocalDate letrehozas, String keszito, String cim) throws HibasDatumException {
        this(new File("nincs"), letrehozas, keszito, cim);
    }
    
    public Festmeny(File utvonal, LocalDate datum, String keszito, String cim) throws HibasDatumException {
        super(datum, keszito, cim);
        this.utvonal = utvonal;
    }
    
//    SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
//    public Festmeny(String sor) throws HibasDatumException{
//        this(new File(sor.split(";")[0]), LocalDate.parse(sor.split(";")[1]), sor.split(";")[2], sor.split(";")[3]);
//    }
    
    public void megjelenites(){
        if(utvonal.exists()){
            System.out.println("Megjelenítés folyamatban...");
        }else{
            System.out.println("Nem lehet megjeleníteni");
        }
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "Festmeny{" + "utvonal=" + utvonal + '}';
    }
    
    
}
