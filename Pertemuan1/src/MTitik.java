/*  Nama File   : Titik.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 2/19/2026
 */

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(3, 4);
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
    }
}
