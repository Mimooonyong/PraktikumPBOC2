/*  Nama File   : Kendaraan.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Kendaraan
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/5/2026
 */

public class Kendaraan {
    // Atribut
    private String noPlat, Jenis;

    /* METHOD */
    // Konstruktor
    Kendaraan(){
        this.noPlat = "";
        this.Jenis = "";
    }

    Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    // Getter dan Setter
    String getnoPlat(){
        return noPlat;
    }

    String getJenis(){
        return Jenis;
    }

    void setnoPlat(String x){
        noPlat = x;
    }

    void setJenis(String y){
        Jenis = y;
    }
}
