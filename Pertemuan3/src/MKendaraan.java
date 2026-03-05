public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan A = new Kendaraan();
        Kendaraan B = new Kendaraan("B1234NJY", "Motor");

        System.out.println("noPlat Kendaraan B = " + B.getnoPlat());
        System.out.println("Jenis Kendaraan B = " + B.getJenis());

        A.setnoPlat("R2345P");
        A.setJenis("Mobil");

        System.out.println("noPlat Kendaraan A = " + A.getnoPlat());
        System.out.println("Jenis Kendaraan A = " + A.getJenis());
    }
}
