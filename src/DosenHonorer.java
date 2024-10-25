import java.util.List;

public class DosenHonorer extends Dosen {
    private int honorPerSKS;

    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<String> matkulDiajar, int honorPerSKS) {
        super(nama, alamat, ttl, telepon, nik, departemen, matkulDiajar);
        this.honorPerSKS = honorPerSKS;  
    }

    public int getHonorPerSKS () {
        return honorPerSKS;
    }
    public void setHonorPerSKS (int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "| honor per SKS: " + honorPerSKS;
    }
}
