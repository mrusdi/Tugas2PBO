package bangunDimensi.persegi;

public class LimasPersegi extends Persegi {
    private int tinggi;
    private double luasAlas, luasSisi;

    public LimasPersegi() {

    }

    public LimasPersegi(int panjang, int tinggi) {
        super(panjang);
        this.tinggi = tinggi;
    }

    public void hitgLuasAlas() {
        luasAlas = getPanjang() * getPanjang();
    }

    public void hitungLuasSisi() {
        luasSisi = 4 * ((getPanjang() * tinggi) / 2);
    }

    @Override
    public double hitungLuas() {
        hitgLuasAlas();
        hitungLuasSisi();
        super.luas = luasAlas + luasSisi;
        return super.luas;
    }

    public double hitungVolume() {
        hitgLuasAlas();
        super.vol = (luasAlas * tinggi) / 3;
        return super.vol;
    }

    public void tampil() {
        super.hitungLuas();
        hitungLuas();
        hitungVolume();
        System.out.println("\n     ::: Limas Persegi :::");
        System.out.println("     -> Luas : " + super.luas);
        System.out.println("     -> Volume : "+ super.vol);
    }
}