/*  Nama File   : Tendik.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Tendik
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/19/2026
 */

package Latihan;

class Tendik extends Pegawai {
    // Kamus Lokal
    private String Bidang;
    private int MKT;

    // Konstruktor
    public Tendik(String NIP, String Nama, Tanggal TanggalLahir,
                  Tanggal TMT, int GajiPokok, String Bidang){
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.Bidang = Bidang;
    }

    // Hitung Tunjangan
    public double hitungTunjangan(Tanggal Sekarang){
        MKT = hitungMKT(Sekarang);
        return 0.01 * MKT * GajiPokok;
    }

    // Print Info
    public void printInfo(Tanggal Sekarang){
        System.out.println("NIP                 : " + NIP);
        System.out.println("Nama                : " + Nama);
        System.out.println("Tanggal Lahir       : " + printTanggal(TanggalLahir));
        System.out.println("TMT                 : " + printTanggal(TMT));
        System.out.println("Jabatan             : " +  "Tendik");
        System.out.println("Bidang              : " + Bidang);
        System.out.println("Masa Kerja          : " + MasaKerja(Sekarang));
        System.out.println("Tanggal Pensiun     : " + hitungPensiun(55));
        System.out.println("Gaji Pokok          : " + GajiPokok);
        System.out.println("Tunjangan           : " + hitungTunjangan(Sekarang));
    }
}
