/*  Nama File   : Main.java 
 *  Deskripsi   : berisi main dalam class Civitasakademika
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

public class Main {
    public static void main(String[] args) {

        // Konstruktor Polimorfisme

        // Konstruktor Dosen
        Civitasakademika Rota = new Dosen("Malus Pyrrophyta", "2206", "Teknik Elektro");
        Civitasakademika Sierra = new Dosen("Sierra", "404", "Informatika");

        // Konstruktor Mahasiswa
        Civitasakademika Frea = new Mahasiswa("Frea", "24001", "Teknik Elektro", (Dosen) Rota);
        Civitasakademika Orcu = new Mahasiswa("Orcu Carrota", "24001", "Informatika", (Dosen) Sierra);
        Civitasakademika Glacus = new Mahasiswa("Glaze Glacus", "24002", "Teknik Elektro", (Dosen) Rota);
        Civitasakademika Brachi = new Mahasiswa("Brachi", "24003", "Teknik Elektro", (Dosen) Rota);
        Civitasakademika Corvi = new Mahasiswa("Corvi", "24002", "Informatika", (Dosen) Rota);

        // Konstruktor Seminar
        Seminar Seminar = new Seminar();

        // METHOD
        // Registrasi Dosen dan Mahasiswa ke dalam Seminar
        Seminar.registrasi(Rota);
        Seminar.registrasi(Sierra);
        Seminar.registrasi(Frea);
        Seminar.registrasi(Orcu);
        Seminar.registrasi(Glacus);
        Seminar.registrasi(Brachi);
        Seminar.registrasi(Corvi);

        // Menghitung Total Peserta dan Total masing-masing dari Mahasiswa dan Dosen
        System.out.println("Total peserta           : " + Seminar.countPeserta());
        System.out.println("Total peserta Mahasiswa : " + Seminar.countMahasiswa());
        System.out.println("Total peserta Dosen     : " + Seminar.countDosen());

        // Menampilkan data semua peserta
        System.out.println("\n== Daftar Peserta Seminar == \n");
        Seminar.tampilPeserta();

        // Mengubah Dosen Wali dari Mahasiswa
        ((Mahasiswa) Corvi).setWali((Dosen) Sierra);

        // Menampilkan informasi data Mahasiswa
        System.out.println("\nData Mahasiswa:");
        ((Mahasiswa) Frea).tampilDataMahasiswa();
        ((Mahasiswa) Orcu).tampilDataMahasiswa();
        ((Mahasiswa) Glacus).tampilDataMahasiswa();
        ((Mahasiswa) Brachi).tampilDataMahasiswa();
        ((Mahasiswa) Corvi).tampilDataMahasiswa();
    }
}