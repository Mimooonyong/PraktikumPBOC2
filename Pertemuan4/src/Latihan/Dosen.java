/*  Nama File   : Dosen.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Dosen
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/19/2026
 */

package Latihan;

abstract class Dosen extends Pegawai {
    // Kamus Lokal
    protected String Fakultas;

    // Konstruktor
    public Dosen(String NIP, String Nama, Tanggal TanggalLahir, 
                 Tanggal TMT, int GajiPokok, String fakultas){
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.Fakultas = fakultas;
    }

    // Tanggal
    public void PrintTanggal(Tanggal T){
        System.out.println(T.getHari() + " " + Bulan.getNamaBulan(T.getBulan()) + " " + T.getTahun());
    }
}
