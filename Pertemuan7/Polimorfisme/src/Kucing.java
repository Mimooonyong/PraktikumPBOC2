/*  Nama File   : Kucing.Java 
 *  Deskripsi   : berisi method dalam class Kucing
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Kucing extends Anabul {
    // METHOD
    // Konstruktor
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    void suara() {
        System.out.println(getNama() + " berbunyi meong");
    }
}
