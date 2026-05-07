/*  Nama File   : Data.Java 
 *  Deskripsi   : berisi method dalam class Data
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 07/05/2026
 */

import java.util.ArrayList;

public class Data<T> {
    // ATRIBUT
    private ArrayList<T> ruang;
    private int banyak;

    // METHOD
    // Konstruktor
    public Data(){
        ruang = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            ruang.add(null);
        }

        banyak = 0;
    }

    // Mengisi elemen pada posisi ruang yang tepat
    void setIsi(int posisi, T isi){

        if (posisi >= 1 && posisi <= 100){

            if (ruang.get(posisi - 1) == null) {
                banyak++;
            }

            ruang.set(posisi - 1, isi);
        }
    }

    // Mengembalikan nilai elemen generik pada posisi sesuai parameter
    public T getIsi(int posisi){

        if (posisi >= 1 && posisi <= 100){
            return ruang.get(posisi - 1);
        }

        return null;
    }

    // Mengembalikan banyak elemen
    public int getSize(){
        return banyak;
    }
}