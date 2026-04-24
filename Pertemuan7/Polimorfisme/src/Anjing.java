public class Anjing extends Anabul{
    // Konstruktor
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    void suara() {
        System.out.println(getNama() + " berbunyi guk guk");
    }
}
