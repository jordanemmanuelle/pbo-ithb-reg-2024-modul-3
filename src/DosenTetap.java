import java.util.List;

public class DosenTetap extends Dosen {
    private double gaji; // Gaji untuk Dosen Tetap

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<String> matkulDiajar, List<String> presensi, double gaji) {
        super(nama, alamat, ttl, telepon, nik, gaji, departemen, matkulDiajar, presensi); // Memanggil konstruktor superclass
        this.gaji = gaji; // Menyimpan gaji di variabel gaji
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return super.toString() + "| gaji tetap: " + this.getGaji(); // Mengembalikan string dengan informasi gaji
    }
}
