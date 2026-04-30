/*  Nama File   : Seminar.Java 
 *  Deskripsi   : berisi method dalam class Seminar
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */

class Seminar {
    // ATRIBUT
    private Civitasakademika[] peserta;
    private int banyakPeserta, total;

    //METHOD
    // Konstruktor
    Seminar(){
        peserta = new Civitasakademika[100];
        banyakPeserta = 0;
    }

    // Mengambil data banyaknya peserta seminar
    int countPeserta(){
        return banyakPeserta;
    }

    // Menambahkan Dosen atau Mahasiswa ke dalam daftar Seminar
    void registrasi(Civitasakademika A){
        if (banyakPeserta < 100) {
            peserta[banyakPeserta] = A;
            banyakPeserta++;
        } 
        else{
            System.out.println("Kuota Seminar Habis");
        }
    }

    // Menampilkan detail peserta
    void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++){
            System.out.println("Peserta urutan ke   : " + i);

            if (peserta[i] instanceof Mahasiswa){
                System.out.println("Status              : Mahasiswa");
            } 
            else if (peserta[i] instanceof Dosen){
                System.out.println("Status              : Dosen");
            }

            System.out.println("Nama                : " + peserta[i].getNama());
            System.out.println("Nomor               : " + peserta[i].getNomor());
            System.out.println("Prodi               : " + peserta[i].getProdi());
            System.out.println("\n");
        }
    }

    // Menghitung jumlah Mahasiswa di dalam Seminar
    int countMahasiswa() {
        total = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                total++;
            }
        }
        return total;
    }

    // Menghitung jumlah Dosen di dalam Seminar
    int countDosen() {
        total = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Dosen) {
                total++;
            }
        }
        return total;
    }
}