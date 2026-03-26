/*  Nama File   : MBangunDatar.Java 
 *  Deskripsi   : berisi main dalam class BangunDatar
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/12/2026
 */

public class MBangunDatar {
        public static void main(String[] args){
        // Membuat BangunDatar Pertemuan 5
        // BangunDatar BD1 = new BangunDatar();
        BangunDatar BD2 = new Persegi(5, "Merah", "Oranye");
        Persegi P2 = new Persegi(10, "Kuning", " Hijau");
        BangunDatar L1 = new Lingkaran(14, "Kuning", "Biru");
        Lingkaran L2 = new Lingkaran(14, "Ungu", "Biru");

        // Membuat BangunDatar Pertemuan 4
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

        // Test Main Pertemuan 5
        System.out.println("\n== Mencoba Method dan Interface ==");
        // ini ga bisa compile huhuhu ga tau tadi kenapa T-T
    }
}
