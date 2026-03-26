/* Nama : Dian Aulya Dewiyani
 * NIM : 24060124130059
 * File : ExceptionOnArray.java
 * Deskripsi : Program untuk menunjukkan eksepsi
 * Tanggal : 3/26/2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {

        // inisialisasi object array integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // ini akan error (index out of bounds)
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}