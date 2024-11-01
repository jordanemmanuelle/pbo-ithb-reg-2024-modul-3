import java.util.List;

public class DosenHonorer extends Dosen {
    private int honorPerSKS;


    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<String> matkulDiajar, List<String> presensi, int honorPerSKS) {
        super(nama, alamat, ttl, telepon, nik, honorPerSKS * matkulDiajar.size(), departemen, matkulDiajar, presensi);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
        // Update gaji sesuai perubahan honor per SKS
        this.setGaji(honorPerSKS * this.getMatkulDiajar().size()); 
    }

    @Override
    public String toString() {
        return super.toString() + "| honor per SKS: " + honorPerSKS;
    }
}
