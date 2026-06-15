/*  Nama File   : Main.Java 
 *  Deskripsi   : berisi main dalam class Anabul
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Main {
    public static void main(String[] args) {
        // Konstruktor Polimorfisme
        Anabul Telolet = new Kucing("Mimo");
        Anabul anjing = new Anjing("Bleki");
        Anabul burung = new Burung("Fletchling");

        //PrintInfo semua
        Telolet.PrintInfo();
        anjing.PrintInfo();
        burung.PrintInfo();
    }
}