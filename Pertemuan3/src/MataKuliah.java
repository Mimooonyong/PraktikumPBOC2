/*  Nama File   : Dosen.Java 
 *  Deskripsi   : berisi atribut dan method dalam class MataKuliah
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/5/2026
 */

public class MataKuliah {
    // Atribut
    private String idMatKul, Nama;
    private Integer sks;

    /* METHOD */
    // Konstruktor
    MataKuliah(){
        this.idMatKul = "";
        this.Nama = "";
        this.sks = 0;
    }

    MataKuliah(String idMatKul, String Nama, Integer sks){
        this.idMatKul = idMatKul;
        this.Nama = Nama;
        this.sks = sks;
    }

    // Getter dan Setter
    String getidMatKul(){
        return idMatKul;
    }

    String getNama(){
        return Nama;
    }

    Integer getsks(){
        return sks;
    }

    void setidMatkul(String x){
        idMatKul = x;
    }

    void setNama(String y){
        Nama = y;
    }
    
    void setsks(Integer z){
        sks = z;
    }
}
