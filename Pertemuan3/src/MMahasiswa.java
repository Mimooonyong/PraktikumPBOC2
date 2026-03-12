/*  Nama File   : MMahasiswa.Java 
 *  Deskripsi   : berisi main dalam class Mahasiswa
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/11/2026
 */

import java.util.ArrayList;

public class MMahasiswa {
    public static void main(String[] args){
        // Membuat daftar matakuliah
        ArrayList<MataKuliah> MatkulRotrot = new ArrayList<>();
        ArrayList<MataKuliah> MatkulOrcu = new ArrayList<>();
        MataKuliah AA = new MataKuliah("00", "Pemrograman Dasar", 3);
        MataKuliah AB = new MataKuliah("01", "Bahasa Indonesia dan Penulisan Ilmiah", 2);
        MataKuliah AC = new MataKuliah("02", "Teori Vektor dan Matriks", 2);
        MataKuliah AD = new MataKuliah("03", "Matematika Diskrit", 3);

        MataKuliah BA = new MataKuliah("00", "Pengantar Antropologi", 3);
        MataKuliah BB = new MataKuliah("01", "Pengantar Ilmu Politik", 3);
        MataKuliah BC = new MataKuliah("02", "Penulisan Dan Presentasi Ilmiah", 2);
        MataKuliah BD = new MataKuliah("03", "Pengantar Kriminologi", 3);

        // Membuat daftar dosen
        Dosen E = new Dosen("000", "Meemo", "Teknik Elektro");
        Dosen F = new Dosen("001", "Sierra", "Kriminologi");

        // Membuat daftar kendaraan
        Kendaraan G = new Kendaraan("R0984N", "Motor");
        Kendaraan H = new Kendaraan("R8761G", "Motor");

        // Menyusun Mahasiswa
        Mahasiswa R = new Mahasiswa("2406012412001", "Malus Pyrrophyta", "Teknik Elektro", MatkulRotrot, E, G);
        Mahasiswa O = new Mahasiswa();

        O.setNIM("2406012412002");
        O.setNama("Orcu Carrota");
        O.setProdi("Kriminologi");
        O.setlistMatkul(MatkulOrcu);
        O.setDosenWali(F);
        O.setKendaraan(H);

        // Menambahkan matkul mahasiswa
        R.addMatkul(AA);
        R.addMatkul(AB);
        R.addMatkul(AC);
        R.addMatkul(AD);

        O.addMatkul(BA);
        O.addMatkul(BB);
        O.addMatkul(BC);
        O.addMatkul(BD);

        // Memanggil metode mahasiswa
        System.out.println("== Biodata Mahasiswa R ==");
        R.printDetailMhs();
        R.printMhs();

        System.out.println("\n== Biodata Mahasiswa O ==");
        O.printDetailMhs();
        O.printMhs();
    }
}
