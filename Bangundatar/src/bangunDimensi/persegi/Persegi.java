package bangunDimensi.persegi;

import bangunDimensi.BangunDimensi;

public class Persegi extends BangunDimensi {
    private int panjang;

    public Persegi() {

    }
    public Persegi(int panjang) {
        this.panjang = panjang;
    }
    public double hitungLuas() {
        super.luas = panjang * panjang;
        return super.luas;
    }
    public double hitungKel() {
        super.kel = 4 * panjang;
        return super.kel;
    }
    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
}