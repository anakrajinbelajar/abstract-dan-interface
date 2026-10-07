package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] argv) {
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungkeliling();
        se.hitungluas();
        System.out.println("Luas Sebelum Di Perbesar = "+se.luas);
        System.out.println("Keliling Sebelum Di Perbesar = "+se.keliling);
        se.perbesar();
        se.hitungkeliling();
        se.hitungluas();
        System.out.println("Luas Setelah Di Perbesar = "+se.luas);
        System.out.println("Keliling Setelah Di Perbesar = "+se.keliling);
        System.out.println();


        SegiEmpat s = new SegiEmpat();
        s.lebar = 10;
        s.panjang = 10;
        s.hitungkeliling();
        s.hitungluas();
        System.out.println("Luas Sebelum Di Perkecil = "+s.luas);
        System.out.println("Keliling Sebelum Di Perkecil = "+s.keliling);
        s.perkecil();
        s.hitungkeliling();
        s.hitungluas();
        System.out.println("Luas Setelah Di Perkecil = "+s.luas);
        System.out.println("Keliling Setelah Di Perkecil = "+s.keliling);
        System.out.println();


        Lingkaran li = new Lingkaran();
        li.jarijari  = 5;
        li.hitungkeliling();
        li.hitungluas();
        System.out.println("Luas Sebelum Di Perbesar = "+li.luas);
        System.out.println("Keliling Sebelum Di Perbesar = "+li.keliling);
        li.perbesar();
        li.hitungkeliling();
        li.hitungluas();
        System.out.println("Luas Setelah Di Perbesar = "+li.luas);
        System.out.println("Keliling Setelah Di Perbesar = "+li.keliling);
        System.out.println();


        Lingkaran l = new Lingkaran();
        l.jarijari  = 10;
        l.hitungkeliling();
        l.hitungluas();
        System.out.println("Luas Sebelum Di Perkecil = "+l.luas);
        System.out.println("Keliling Sebelum Di Perkecil = "+l.keliling);
        l.perkecil();
        l.hitungkeliling();
        l.hitungluas();
        System.out.println("Luas Setelah Di Perkecil = "+l.luas);
        System.out.println("Keliling Setelah Di Perkecil = "+l.keliling);
        System.out.println();


        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.tinggi = 15;
        stsk.alas = 15;
        stsk.hitungkeliling();
        stsk.hitungluas();
        System.out.println("Luas Sebelum Di Perbesar = "+stsk.luas);
        System.out.println("Keliling Sebelum Di Perbesar = "+stsk.keliling);
        stsk.perbesar();
        stsk.hitungkeliling();
        stsk.hitungluas();
        System.out.println("Luas Setelah Di Perbesar = "+stsk.luas);
        System.out.println("Keliling Setelah Di Perbesar = "+stsk.keliling);
        System.out.println();

        SegiTigaSamaKaki stskk = new SegiTigaSamaKaki();
        stskk.tinggi = 15;
        stskk.alas = 15;
        stskk.hitungkeliling();
        stskk.hitungluas();
        System.out.println("Luas Sebelum Di Perkecil = "+stskk.luas);
        System.out.println("Keliling Sebelum Di Perkecil = "+stskk.keliling);
        stskk.perkecil();
        stskk.hitungkeliling();
        stskk.hitungluas();
        System.out.println("Luas Setelah Di Perkecil = "+stskk.luas);
        System.out.println("Keliling Setelah Di Perkecil = "+stskk.keliling);
        System.out.println();

        BelahKetupat bk = new BelahKetupat();
        bk.diagonal1 = 10;
        bk.diagonal2 = 8;
        bk.sisi = 6;
        bk.hitungkeliling();
        bk.hitungluas();
        System.out.println("BELAHKETUPAT Sebelum Di Perbesar = "+bk.luas);
        System.out.println("BELAHKETUPAT Sebelum Di Perbesar = "+bk.keliling);
        bk.perbesar();
        bk.hitungkeliling();
        bk.hitungluas();
        System.out.println("BELAHKETUPAT Setelah Di Perbesar = "+bk.luas);
        System.out.println("BELAHKETUPAT Setelah Di Perbesar = "+bk.keliling);
        System.out.println();

        BelahKetupat b = new BelahKetupat();
        b.diagonal1 = 10;
        b.diagonal2 = 8;
        b.sisi = 6;
        b.hitungkeliling();
        b.hitungluas();
        System.out.println("BELAHKETUPAT Sebelum Di Perkecil = "+b.luas);
        System.out.println("BELAHKETUPAT Sebelum Di Perkecil = "+b.keliling);
        bk.perkecil();
        bk.hitungkeliling();
        bk.hitungluas();
        System.out.println("BELAHKETUPAT Setelah Di Perkecil = "+b.luas);
        System.out.println("BELAHKETUPAT Setelah Di Perkecil = "+b.keliling);
        System.out.println();

    }
}
