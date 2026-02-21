package Jobsheet2PASD;

public class MatkulMain24 {
    public class MataKuliahMain {
    public static void main(String[] args) {

        Matkul24 mk1 = new Matkul24();
        mk1.tampilInformasi();

        
        Matkul24 mk2 = new Matkul24("MK002", "Struktur Data", 4, 3);
        mk2.tampilInformasi();

    
        mk2.ubahSKS(3);
        mk2.tambahJam(2);
        mk2.kurangiJam(1);

        mk2.tampilInformasi();
    }
}
}
