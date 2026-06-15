/*  Nama File   : Mahasiswa.Java 
 *  Deskripsi   : berisi method dalam class Mahasiswa
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Mahasiswa {
    // ATRIBUT
    private String NIM;
    private String Nama;
    private String ProgramStudi;

    // METHOD
    //Konstruktor tanpa parameter
    Mahasiswa() {
        this.NIM = "999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // Konstruktor
    Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    // Konstruktor kloning objek Mahasiswa
    Mahasiswa(Mahasiswa mhs) {
        this.NIM = mhs.NIM;
        this.Nama = mhs.Nama;
        this.ProgramStudi = mhs.ProgramStudi;
    }


    // Tanpa parameter
    void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    // Dengan Parameter
    void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    // Dengan parameter objek Mahasiswa
    void setProgramStudi(Mahasiswa mhs) {
        this.ProgramStudi = mhs.ProgramStudi;
    }

    // Menampilkan informasi Objek Mahasiswa
    void PrintInfo() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + ProgramStudi);
        System.out.println("\n");
    }
}