/*  Nama File   : Persegi.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Persegi
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/12/2026
 */

public class Persegi extends BangunDatar {
    // Kamus Lokal
    private double sisi;

    // Konstruktor
    public Persegi (double Sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = Sisi;
    }

    // Getter
    public double getSisi(){
        return sisi;
    }
    
    // Setter

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // Mengembalikan informasi Persegi implementasi super dan overriding
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + getSisi());
    }
}
