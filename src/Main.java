import java.util.*;

public class Main {

    public static void main(String[] args) {

        Dosen dosen1 = new DosenTetap("Setiawan", "Jl. Keramaian No. 10", "Bandung, 1 Desember 1980", "081734221237", "001", "Informatika", Arrays.asList("Matematika Informatika"), Arrays.asList("2024-10-10", "2024-10-11", "2024-10-12"),5000000);
        Dosen dosen2 = new DosenTetap("Ria", "Jl. Utama No. 11", "Bandung, 6 September 1985", "081738764237", "002", "Informatika", Arrays.asList("Bahasa Indonesia", "Web Design"), Arrays.asList("2024-10-10", "2024-10-13", "2024-10-15"), 5000000);

        System.out.println(dosen1.toString());
        System.out.println(dosen2.toString());

        MahasiswaSarjana mhs1 = new MahasiswaSarjana(
            "Jordan", 
            "Taman Kopo Indah 2 Blok IVB No. 16", 
            "Jakarta, 4 Mei 2005", 
            "0817452005", 
            "1123052", 
            "Informatika", 
            Arrays.asList("2024-10-01", "2024-10-02", "2024-10-03"), // Presensi
            Arrays.asList("Prak PBO", "AI"), 
            80, 
            75, 
            90
        );

        MahasiswaMagister mhs2 = new MahasiswaMagister(
            "Hendra", 
            "Jl. Soreang No. 3", 
            "Bandung, 20 Januari 1995", 
            "0817845220", 
            "2211053", 
            "Informatika", 
            Arrays.asList("2024-10-01", "2024-10-04", "2024-10-05"), // Presensi
            Arrays.asList("AI Lanjut", "Data Science"), 
            "Analisis Sistem AI", 
            80, 
            85, 
            82
        );

        System.out.println(mhs1.toString());
        System.out.println(mhs2.toString());
        
    }
}