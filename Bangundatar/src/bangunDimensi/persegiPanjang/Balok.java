package bangunDimensi.persegiPanjang;

public class Balok extends PersegiPanjang {
    private int tinggi;

    public Balok() {

    }

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        super.luas = 2 * (getPanjang() * getLebar() + getPanjang() * tinggi + getLebar() * tinggi);
        return super.luas;
    }

    public double hitungVolume() {
        super.vol = getPanjang() * getLebar() * tinggi;
        return super.vol;
    }

    public void tampil() {
        super.hitungLuas();
        super.hitungKeliling();
        System.out.println("\n2. Persegi Panjang : ");
        System.out.println("  Luas : " + super.luas);
        System.out.println("  Kel : " + super.kel);

        hitungLuas();
        hitungVolume();
        System.out.println("\n Balok  ");
        System.out.println("   Luas : " + super.luas);
        System.out.println("   Vol : " + super.vol);
    }
}