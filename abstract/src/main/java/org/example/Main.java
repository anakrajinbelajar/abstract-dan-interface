package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] argv) {
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungluas();
        stsk.hitungkeliling();
        System.out.println("Luas STSK = "+stsk.luas);
        System.out.println("Keliling STSK = "+stsk.keliling);
        System.out.println();

        SegiEmpat se = new SegiEmpat();
        se.panjang = 10;
        se.lebar = 5;
        se.hitungluas();
        se.hitungkeliling();
        System.out.println("Luas SE = "+se.luas);
        System.out.println("Keliling SE = "+se.keliling);
        System.out.println();

        Lingkaran l = new Lingkaran();
        l.jarijari = 13;
        l.hitungluas();
        l.hitungkeliling();
        System.out.println("Luas L = "+l.luas);
        System.out.println("Keliling L = "+l.keliling);
        System.out.println();

        BelahKetupat bk = new BelahKetupat();
        bk.diagonal1 = 10;
        bk.diagonal2 = 8;
        bk.sisi = 6;
        bk.hitungluas();
        bk.hitungkeliling();
        System.out.println("Luas BELAHKETUPAT = "+bk.luas);
        System.out.println("Keliling BELAHKETUPAT ="+bk.keliling);
    }
}
