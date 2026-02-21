package Jobsheet2PASD;
public class Matkul24 {

   
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;

    
    public Matkul24() {
        this.kodeMK = "MK001";
        this.nama = "Pemrograman Dasar";
        this.sks = 3;
        this.jumlahJam = 2;
    }

    
    public Matkul24(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }


    public void tampilInformasi() {
        System.out.println("Kode MK      : " + kodeMK);
        System.out.println("Nama MK      : " + nama);
        System.out.println("SKS          : " + sks);
        System.out.println("Jumlah Jam   : " + jumlahJam);
        System.out.println("-----------------------------");
    }

  
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sksBaru);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jam berhasil ditambahkan. Total jam sekarang: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi. Total jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jam tidak mencukupi.");
        }
    }
}
    

