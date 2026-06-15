/*  Nama File   : Main.Java 
 *  Deskripsi   : berisi main dalam class Mahasiswa
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Main {
    public static void main(String[] args) {

        // Konstruktor kosong
        Mahasiswa Rota = new Mahasiswa();

        // Konstruktor isi
        Mahasiswa Orcu = new Mahasiswa("30066", "Orcu", "Informatika");
        Mahasiswa Frea = new Mahasiswa("30044", "Frea", "Biologi");

        // Isi sebelum diubah
        System.out.println("Rincian Mahasiswa Sebelum");
        Rota.PrintInfo(); 
        Orcu.PrintInfo();
        Frea.PrintInfo();
        
        // Overloading program studi kosong pada Orcu
        System.out.println("Rincian Orcu setelah overloading tanpa parameter");
        Orcu.setProgramStudi();
        Orcu.PrintInfo();

        // Overloading dengan isi
        System.out.println("Rincian Orcu setelah overloading dengan parameter");
        Orcu.setProgramStudi("Teknik Komputer");
        Orcu.PrintInfo();

        // Overloading dengan objek Mahasiswa lain
        System.out.println("Rincian Rota setelah overloading dengan objek Mahasiswa lain");
        Rota.setProgramStudi(Frea);
        Rota.PrintInfo();

        // Kloning Mahasiswa
                System.out.println("Kloning Mahasiswa");
        Mahasiswa OrcuClone = new Mahasiswa(Orcu);
        OrcuClone.PrintInfo();
    }
}