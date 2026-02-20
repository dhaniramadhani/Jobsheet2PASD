package Jobsheet2PASD;
public class MAHASISWAMAIN24 {

    public static void main(String[] args) {

        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.tampilkanInformasi();

        mhs2.ubahKelas("TI 2M");
        mhs2.updateIpk(3.3);
        mhs2.tampilkanInformasi();
        
        Mahasiswa mhsAli = new Mahasiswa("Ali Fikri", "2241720180", 3.7, "SI 2M");
        mhsAli.tampilkanInformasi();
    }
}