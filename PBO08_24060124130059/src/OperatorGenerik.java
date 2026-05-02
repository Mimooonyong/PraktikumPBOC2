/*  Nama File   : OperatorGenerik.Java 
 *  Deskripsi   : berisi method dalam class OperatorGenerik
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}
