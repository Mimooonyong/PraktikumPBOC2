/*  Nama File   : Main.Java 
 *  Deskripsi   : berisi Main
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

public class Main {
    public static void main(String[] args){
        // KELAS GENERIK
        Datum<Anabul> data = new Datum<>(new Kucing("Mimo", 7.7));
        Datum<Anabul> data2 = new Datum<>(new Anjing("Bleki"));

        data.TampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Mimo Junior", 7.6));
        data.TampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new KembangTelon("Cunil", 6.5));
        data.TampilkanAnabul(data.getIsi());
        System.out.println();

        data2.TampilkanAnabul(data2.getIsi());

        // METHOD GENERIK
        System.out.println("== Prosedur Tukar ==");
        Datum<Anabul> hewan1 = new Datum<Anabul>(new Kucing("Pookie", 4.8));
        Datum<Anabul> hewan2 = new Datum<Anabul>(new Anjing("Maq"));

        OperatorGenerik.Tukar(hewan1, hewan2);
        hewan1.TampilkanAnabul(hewan1.getIsi());
        hewan2.TampilkanAnabul(hewan2.getIsi());
    }
}
