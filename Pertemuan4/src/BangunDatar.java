/*  Nama File   : BangunDatar.Java 
 *  Deskripsi   : berisi atribut dan method dalam class BangunDatar
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/12/2026
 */

public class BangunDatar {
    // Kamus Lokal
    private int jmlSisi;
    private String warna , border;
    private static int counterBangunDatar = 0;

    // Konstruktor
    public BangunDatar(){
        counterBangunDatar++;
    }
    // Note : kalau ditambahkan final, nanti Persegi atau Lingkaran ga bisa mengextends BangunDatar. Method juga berlaku sama
    
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Getter
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    // Setter
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    // Mengembalikan informasi BangunDatar
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // Mengembalikan counter
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }
    // Note : static tidak bisa dioverriding, method hiding
}
