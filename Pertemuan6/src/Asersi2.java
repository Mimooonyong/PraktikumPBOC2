/* Nama : Dian Aulya Dewiyani
 * NIM : 24060124130059
 * File : Asersi2.java
 * Deskripsi : Program untuk menunjukkan asersi 2
 * Tanggal : 3/26/2026
 */

// class Lingkarancd.
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}