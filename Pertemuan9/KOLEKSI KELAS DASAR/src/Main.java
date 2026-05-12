/*  Nama File   : Main.Java 
 *  Deskripsi   : berisi main dalam class Teman
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 07/05/2026
 */

public class Main {
    public static void main(String[] args) {
        // KONSTRUKTOR 
        Teman Kampus = new Teman();

        // METHOD
        // a. getNbelm()
        System.out.println("Isi list Teman Kampus = " + Kampus.getNbelm());

        // d. addNama(Nama)
        Kampus.addNama("Rota");
        Kampus.addNama("Rota");

        // c. setNama(Indeks, Nama)
        Kampus.setNama(0, "Orcu");

        // b. getNama(Indeks)
        Kampus.getNama(0);

        // e. delNama(Nama)
        Kampus.delNama("Orcu");

        // f. isMember(Nama)
        System.out.println("\nApakah Rota adalah member dari list Teman Kampus? " + Kampus.isMember("Rota"));

        // g. gantiNama(Nama, NamaBaru)
        Kampus.gantiNama("Rota", "Frea");

        // h. countNama(Nama)
        System.out.println("\nBerapa nama Frea dalam list Teman Kampus? " + Kampus.countNama("Frea"));

        // i. showTeman(Teman)
        Kampus.showTeman();

    }
    
}
