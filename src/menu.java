import java.util.Arrays;

import javax.swing.*;

public class menu {

    static MahasiswaSarjana mhs1 = new MahasiswaSarjana("Jordan", "Taman Kopo Indah 2 Blok IVB No. 16", "Jakarta, 4 Mei 2005", "0817452005", "1123052", "Informatika", Arrays.asList("2024-10-01", "2024-10-02", "2024-10-03"), Arrays.asList("Prak PBO", "AI"), 80, 75, 90);
    static MahasiswaMagister mhs2 = new MahasiswaMagister("Hendra", "Jl. Soreang No. 3", "Bandung, 20 Januari 1995", "0817845220", "2211053", "Informatika", Arrays.asList("2024-10-01", "2024-10-04", "2024-10-05"), Arrays.asList("AI Lanjut", "Data Science"), "Analisis Sistem AI", 80, 85, 82);

    static Mahasiswa[] mhsArray = {mhs1, mhs2};

    static Dosen dosen1 = new DosenTetap("Setiawan", "Jl. Keramaian No. 10", "Bandung, 1 Desember 1980", "081734221237", "001", "Informatika", Arrays.asList("Matematika Informatika"), Arrays.asList("2024-10-10", "2024-10-11", "2024-10-12"),5000000);
    static Dosen dosen2 = new DosenTetap("Ria", "Jl. Utama No. 11", "Bandung, 6 September 1985", "081738764237", "002", "Informatika", Arrays.asList("Bahasa Indonesia", "Web Design"), Arrays.asList("2024-10-10", "2024-10-13", "2024-10-15"), 5000000);

    static User[] semuaArray = {mhs1, mhs2, dosen1, dosen2};

    public static void main(String[] args) {
        while (true) {
            String menu = """
                    Pilih Menu:
                    1. Print UserData
                    2. Print NA
                    3. Print Seluruh NA
                    4. Print mhs tidak lulus
                    5. Print Presensi
                    6. Print Total Jam Dosen
                    7. Print Gaji Staff
                    8. Exit
                    """;
            String input = JOptionPane.showInputDialog(menu);
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1 -> printUserData();
                case 2 -> printNA(); 
                case 3 -> printNR();
                case 4 -> printTidakLulus();
                case 5 -> printPresensi();
                case 6 -> printUserData();
                case 7 -> printNA();
                case 8 -> System.exit(0);
                default -> JOptionPane.showMessageDialog(null, "Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    private static void printUserData() {
        String nama = JOptionPane.showInputDialog("input nama: ");
        boolean found = false;

        for (User printAll : semuaArray) {
            if (printAll.getNama().equals(nama)) {
                JOptionPane.showMessageDialog(null, nama + ": " + printAll.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "nama is not found");
        }
    }

    private static void printNA() {
        
        String nim = JOptionPane.showInputDialog("input NIM: ");
        String jurusan = JOptionPane.showInputDialog("input jurusan: ");
        boolean found = false;

        for (Mahasiswa mahasiswa : mhsArray) {
            if (mahasiswa.getNIM().equals(nim) && mahasiswa.getJurusan().equalsIgnoreCase(jurusan)) {
                JOptionPane.showMessageDialog(null, "Nilai Akhir: " + mahasiswa.getNA());
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "NA is not found");
        }
    }

    private static void printNR(){
        String jurusan = JOptionPane.showInputDialog("input jurusan: ");
        double rataRata = (mhs1.getNA() + mhs2.getNA()) / 2;
        boolean found = false;

        for (Mahasiswa mahasiswa : mhsArray) {
            if (mahasiswa.getJurusan().equalsIgnoreCase(jurusan)) {
                JOptionPane.showMessageDialog(null, "nilai rata-rata seluruh mahasiswa adalah " + rataRata);
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "not found");
        }
    }

    private static void printTidakLulus(){
        String jurusan = JOptionPane.showInputDialog("input jurusan: ");
        boolean found = false;
        int count = 0;
        for (Mahasiswa mahasiswa : mhsArray) {
            if (mahasiswa.getJurusan().equalsIgnoreCase(jurusan) && mahasiswa.getNA() < 56) {
                count++;
                JOptionPane.showMessageDialog(null, "jumlah mahasiswa yang tidak lulus adalah " + count);
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "semuanya lulus!");
        }
    }

    private static void printPresensi(){
        String nim = JOptionPane.showInputDialog("input NIM: ");
        boolean found = false;
        
        for (Mahasiswa mahasiswa : mhsArray) {
            if (mahasiswa.getNIM().equalsIgnoreCase(nim)) {
                JOptionPane.showMessageDialog(null,mahasiswa.getPresensi());
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "not found");
        }
    }
}
