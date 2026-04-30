/*  Nama File   : Dosen.Java 
 *  Deskripsi   : berisi method dalam class Dosen
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

class Dosen extends Civitasakademika {
    // ATRIBUT
    private String NIP;

    // METHOD
    // Konstruktor
    Dosen(String Nama, String NIP, String Prodi){
        super(Nama, Prodi);
        this.NIP = NIP;
    }

    // Getter
    // Mengambil NIP dari Dosen
    @Override
    String getNomor(){
        return NIP;
    }
}