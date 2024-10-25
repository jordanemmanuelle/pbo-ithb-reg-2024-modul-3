import java.util.List;

public class MahasiswaMagister extends Mahasiswa {
    private List<String> listMatkul;
    private String judulTesis;

    public MahasiswaMagister (String nama, String alamat, String ttl, String telepon, String nim, String jurusan, List<String> listMatkul, String judulTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.listMatkul = listMatkul;
        this.judulTesis = judulTesis;
    }

    public List<String> getListMatkul () {
        return listMatkul;
    }
    public void setListMatkul (List<String> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public String getJudulTesis () {
        return judulTesis;
    }
    public void setJudulTesis (String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "| mata kuliah: " + listMatkul + "| judul tesis: " + judulTesis;
    }
}
