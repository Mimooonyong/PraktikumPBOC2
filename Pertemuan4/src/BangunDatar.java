public class BangunDatar {
    // Kamus Lokal
    private int jmlSisi;
    private String warna , border;

    // Konstruktor
    BangunDatar(){
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
    }

    // Getter
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    // Setter
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    // Mengembalikan informasi BangunDatar
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}
