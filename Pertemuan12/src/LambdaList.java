/*
 * Nama : Dian Aulya Dewiyani
 * NIM : 24060124130059
 * Lab : C2
 * Tanggal : 6/4/2026
 * File LambdaList.java
 * Deskripsi: Implementasi lambda pada list, yaitu lambda digunakan sebagai parameter pada method.
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Rota");
        mahasiswaList.add("Frea");
        mahasiswaList.add("Orcu");
        mahasiswaList.add("Glacus");
        mahasiswaList.add("Brachi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
    
}
