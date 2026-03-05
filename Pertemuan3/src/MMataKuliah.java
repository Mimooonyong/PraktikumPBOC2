/*  Nama File   : MMataKuliah.Java 
 *  Deskripsi   : berisi main dalam class MataKuliah
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/5/2026
 */

public class MMataKuliah {
    public static void main(String[] args) {
        MataKuliah A = new MataKuliah();
        MataKuliah B = new MataKuliah("01", "Elektrik", 3);

        System.out.println("idMatKul B = " + B.getidMatKul());
        System.out.println("Nama B = " + B.getNama());
        System.out.println("sks B = " + B.getsks());

        A.setidMatkul("00");
        A.setNama("PBO");
        A.setsks(4);

        System.out.println("idMatKul A = " + A.getidMatKul());
        System.out.println("Nama A = " + A.getNama());
        System.out.println("sks A = " + A.getsks());
    }
}
