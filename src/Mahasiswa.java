import java.util.List;

abstract public class Mahasiswa extends User {
    private String nim;
    private String jurusan;
    private List<String> presensi; // Menyimpan tanggal presensi mahasiswa dalam format String

    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, List<String> presensi) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
        this.presensi = presensi;
    }

    public String getNIM() {
        return nim;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public List<String> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<String> presensi) {
        this.presensi = presensi;
    }

    public double getNA() {
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + "| NIM: " + nim + "| jurusan: " + jurusan + "| presensi: " + presensi;
    }
}
