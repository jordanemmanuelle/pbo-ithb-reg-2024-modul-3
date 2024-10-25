import java.util.*;

public class Main {

    public static void main(String[] args) {
        Dosen dosen1 = new DosenTetap("Setiawan", "Jl. Keramaian No. 10", "Bandung, 1 Desember 1980", "081734221237", "001", "Informatika", Arrays.asList("Matematika Informatika"), 5000000);
        Dosen dosen2 = new DosenTetap("Ria", "Jl. Utama No. 11", "Bandung, 6 September 1985", "081738764237", "002", "Informatika", Arrays.asList("Bahasa Indonesia", "Web Design"), 5000000);

        System.out.println(dosen1.toString());
        System.out.println(dosen2.toString());

        Mahasiswa mhs1 = new MahasiswaSarjana("Jordan", "Taman Kopo Indah 2 Blok IVB No. 16", "Jakarta, 4 Mei 2005", "0817452005", "1123052", "Informatika", Arrays.asList("Prak PBO", "AI"));

        System.out.println(mhs1.toString());
    }
}
