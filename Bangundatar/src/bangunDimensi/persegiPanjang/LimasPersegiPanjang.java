package bangunDimensi.persegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {
    private int tinggi;
    private double luasAlas, luasSisi;

    public LimasPersegiPanjang() {

    }

    public LimasPersegiPanjang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    public void hitungLuasSisi() {
        luasSisi = (2 * ((getPanjang() * tinggi) / 2)) + (2 * ((getLebar() * tinggi) / 2));
    }

    public void hitungLuasAlas() {
        luasAlas = getPanjang() * getLebar();
    }

    public double hitungVolume() {
        hitungLuasAlas();
        super.vol = (luasAlas * tinggi) / 3;
        return super.vol;
    }
    public double hitungLuas() {
        hitungLuasAlas();
        hitungLuasSisi();
        super.luas = luasAlas + luasSisi;
        return super.luas;
    }
    public void tampil() {
        super.hitungLuas();
        hitungLuas();
        hitungVolume();
        System.out.println("\n   Limas Persegi Panjang :");
        System.out.println("  Luas : " + super.luas);
        System.out.println("  Vol : " + super.vol);
    }
}