package bangunDimensi.persegiPanjang;

import bangunDimensi.BangunDimensi;

public class PersegiPanjang extends BangunDimensi {
    private int panjang, lebar;

    public PersegiPanjang() {

    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungLuas() {
        super.luas = panjang * lebar;
        return super.luas;
    }

    public double hitungKel() {
        return 0;
    }

    public double hitungKeliling() {
        super.kel = 2 * (panjang * lebar);
        return super.kel;
    }
    public int getPanjang() {
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
}