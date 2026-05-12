/*  Nama File   : Teman.Java 
 *  Deskripsi   : berisi method dalam class Teman
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 07/05/2026
 */

import java.util.ArrayList;

public class Teman {
    // ATRIBUT
    private int nbelm;
    private ArrayList<String> Lnama;

    // METHOD
    // Konstruktor
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // Getter
    // a. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama(Indeks)
    public String getNama(int Indeks) {
        return Lnama.get(Indeks);
    }

    // c. setNama(Indeks, Nama)
    public void setNama(int Indeks, String Nama) {
        Lnama.set(Indeks, Nama);
    }

    // d. addNama(Nama)
    public void addNama(String Nama){
        Lnama.add(Nama);
        nbelm++;
    }

    // e. delNama(Nama)
    public void delNama(String Nama){
        if (Lnama.remove(Nama)){
            nbelm--;
        }
    }

    // f. isMember(Nama)
    public boolean isMember(String Nama){
        return Lnama.contains(Nama);
    }

    // g. gantiNama(Nama, NamaBaru)
    public void gantiNama(String Nama, String NamaBaru){
        int i = Lnama.indexOf(Nama);

        if (i != 1){
            Lnama.set(i, NamaBaru);
        }
    }

    // h. countNama(Nama)
    public int countNama(String Nama){
        int i, count = 0;
        for (i = 0; i < getNbelm(); i++){
            // ga tau selain equals gmn T-T
            if (getNama(i).equals(Nama)){
                count++;
            }
        }

        return count;
    }

    // i. showTeman()
    public void showTeman(){
        int i;
        System.out.println("\nList :");
        for (i = 0; i < getNbelm(); i++){
            System.out.println((i + 1) + ". " + getNama(i));
        }
    }
}
