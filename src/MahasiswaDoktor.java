public class MahasiswaDoktor extends Mahasiswa {
    private String judulDisertasi;
    private int nilaiSidang1;
    private int nilaiSidang2;
    private int nilaiSidang3;

    public MahasiswaDoktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String judulDisertasi, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulDisertasi () {
        return judulDisertasi;
    }
    public void setJudulDisertasi (String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public int getNilaiSidang1 () {
        return nilaiSidang1;
    }
    public void setNilaiSidang1 (int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2 () {
        return nilaiSidang2;
    }
    public void setNilaiSidang2 (int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }
    
    public int getNilaiSidang3 () {
        return nilaiSidang3;
    }
    public void setNilaiSidang3 (int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "| judul disertasi: " + judulDisertasi + "| nilai sidang 1: " + nilaiSidang1 + "| nilai sidang 2: " + nilaiSidang2 + "| nilai sidang 3: " + nilaiSidang3;
    }
}
