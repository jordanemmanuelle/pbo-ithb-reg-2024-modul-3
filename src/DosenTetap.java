import java.util.List;

public class DosenTetap extends Dosen {
    private int gaji;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<String> matkulDiajar, int gaji) {
        super(nama, alamat, ttl, telepon, nik, departemen, matkulDiajar);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return super.toString() + "| gaji: " + gaji;
    }
}
