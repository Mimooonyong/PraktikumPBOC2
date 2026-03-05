/*  Nama File   : Titik.Java 
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 2/19/2026
 */

public class Titik {
    /****Atribut****/
    double absis;
    double ordinat;

    /****Method****/
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
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

}
