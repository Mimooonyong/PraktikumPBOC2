/*  Nama File   : garis.Java 
 *  Deskripsi   : berisi atribut dan method dalam class garis
 *  Pembuat     : Dian Aulya Dewiyani
 *  Tanggal     : 3/5/2026
 */

public class garis {
    /****Atribut****/
    Titik A, B, awal, akhir;
    static int CounterGaris = 0;
    double x1, x2, y1, y2, dx, dy, dx1, dx2, dy1, dy2;
    double xTengah, yTengah, m, c;

    /****Method****/
    public garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        CounterGaris++;
    }
    
    public garis() {
        this.awal = new Titik(0, 0);
        this.akhir = new Titik(1, 1);
        CounterGaris++;
    }

    public Titik getAwal() {
        return awal;
    }

    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    public Titik getAkhir() {
        return akhir;
    }

    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    public static int getCounterGaris() {
        return CounterGaris;
    }

    // Panjang Garis
    public double getPanjang() {
        dx = akhir.getAbsis() - awal.getAbsis();
        dy = akhir.getOrdinat() - awal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Gradien
    public double getGradien() {
        dx = akhir.getAbsis() - awal.getAbsis();
        dy = akhir.getOrdinat() - awal.getOrdinat();

        if (dx == 0) {
            return -1; // Tidak terdefinisi
        }

        return dy / dx;
    }

    // Titik Tengah
    public Titik getTitikTengah() {
        xTengah = (awal.getAbsis() + akhir.getAbsis()) / 2;
        yTengah = (awal.getOrdinat() + akhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // Sejajar
    public boolean isSejajar(garis g) {
        dx1 = akhir.getAbsis() - awal.getAbsis();
        dy1 = akhir.getOrdinat() - awal.getOrdinat();

        dx2 = g.akhir.getAbsis() - g.awal.getAbsis();
        dy2 = g.akhir.getOrdinat() - g.awal.getOrdinat();

        return dx1 * dy2 == dy1 * dx2;
    }

    // Tegak Lurus
    public boolean isTegakLurus(garis g) {
        dx1 = akhir.getAbsis() - awal.getAbsis();
        dy1 = akhir.getOrdinat() - awal.getOrdinat();

        dx2 = g.akhir.getAbsis() - g.awal.getAbsis();
        dy2 = g.akhir.getOrdinat() - g.awal.getOrdinat();

        return dx1 * dx2 + dy1 * dy2 == 0;
    }

    // Print Garis
    public void printGaris() {
        System.out.println("Titik Awal: (" + awal.getAbsis() + ", " + awal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + akhir.getAbsis() + ", " + akhir.getOrdinat() + ")");
    }

    // Persamaan Garis
    public String getPersamaanGaris() {
        x1 = awal.getAbsis();
        y1 = awal.getOrdinat();
        x2 = akhir.getAbsis();
        y2 = akhir.getOrdinat();

        if (x1 == x2) {
          return "x = " + x1; 
        }

        m = (y2 - y1) / (x2 - x1);
        c = y1 - (m * x1);

        if (c >= 0) {
            return "y = " + m + "x + " + c;
        } else {
            return "y = " + m + "x - " + Math.abs(c);
        }
    }
}
