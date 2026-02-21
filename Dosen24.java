package Jobsheet2PASD;
import java.time.Year;

public class Dosen24 {

    // Atribut
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;

    // Konstruktor default
    public Dosen24() {
        this.idDosen = "D001";
        this.nama = "Dr. Budi";
        this.statusAktif = true;
        this.tahunBergabung = 2015;
        this.bidangKeahlian = "Pemrograman";
    }

    // Konstruktor berparameter
    public Dosen24(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method tampil informasi
    public void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
        System.out.println("----------------------------------");
    }

    // Method set status aktif
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        if (status) {
            System.out.println("Dosen diaktifkan.");
        } else {
            System.out.println("Dosen dinonaktifkan.");
        }
    }

    // Method hitung masa kerja
    public int hitungMasaKerja() {
        int tahunSekarang = Year.now().getValue();
        return tahunSekarang - tahunBergabung;
    }

    // Method ubah keahlian
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi " + bidang);
    }
}

