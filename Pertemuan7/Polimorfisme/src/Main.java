public class Main {
    public static void main(String[] args) {
        // Konstruktor Polimorfisme
        Anabul kucing = new Kucing("Mimo");
        Anabul anjing = new Anjing("Bleki");
        Anabul burung = new Burung("Fletchling");

        //PrintInfo semua
        kucing.PrintInfo();
        anjing.PrintInfo();
        burung.PrintInfo();
    }
}