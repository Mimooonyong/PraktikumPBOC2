/*  Nama File   : Civitasakademika.Java 
 *  Deskripsi   : berisi method dalam class Civitasakademika
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

class Civitasakademika {
    // ATRIBUT
    private String Nama, Prodi;

    // METHOD
    // Konstruktor
    Civitasakademika(String Nama, String Prodi){
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // Getter
    // Mengambil nama penduduk Civitasakademika
    String getNama(){
        return Nama;
    }

    // Mengambil prodi penduduk Civitasakademika
    String getProdi(){
        return Prodi;
    }

    // Mengambil nomor penduduk Civitasakademika
    String getNomor(){
        return "";
    }
}