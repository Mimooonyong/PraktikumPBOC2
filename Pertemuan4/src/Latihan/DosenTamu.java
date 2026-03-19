/*  Nama File   : DosenTamu.Java 
 *  Deskripsi   : berisi atribut dan method dalam class DosenTamu
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/19/2026
 */

package Latihan;

class DosenTamu extends Dosen {
    // Kamus Lokal
    private String NIDK;
    private Tanggal TglAkhirKontrak;
    private int thn, bln, total;

    // Konstruktor
    public DosenTamu(String NIP, String Nama, Tanggal TanggalLahir, 
                     Tanggal TMT, int GajiPokok, String Fakultas, 
                     String NIDK, Tanggal TglAkhirKontrak){
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.TglAkhirKontrak = TglAkhirKontrak;
    }

    // Tunjangan 
    public double hitungTunjangan() {
        return 0.025 * GajiPokok;
    }

    // Hitung Kontrak
    public int hitungSisaKontrak(Tanggal sekarang){
        thn = TglAkhirKontrak.getTahun() - sekarang.getTahun();
        bln = TglAkhirKontrak.getBulan() - sekarang.getBulan();
        total = thn * 12 + bln;

        return total;
    }

    // Deskripsi
    public void printInfo(Tanggal Sekarang) {
        System.out.println("NIP                 : " + NIP);
        System.out.println("NIDK                : " + NIDK);
        System.out.println("Nama                : " + Nama);
        System.out.println("Tanggal Lahir       : " + printTanggal(TanggalLahir));
        System.out.println("TMT                 : " + printTanggal(TMT));
        System.out.println("Jabatan             : " + "Dosen Tamu");
        System.out.println("Fakultas            : " + Fakultas);
        System.out.println("Masa Kerja          : " + MasaKerja(Sekarang));
        System.out.println("Akhir Kontrak       : " + printTanggal(TglAkhirKontrak));
        System.out.println("Sisa Kontrak        : " + hitungSisaKontrak(Sekarang) + " bulan");
        System.out.println("Gaji Pokok          : " + GajiPokok);
        System.out.println("Tunjangan           : " + hitungTunjangan());
    }
}
