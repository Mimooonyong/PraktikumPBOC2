/*  Nama File   : KembangTelon.Java 
 *  Deskripsi   : berisi method dalam class KembangTelon
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

public class KembangTelon extends Kucing {
    //METHOD
    // Konstruktor
    public KembangTelon(String Nama, double bobot){
        super(Nama, bobot);
    }

    // Menampilkkan bagaimana kucing Kembang Telon bergerak
    @Override
    void gerak() {
        System.out.println(getNama() + " lincah melompat");
    }

    // Menampilkkan bagaimana kucing Kembang Telon bersuara
    @Override
    void suara(){
        System.out.println(getNama() + " bersuara Meong lembut");
    }
}
