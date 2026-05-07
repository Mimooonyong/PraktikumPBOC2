/*  Nama File   : Kucing.Java 
 *  Deskripsi   : berisi method dalam class Kucing
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 23/4/2026
 */

public class Kucing extends Anabul {
    // ATRIBUT
    double bobot;

    // METHOD
    // Konstruktor
    Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // Getter
    @Override
    String getNama() {
        return super.getNama();
    }

    double getBobot() {
        return bobot;
    }

    // Setter
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
    @Override
    void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    void suara() {
        System.out.println(getNama() + " berbunyi meong");
    }
}
