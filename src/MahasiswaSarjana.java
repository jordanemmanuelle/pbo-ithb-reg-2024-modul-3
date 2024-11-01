import java.util.List;

public class MahasiswaSarjana extends Mahasiswa {
    private List<String> listMatkul;
    private double n1;
    private double n2;
    private double n3;

    public MahasiswaSarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, List<String> presensi, List<String> listMatkul, double n1, double n2, double n3) {
        super(nama, alamat, ttl, telepon, nim, jurusan, presensi);
        this.listMatkul = listMatkul;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public List<String> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(List<String> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    @Override
    public double getNA() {
        return (n1 + n2 + n3) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + "| Mata kuliah yang diambil: " + String.join(", ", listMatkul) +
               "| Nilai 1: " + n1 + "| Nilai 2: " + n2 + "| Nilai 3: " + n3;
    }
}
