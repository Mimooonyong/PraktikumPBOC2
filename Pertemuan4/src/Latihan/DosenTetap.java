/*  Nama File   : DosenTetap.Java 
 *  Deskripsi   : berisi atribut dan method dalam class DosenTetap
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/19/2026
 */

package Latihan;

class DosenTetap extends Dosen {
    // Kamus Lokal
    private String NIDN;
    private int MKT;

    // Konstruktor

    public DosenTetap(String NIP, String Nama, Tanggal TanggalLahir, 
                      Tanggal TMT, int GajiPokok, String Fakultas, String NIDN){
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan(Tanggal Sekarang) {
        MKT = hitungMKT(Sekarang);
        return 0.02 * MKT * GajiPokok;
    }

    // Deskripsi
    public void printInfo(Tanggal Sekarang) {
        System.out.println("NIP                 : " + NIP);
        System.out.println("NIDN                : " + NIDN);
        System.out.println("Nama                : " + Nama);
        System.out.println("Tanggal Lahir       : " + printTanggal(TanggalLahir));
        System.out.println("TMT                 : " + printTanggal(TMT));
        System.out.println("Jabatan             : " + "Dosen Tetap");
        System.out.println("Fakultas            : " + Fakultas);
        System.out.println("Masa Kerja          : " + MasaKerja(Sekarang));
        System.out.println("Tanggal Pensiun     : " + hitungPensiun(65));
        System.out.println("Gaji Pokok          : " + GajiPokok);
        System.out.println("Tunjangan           : " + hitungTunjangan(Sekarang));
    }
}
