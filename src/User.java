abstract public class User {
    private String nama;
    private String alamat;
    private String ttl;
    private String telepon;

    public User (String nama, String alamat, String ttl, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public String getNama() { 
        return nama; 
    }
    public void setNama (String nama) { 
        this.nama = nama; 
    }

    public String getAlamat() { 
        return alamat; 
    }
    public void setAlamat (String alamat) { 
        this.alamat = alamat; 
    }

    public String getTTL() { 
        return ttl; 
    }
    public void setTTL (String ttl) { 
        this.ttl = ttl; 
    }

    public String getTelepon() { 
        return telepon; 
    }
    public void setTelepon (String telepon) { 
        this.telepon = telepon; 
    }

    @Override
    public String toString () {
        return "nama: " + nama + "| alamat: " + alamat + "| TTL: " + ttl + "| telepon: " + telepon;
    }
}
