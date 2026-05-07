/*  Nama File   : Burung.Java 
 *  Deskripsi   : berisi method dalam class Burung
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Burung extends Anabul{
    // Konstruktor
    Burung(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    void suara() {
        System.out.println(getNama() + " berbunyi cuit cuit");
    }
}
