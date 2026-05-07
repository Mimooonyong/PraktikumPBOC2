/*  Nama File   : Piaraan.Java 
 *  Deskripsi   : berisi method dalam class Piaraan
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 07/05/2026
 */

import java.util.LinkedList;

public class Piaraan {
    // ATRIBUT
    private int nbelm;
    private final LinkedList<Anabul> Lanabul;

    // METHOD
    // Konstruktor
    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // b.i
    public int getNbelm() {
        return nbelm;
    }

    // b.ii 
    public void enqueueAnabul(Anabul anabul){
        Lanabul.addLast(anabul);
        nbelm++;
    }

    // b.iii
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    // b.iv
    public Anabul getAnabul(){
        return Lanabul.peekFirst();
    }

    public void getAnabul2(){
        System.out.println("Nama = " + Lanabul.peekFirst().getNama());
    }

    // b.v
    public Anabul dequeueAnabul(){
        Anabul removed = Lanabul.pollFirst();
        nbelm--;
        return removed;
    }

    // c
    public void showAnabul(){
        int i;
        System.out.println("\nList nama peliharaan : ");
        for (i = 0; i < nbelm; i++){
            System.out.println((i + 1) + ". " + Lanabul.get(i).getNama());
        }
    }

    // d
    public int countKucing(){
        int i, count = 0;
        for (i = 0; i < nbelm; i++){
            if (Lanabul.get(i) instanceof Kucing){
                count++;
            }
        }

        return count;
    }

    // e
    public double bobotKucing(){
        double bobot = 0;
        int i;

        for (i = 0; i < nbelm; i++){
            if (Lanabul.get(i) instanceof Kucing){
                bobot += ((Kucing) Lanabul).getBobot();
            }
        }

    }
}
