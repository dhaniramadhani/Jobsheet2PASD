package Jobsheet2PASD;

public class DosenMain24 {
    public static void main(String[] args) {

        // Objek 1 - Konstruktor default
        Dosen24 d1 = new Dosen24();
        d1.tampilInformasi();

        // Objek 2 - Konstruktor berparameter
        Dosen24 d2 = new Dosen24("D002", "Prof. Andi", true, 2010, "Struktur Data");
        d2.tampilInformasi();

        // Uji method
        d2.setStatusAktif(false);
        d2.ubahKeahlian("Kecerdasan Buatan");

        d2.tampilInformasi();
    }
}
    
