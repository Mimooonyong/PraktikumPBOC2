/*  Nama File   : Mgaris.Java 
 *  Deskripsi   : berisi main dalam class garis
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/5/2026
 */

public class Mgaris {
    public static void main(String[] args) {
        // Kamus Lokal
        garis g1 = new garis(new Titik(3, 4), new Titik(5, 6));
        garis g2 = new garis(new Titik(0, 0), new Titik(2, 2));
        garis g3 = new garis(new Titik(0, 0), new Titik(2, -2));

        // Algoritma
        System.out.println("Titik Awal g1 : " + g1.getAwal().getAbsis() + ", " + g1.getAwal().getOrdinat() + "");
        System.out.println("Titik Akhir g1 : " + g1.getAkhir().getAbsis() + ", " + g1.getAkhir().getOrdinat() + "");
        System.out.println("Counter Garis : " + garis.getCounterGaris());
        g1.setAwal(new Titik(1, 2));
        g1.setAkhir(new Titik(6, 7));

        System.out.println("Titik Awal Baru  : " + g1.getAwal().getAbsis() + ", " + g1.getAwal().getOrdinat() + "");
        System.out.println("Titik Akhir Baru : " + g1.getAkhir().getAbsis() + ", " + g1.getAkhir().getOrdinat() + "");

        System.out.println("\nPanjang g1 : " + g1.getPanjang());
        System.out.println("Gradien g1 : " + g1.getGradien());

        Titik tengah = g1.getTitikTengah();
        System.out.println("Titik Tengah g1 : " + tengah.getAbsis() + ", " + tengah.getOrdinat() + "");

        System.out.println("Persamaan g1 : " + g1.getPersamaanGaris());

        System.out.println("\nSejajar dengan g2? : " + g1.isSejajar(g2));
        System.out.println("Tegak lurus dengan g2? : " + g1.isTegakLurus(g2));
        System.out.println("Sejajar dengan g3? : " + g1.isSejajar(g3));
        System.out.println("Tegak lurus dengan g3? : " + g1.isTegakLurus(g3));

        System.out.println("Cetak garis g1 : ");
        g1.printGaris();

    }
}
