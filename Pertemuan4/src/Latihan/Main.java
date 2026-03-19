package Latihan;

public class Main {
    public static void main(String[] args) {
        // Kamus Lokal

        // Membuat Kalender
        Bulan.makeKalender();
        
        // Tanggal Penting
        Tanggal Sekarang = new Tanggal(10, 3, 2026);
        Tanggal TLR = new Tanggal(22, 6, 2000);
        Tanggal TMTR = new Tanggal(9, 9, 2019);

        Tanggal TLS = new Tanggal(9, 6, 2006);
        Tanggal TMTS = new Tanggal(6, 9, 2023);
        Tanggal TKS = new Tanggal(9, 9, 2027);

        Tanggal TLK = new Tanggal(22, 3, 2000);
        Tanggal TMTK = new Tanggal(20, 8, 2024);

        // Dosen Tetap
        DosenTetap Rota = new DosenTetap("001", "Malus Pyrrophyta", TLR, TMTR, 5000000, "Fakultas Teknik", "N01");

        // Dosen Tamu
        DosenTamu Sierra = new DosenTamu("002", "Sierra", TLS, TMTS, 2000000, "Fakultas Sains dan Matematika", "K01", TKS);

        // Tendik
        Tendik Kairo = new Tendik("003", "Kairo Alther", TLK, TMTK, 1000000, "Akademik");

        // PrintInfo Semua
        System.out.println("Deskripsi Dosen Tetap 1");
        Rota.printInfo(Sekarang);

        System.out.println("\nDeskripsi Dosen Tamu 1");
        Sierra.printInfo(Sekarang);

        System.out.println("\nDeskripsi Tendik 1");
        Kairo.printInfo(Sekarang);
    }
}