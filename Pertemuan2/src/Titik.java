/*  Nama File   : Titik.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 2/26/2026
 */

public class Titik {
    /****Atribut****/
    double absis;
    double ordinat;
    static int CounterTitik = 0;

    /****Method****/
    // Konstruktor untuk membuat titik (0,0)

    // Titik(){
    //     absis = 0;
    //     ordinat = 0;
    //     CounterTitik++;
    // }

    public Titik(){
        this(0, 0);
    }

    //Overloading
    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        CounterTitik++;
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    // Mengembalikan kuadran dari titik
    int getKuadran(){
        if(absis > 0){
            if(ordinat > 0){
                return 1;
            }
            else{
                return 4;
            }
        }
        else if (absis < 0){
            if(ordinat > 0){
                return 2;
            }
            else{
                return 3;
            }
        }
        else{
            return 0;
        }
    }

    // Mengembalikan jarak titik
    double getJarak(Titik T1, Titik T2){
        return Math.sqrt(Math.pow(T2.absis - T1.absis, 2) + Math.pow(T1.ordinat - T2.ordinat, 2));
    }

    double getJarakPusat(Titik T1){
        return Math.sqrt(Math.pow(T1.absis, 2) + Math.pow(T1.ordinat, 2));
    }

    void RefleksiX(){
        absis = absis * -1;
    }

    void RefleksiY(){
        ordinat = ordinat * -1;
    }

    Titik getRefleksiX(){
        return new Titik(absis * -1, ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(absis, ordinat*-1);
    }
    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // Mengembalikan nilai CounterTitik
    static int getCounterTitik(){
        return CounterTitik;
    }

    // Mengembalikan CounterTitik
    // void printCounterTitik(){
    //     System.out.println(this.CounterTitik);
    // }

}

