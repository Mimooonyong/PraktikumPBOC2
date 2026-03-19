package Latihan;

/*  Nama File   : Pegawai.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Pegawai
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/19/2026
 */

public class Pegawai {
    // Kamus Lokal
    // Note tambahan : Protected karena ini di dalam package latihan
    protected String Nama, NIP;
    protected Tanggal TanggalLahir, TMT;
    protected int GajiPokok, thn, bln;

    // Konstruktor
    public Pegawai(String NIP, String Nama, Tanggal TanggalLahir, Tanggal TMT, int GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    // Getter
    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public Tanggal getTanggalLahir(){
        return TanggalLahir;
    }

    public Tanggal getTMT(){
        return TMT;
    }

    public int getGajiPokok(){
        return GajiPokok;
    }

    // Setter
    void setNIP(String NIP){
        this.NIP = NIP;
    }

    void setNama(String Nama){
        this.Nama = Nama;
    }

    void setTanggalLahir(Tanggal TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }
    
    void setTMT(Tanggal TMT){
        this.TMT = TMT;
    }

    void setGajiPokok(int GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    // Masa Kerja Deskripsi
    public String MasaKerja(Tanggal Sekarang){
        if (Sekarang.getBulan() < TMT.getBulan()){
            bln = (12 - TMT.getBulan() + Sekarang.getBulan());
            thn = (Sekarang.getTahun() -  TMT.getTahun() - 1);

            return thn + " Tahun " + bln + " Bulan ";
        }
        else{
            bln = (Sekarang.getBulan() - TMT.getBulan());
            thn = (Sekarang.getTahun() -  TMT.getTahun());

            return thn + " Tahun " + bln + " Bulan ";
        }
    }
    // Masa Kerja Tahun
    public int hitungMKT(Tanggal Sekarang){
        thn = Sekarang.getTahun() - TMT.getTahun();
        bln = Sekarang.getBulan() - TMT.getBulan();

        if (bln < 0){
            thn = thn - 1; 
        }

    return thn;
}
    // Tanggal Pensiun
    public String hitungPensiun(int BUP){
        thn = TanggalLahir.getTahun() + BUP;
        bln = TanggalLahir.getBulan() + 1;

        if (bln > 12){
            bln = 1;
            thn = thn + 1;
        }

        return "1 " + Bulan.getNamaBulan(bln) + " " + thn;
    }

    // Print Tanggal
    public String printTanggal(Tanggal t){
        return t.getHari() + " " + Bulan.getNamaBulan(t.getBulan()) + " " + t.getTahun();
}
}
