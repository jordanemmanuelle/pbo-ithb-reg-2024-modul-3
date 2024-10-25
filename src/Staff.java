abstract public class Staff extends User {
    private String nik;

    public Staff (String nama, String alamat, String ttl, String telepon, String nik) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }
    
    public String getNIK () {
        return nik;
    }
    public void setNIK (String nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return super.toString() + "| nik: " + nik;
    }
}