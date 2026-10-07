package org.example;

public class BelahKetupat extends BangunDatar{
    public int diagonal1, diagonal2, sisi;

    @Override
    public void hitungluas() {
        luas = 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public void hitungkeliling() {
        keliling = 4 * sisi;
    }
}
