/*  Nama File   : Tanggal.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Tanggal
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/19/2026
 */

package Latihan;

public class Tanggal {
    // Kamus Lokal
    private int Hari;
    private int Bln;
    private int Tahun;

    // Konstruktor
    public Tanggal(int Hari, int Bulan, int Tahun) {
        this.Hari = Hari;
        this.Bln = Bulan;
        this.Tahun = Tahun;
    }

    // Getter
    public int getHari(){
        return Hari; 
    }

    public int getBulan(){
        return Bln; 
    }

    public int getTahun(){
        return Tahun; 
    }

    // Cek Tahun Kabisat
    public static boolean isKabisat(int Tahun) {
        return (Tahun % 4 == 0 && Tahun % 100 != 0) || (Tahun % 400 == 0);
    }

    // Selisih Tahun
    public int selisihTahun(Tanggal t2) {
        return Math.abs(this.Tahun - t2.Tahun);
    }
}