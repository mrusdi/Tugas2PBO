import java.util.Scanner;

import bangunDimensi.persegi.Kubus;
import bangunDimensi.persegi.LimasPersegi;
import bangunDimensi.persegiPanjang.Balok;
import bangunDimensi.persegiPanjang.LimasPersegiPanjang;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi;
        char kembali;

        do {
            System.out.print("Input Panjang : ");
            panjang = input.nextInt();
            System.out.print("Input Lebar : ");
            lebar = input.nextInt();
            System.out.print("Input Tinggi : ");
            tinggi = input.nextInt();

            Kubus kubus = new Kubus(panjang);
            LimasPersegi limaspersegi = new LimasPersegi(panjang, tinggi);
            Balok balok = new Balok(panjang, lebar, tinggi);
            LimasPersegiPanjang limaspersegipanjang = new LimasPersegiPanjang(panjang, lebar, tinggi);

            kubus.tampil();
            limaspersegi.tampil();
            balok.tampil();
            limaspersegipanjang.tampil();


            System.out.print("\nKembali? : ");
            kembali = input.next().charAt(0);
        } while (kembali == 'y');
    }
}