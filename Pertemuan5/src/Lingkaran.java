public class Lingkaran extends BangunDatar implements IResize {
    // Kamus Lokal
    private double jari;

    // Konstruktor
    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double r, String warna, String border){
        super(0, warna, border);
        this.jari = r;
    }
    
    // Getter
    public double getJari(){
        return jari;
    }

    // Setter
    public void setJari(double r){
        this.jari = r;
    }

    // Mengembalikan informasi Lingkaran implementasi super dan overriding
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }

        // Method Abstract
    @Override
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

        // Method Interface

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}
