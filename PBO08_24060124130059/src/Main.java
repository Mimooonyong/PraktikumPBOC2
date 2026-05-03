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
        // 3b Tukar Anabul
        System.out.println("== Prosedur Tukar ==");
        Datum<Anabul> hewan1 = new Datum<Anabul>(new Kucing("Pookie", 4.8));
        Datum<Anabul> hewan2 = new Datum<Anabul>(new Anjing("Maq"));

        OperatorGenerik.Tukar(hewan1, hewan2);
        hewan1.TampilkanAnabul(hewan1.getIsi());
        hewan2.TampilkanAnabul(hewan2.getIsi());

        // 3b Tukar Integer
        Datum<Integer> x = new Datum<>(10);
        Datum<Integer> y = new Datum<>(20);

        OperatorGenerik.Tukar(x, y);
        System.out.println("\nInteger hasil tukar :");
        System.out.println("Isi x : " + x.getIsi());
        System.out.println("Isi y : " + y.getIsi());

        // 3b Tukar String
        Datum<String> s1 = new Datum<>("Rawr");
        Datum<String> s2 = new Datum<>("Ngga~");

        OperatorGenerik.Tukar(s1, s2);
        System.out.println("\nString hasil tukar :");
        System.out.println("Isi s1 : " + s1.getIsi());
        System.out.println("Isi s2 : " + s2.getIsi()); 

        // 3c Mengeluarkan Dua BErat Kucing
        Datum<Kucing> D = new Datum<>(new Anggora("David", 3.5));
        Datum<Kucing> L = new Datum<>(new KembangTelon("Lucy", 4.0));

        double total = OperatorGenerik.Bobot2(D, L);
        System.out.println("\nTotal Bobot Kucing = " + total);
    }
}
