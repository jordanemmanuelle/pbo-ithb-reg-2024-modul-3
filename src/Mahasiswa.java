abstract public class Mahasiswa extends User {
    private String nim;
    private String jurusan;

    public Mahasiswa (String nama, String alamat, String ttl, String telepon, String nim, String jurusan) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNIM () {
        return nim;
    }
    public void setNIM (String nim) {
        this.nim = nim;
    }

    public String getJurusan () {
        return jurusan;
    }
    public void setJurusan (String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString () {
        return super.toString() + "| NIM: " + nim + "| jurusan: " + jurusan;
    }
}
