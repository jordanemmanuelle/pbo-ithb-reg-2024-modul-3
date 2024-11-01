import java.util.List;

abstract public class Dosen extends Staff {
    private String departemen;
    private List<String> matkulDiajar;
    private List<String> presensi; // Menyimpan tanggal presensi dosen dalam format String

    public Dosen(String nama, String alamat, String ttl, String telepon, String nik, double gaji, String departemen, List<String> matkulDiajar, List<String> presensi) {
        super(nama, alamat, ttl, telepon, nik, gaji);
        this.departemen = departemen;
        this.matkulDiajar = matkulDiajar;
        this.presensi = presensi;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public List<String> getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(List<String> matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    public List<String> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<String> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        return super.toString() + "| departemen: " + departemen + "| mata kuliah yang diajar: " + matkulDiajar + "| presensi: " + presensi;
    }
}
