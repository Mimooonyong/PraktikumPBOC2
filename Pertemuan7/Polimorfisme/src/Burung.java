public class Burung extends Anabul{
    // Konstruktor
    Burung(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    void suara() {
        System.out.println(getNama() + " berbunyi cuit cuit");
    }
}
