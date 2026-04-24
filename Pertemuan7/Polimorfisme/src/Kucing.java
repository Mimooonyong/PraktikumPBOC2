public class Kucing extends Anabul {
    // METHOD
    // Konstruktor
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    void suara() {
        System.out.println(getNama() + " berbunyi meong");
    }
}
