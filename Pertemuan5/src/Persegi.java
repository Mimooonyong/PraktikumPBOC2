public class Persegi extends BangunDatar implements IResize {
    // Kamus Lokal
    private double sisi;

    // Konstruktor
    public Persegi (double Sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = Sisi;
    }

    // Getter
    public double getSisi(){
        return sisi;
    }
    
    // Setter

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // Mengembalikan informasi Persegi implementasi super dan overriding
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + getSisi());
    }

    // Method Abstract
    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    // Method Interface

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}
