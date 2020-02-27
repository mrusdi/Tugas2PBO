package bangunDimensi.persegi;

public class Kubus extends Persegi {
    public Kubus() {

    }

    public Kubus(int panjang) {
        super(panjang);
    }

    public double hitungVolume() {
        super.vol = getPanjang() * getPanjang() * getPanjang();
        return super.vol;
    }
    public double hitungLuas() {
        super.luas = 6 * (getPanjang() * getPanjang());
        return super.luas;
    }

    public void tampil() {
        super.hitungLuas();
        super.hitungKel();
        System.out.println("\n1. Persegi : ");
        System.out.println("  Luas : " + super.luas);
        System.out.println("  Kel : " + super.kel);

        hitungLuas();
        hitungVolume();
        System.out.println("\n    Kubus : ");
        System.out.println("  Luas : " + super.luas);
        System.out.println("   Volume : " + super.vol);
    }
}