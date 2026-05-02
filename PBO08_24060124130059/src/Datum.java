/*  Nama File   : Datum.Java 
 *  Deskripsi   : berisi method dalam class Datum
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 30/4/2026
 */
public class Datum<T> {
    // ATRIBUT
    private T isi;

    // METHOD
    // Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }

    // Getter
    public T getIsi() {
        return isi;
    }

    // Setter
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    public void TampilkanAnabul(Anabul anabul) {
        anabul.gerak();
        anabul.suara();
        if (anabul instanceof Kucing){
            System.out.println("Bobot: " + ((Kucing) anabul).getBobot());
        }
    }
}
