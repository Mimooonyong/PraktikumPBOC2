/*  Nama File   : Lingkaran.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Lingkaran
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/12/2026
 */

public class Lingkaran extends BangunDatar {
    // Kamus Lokal
    private double jari;

    // Konstruktor
    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double r, String warna, String border){
        super(0, warna, border);
        this.jari = r;
    }
    
    // Getter
    public double getJari(){
        return jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

    // Setter
    public void setJari(double r){
        this.jari = r;
    }

    // Mengembalikan informasi Lingkaran implementasi super dan overriding
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}
