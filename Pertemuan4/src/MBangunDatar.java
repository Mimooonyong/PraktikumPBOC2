/*  Nama File   : MBangunDatar.Java 
 *  Deskripsi   : berisi main dalam class BangunDatar
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/12/2026
 */

public class MBangunDatar {
    public static void main(String[] args){
        // Membuat BangunDatar
        Persegi A = new Persegi(4, "Kuning", "Biru");
        Lingkaran B = new Lingkaran(7, "Biru", "Kuning");

        // Test printInfo
        System.out.println("Bangun Persegi A");
        A.printInfo();
        System.out.println("\nBangun Lingkaran B");
        B.printInfo();

        // Setter
        A.setSisi(5);
        B.setJari(14);

        A.setWarna("Hijau");
        B.setWarna("Ungu");

        A.setBorder("Merah");
        B.setBorder("Merah");

        // printInfo setelah setter
        System.out.println("\n== Setelah dimodifikasi ==");
        System.out.println("Bangun Persegi A");
        A.printInfo();
        System.out.println("\nBangun Lingkaran B");
        B.printInfo();
    }
}
