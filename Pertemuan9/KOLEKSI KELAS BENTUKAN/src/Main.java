/*  Nama File   : Main.Java 
 *  Deskripsi   : berisi Main dalam class Piaraan
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 07/05/2026
 */

public class Main {
        public static void main(String[] args) {
        // KONSTRUKTOR
        Piaraan Rota = new Piaraan();
        Anabul K9 = new Anjing("Delta");
        Anabul Talon = new Burung("Talonflame");
        Anabul Litten = new Kucing("Litten", 3.5);
        Anabul Sprigatito = new Kucing("Sprigatito", 3.5);
        // METHOD
        // b.i
        System.out.println("Peliharaan Rota = " + Rota.getNbelm());

        // b.ii
        Rota.enqueueAnabul(K9);
        Rota.enqueueAnabul(Talon);
        Rota.enqueueAnabul(Litten);
        Rota.enqueueAnabul(Sprigatito);

        // b.iii
        System.out.println("\nApakah K9 merupakan peliharaan Rota? " + Rota.isMember(K9));

        // b.iv
        System.out.println("\nHewan pertama Rota = " + Rota.getAnabul());
        Rota.getAnabul2();

        // b. v
        System.out.println("\nHewan yang dibebaskan = " + Rota.dequeueAnabul());

        // c
        Rota.showAnabul();

        // d
        System.out.println("\nJumlah kucing yang dimiliki = " + Rota.countKucing());

        // e
        System.out.println("\nJumlah bobot kucing yang dimiliki = " + Rota.bobotKucing());

        // f
        Rota.showJenisAnabul();
    }
    
}
