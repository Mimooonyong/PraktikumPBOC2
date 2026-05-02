/*  Nama File   : Anggora.Java 
 *  Deskripsi   : berisi method dalam class Anggora
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

public class Anggora extends Kucing {
    //METHOD
    // Konstruktor
    public Anggora(String Nama, double bobot){
        super(Nama, bobot);
    }

    // Menampilkkan bagaimana kucing anggora bergerak
    @Override
    void gerak() {
        System.out.println(getNama() + " lincah melompat");
    }

    // Menampilkkan bagaimana kucing anggora bersuara
    @Override
    void suara(){
        System.out.println(getNama() + " bersuara Meong lembut");
    }
}
