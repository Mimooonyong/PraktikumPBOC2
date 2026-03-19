/*  Nama File   : Bulan.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Bulan
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/19/2026
 */

package Latihan;
import java.util.ArrayList;

public class Bulan {
    // Kamus Lokal
    private int Urutan, JumlahHari;
    private String Nama;
    // Note tambahan : dibuat static agar semua class dapat mengakses secara tetap (?)
    // Jangan lupa belajar lagi static (untuk diriku di masa depan wkwk)
    private static ArrayList<Bulan> kalender = new ArrayList<>();

    // Konstruktor
    public Bulan(int Urutan, String Nama, int JumlahHari) {
        this.Urutan = Urutan;
        this.Nama = Nama;
        this.JumlahHari = JumlahHari;
    }

    // Getter
    public int getNomor(){ 
        return Urutan; 
    }
    public String getNama(){ 
        return Nama; 
    }
    public int getJumlahHari(){
        return JumlahHari; 
    }

    // Membuat Kalender
    public static void makeKalender() {
        kalender.add(new Bulan(1, "Januari", 31));
        kalender.add(new Bulan(2, "Februari", 28));
        kalender.add(new Bulan(3, "Maret", 31));
        kalender.add(new Bulan(4, "April", 30));
        kalender.add(new Bulan(5, "Mei", 31));
        kalender.add(new Bulan(6, "Juni", 30));
        kalender.add(new Bulan(7, "Juli", 31));
        kalender.add(new Bulan(8, "Agustus", 31));
        kalender.add(new Bulan(9, "September", 30));
        kalender.add(new Bulan(10, "Oktober", 31));
        kalender.add(new Bulan(11, "November", 30));
        kalender.add(new Bulan(12, "Desember", 31));
    }


    // Getter Kalender
    public static String getNamaBulan(int nomor) {
        if (nomor < 1 || nomor > 12){
            return "Bulan hanya dari 1 sampai 12";
        }

        return kalender.get(nomor - 1).getNama();
    }

    public static int getJumlahHari(int nomor, int tahun) {
        if (nomor < 1 || nomor > 12){
            return -1;
        }

        if (nomor == 2 && Tanggal.isKabisat(tahun)) {
            return 29;
        }

        return kalender.get(nomor - 1).getJumlahHari();
    }
}