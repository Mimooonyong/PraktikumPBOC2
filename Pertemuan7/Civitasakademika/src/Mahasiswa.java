/*  Nama File   : Mahasiswa.Java 
 *  Deskripsi   : berisi method dalam class Mahasiswa
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

class Mahasiswa extends Civitasakademika {
    // ATRIBUT
    private String NIM;
    private Dosen DosenWali;

    // METHOD
    // Konstruktor 
    Mahasiswa(String Nama, String NIM, String Prodi, Dosen DosenWali){
        super(Nama, Prodi);
        this.NIM = NIM;
        this.DosenWali = DosenWali;
    }

    // Getter
    // Mengambil NIM dari Mahasiswa
    @Override
    String getNomor(){
        return NIM;
    }

    // Mengambil namma DosenWali dari Mahasiswa
    Dosen getDosenWali(){
        return DosenWali;
    }

    //Setter
    // Mengubah DosenWali
    void setWali(Dosen d){
        this.DosenWali = d;
    }

    // Menampilkan informasi Mahasiswa
    void tampilDataMahasiswa(){
        System.out.println("Nama        : " + getNama());
        System.out.println("NIM         : " + getNomor());
        System.out.println("Prodi       : " + getProdi());
        System.out.println("Wali        : " + getDosenWali().getNama());
        System.out.println("\n");
    }
}