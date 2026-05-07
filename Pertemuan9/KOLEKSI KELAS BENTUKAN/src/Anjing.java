/*  Nama File   : Anjing.Java 
 *  Deskripsi   : berisi method dalam class Anjing
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Anjing extends Anabul{
    // METHOD
    // Konstruktor
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    void suara() {
        System.out.println(getNama() + " berbunyi guk guk");
    }

    
}
