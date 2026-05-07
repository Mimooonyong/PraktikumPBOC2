/*  Nama File   : Anabul.Java 
 *  Deskripsi   : berisi method dalam class Anabul
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Anabul {
    //ATRIBUT
    private String Panggilan;
    
    // METHOD
    // Konstruktor
    Anabul(String Panggilan) {
        this.Panggilan = Panggilan;
    }

    // Operator
    String getNama() {
        return Panggilan;
    }

    public void setNama(String panggilan) {
        Panggilan = panggilan;
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
        System.out.println("Panggilan anabul : " + Panggilan);
        gerak();
        suara();
        System.out.println("\n");
    }
}