/*  Nama File   : MDosen.Java 
 *  Deskripsi   : berisi main dalam class Dosen
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/5/2026
 */

public class MDosen {
    public static void main(String[] args) {
        Dosen A = new Dosen();
        Dosen B = new Dosen("1234", "Meemo", "Informatika");

        System.out.println("NIP Dosen B = " + B.getNIP());
        System.out.println("Nama Dosen B = " + B.getNama());
        System.out.println("NIP Dosen B = " + B.getProdi());

        A.setNIP("2345");
        A.setNama("Rota");
        A.setProdi("Teknik Elektro");

        System.out.println("\nNIP Dosen A = " + A.getNIP());
        System.out.println("Nama Dosen A = " + A.getNama());
        System.out.println("NIP Dosen A = " + A.getProdi());
    }
}
