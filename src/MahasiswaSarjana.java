import java.util.List;

public class MahasiswaSarjana extends Mahasiswa {
    private List<String> listMatkul;

    public MahasiswaSarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, List<String> listMatkul) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.listMatkul = listMatkul;
    }

    public List<String> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(List<String> listMatkul) {
        this.listMatkul = listMatkul;
    }

    @Override
    public String toString() {
        return super.toString() + "| Mata kuliah yang diambil: " + String.join(", ", listMatkul);
    }
}