/*  Nama File   : Dosen.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Dosen
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/5/2026
 */

public class Dosen {
    // Atribut
    private String NIP, Nama, Prodi;

    /* METHOD */
    // Konstruktor
    Dosen(){
        this.NIP = "";
        this.Nama = "";
        this.Prodi = "";
    }

    Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // Getter dan Setter
    String getNIP(){
        return NIP;
    }

    String getNama(){
        return Nama;
    }

    String getProdi(){
        return Prodi;
    }

    void setNIP(String x){
        NIP = x;
    }

    void setNama(String y){
        Nama = y;
    }

    void setProdi(String z){
        Prodi = z;
    }
}
