import java.util.List;

abstract public class Dosen extends Staff {
    private String departemen;
    private List<String> matkulDiajar;

    public Dosen (String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<String> matkulDiajar) {
        super(nama, alamat, ttl, telepon, nik);
        this.departemen = departemen;
        this.matkulDiajar = matkulDiajar;
    }

    public String getDepartemen () {
        return departemen;
    }
    public void setDepartemen (String departemen) {
        this.departemen = departemen;
    }

    public List<String> getMatkulDiajar () {
        return matkulDiajar;
    }
    public void setMatkulDiajar (List<String> matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    @Override
    public String toString() {
        return super.toString() + "| departemen: " + departemen + "| mata kuliah yang diajar: " + matkulDiajar;
    }
}
