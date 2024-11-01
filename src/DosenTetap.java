import java.util.List;

public class DosenTetap extends Dosen {

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<String> matkulDiajar, List<String> presensi, double gaji) {
        super(nama, alamat, ttl, telepon, nik, gaji, departemen, matkulDiajar, presensi);
    }

    @Override
    public String toString() {
        return super.toString() + "| gaji tetap: " + this.getGaji();
    }
}
