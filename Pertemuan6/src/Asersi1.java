/* Nama : Dian Aulya Dewiyani
 * NIM : 24060124130059
 * File : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Tanggal : 3/26/2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}