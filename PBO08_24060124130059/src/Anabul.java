/*  Nama File   : Anabul.Java 
 *  Deskripsi   : berisi method dalam class Anabul
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Anabul {
    //ATRIBUT
    private String nama;

    // METHOD
    // Konstruktor
    Anabul(String nama) {
        this.nama = nama;
    }

    // Operator
    String getNama() {
        return nama;
    }

    // Menampilkan bagaimana anabul bergerak
    void gerak() {
        System.out.println("Gerak");
    }

    // Menampilkan bagaimana anabul bersuara
    void suara() {
        System.out.println("Suara");
    }

    // Print informasi anabul
    void PrintInfo(){
        System.out.println("Nama anabul : " + nama);
        gerak();
        suara();
        System.out.println("\n");
    }
}