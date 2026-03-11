/*  Nama File   : Mahasiswa.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Mahasiswa
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/5/2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    // Atribut
    private String NIM, Nama, Prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen DosenWali;
    private Kendaraan Kendaraan;

    /* METHOD */
    // Konstruktor
    public Mahasiswa(){
        this.NIM = "";
        this.Nama = "";
        this.Prodi = "";
        this.listMatkul = new ArrayList<>();
        this.DosenWali = new Dosen();
        this.Kendaraan = new Kendaraan();
    }

    public Mahasiswa(String NIM, String Nama, String Prodi, ArrayList<MataKuliah> listMatkul, Dosen DosenWali, Kendaraan Kendaraan){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = listMatkul;
        this.DosenWali = DosenWali;
        this.Kendaraan = Kendaraan;
    }

    // Selektor
    String getNIM(){
        return NIM;
    }

    String getNama(){
        return Nama;
    }

    String getProdi(){
        return Prodi;
    }

    ArrayList<MataKuliah> getMataMuliah(){
        return listMatkul;
    }

    Dosen getDosenWali(){
        return DosenWali;
    }

    Kendaraan getKendaraan(){
        return Kendaraan;
    }

    // Mutator
    void setNIM(String a){
        NIM = a;
    }

    void setNama(String b){
        Nama = b;
    }

    void setProdi(String c){
        Prodi = c;
    }

    void setlistMatkul(ArrayList<MataKuliah> d){
        listMatkul = d;
    }

    void setDosenWali(Dosen e){
        DosenWali = e;
    }

    void setKendaraan(Kendaraan f){
        Kendaraan = f;
    }

    // Menambahkan jumlah mata kuliah ke atribut listMatkul
    public void addMatkul (MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    // Mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public Integer getJumlahSKS(){
        int i, Total;

        Total = 0;
        for(i=0; i<listMatkul.size(); i++){
            Total = Total + (listMatkul.get(i).getsks());
        }

        return Total;
    }

    // Menampilkan nim, nama, dan prodi mahasiswa.
    public void printMhs(){
        System.out.println("\nNIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
    }
    // Menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa.
    public void printDetailMhs(){
        System.out.println("\nNIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
        int i;
        for(i=0; i<listMatkul.size(); i++){
            System.out.println("- " + listMatkul.get(i).getNama());
        }
        System.out.println("Dosen Wali: " + getDosenWali().getNama() + ", " + getDosenWali().getNIP());
        System.out.println("Kendaraan: " + getKendaraan().getnoPlat() + ", " + getKendaraan().getJenis());
    }
}
