abstract public class Staff extends User {
    private String nik;
    protected double gaji;

    public Staff(String nama, String alamat, String ttl, String telepon, String nik, double gaji) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
        this.gaji = gaji;
    }

    public String getNIK() {
        return nik;
    }

    public void setNIK(String nik) {
        this.nik = nik;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return super.toString() + "| nik: " + nik + "| gaji: " + gaji;
    }

}