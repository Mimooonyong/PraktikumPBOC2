public class Mtitik {
    public static void main(String[] args){
        Titik T1 = new Titik(3, 4);
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = new Titik(5, 8);
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("Kuadran titik berada di = " + T1.getKuadran());
        System.out.println("Jarak Pusat = " + T1.getJarakPusat(T1));
        System.out.println("Jarak = " + T1.getJarak(T1, T2));

        T2.printTitik();
        T2.RefleksiX();
        T2.printTitik();
        T2.RefleksiY();
        T2.printTitik();
    }

}
