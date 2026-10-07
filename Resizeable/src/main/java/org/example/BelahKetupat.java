package org.example;

public class BelahKetupat extends BangunDatar implements Resizeable{
    public int diagonal1, diagonal2, sisi;

    @Override
    public void hitungluas() {
        luas = 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public void hitungkeliling() {
        keliling = 4 * sisi;
    }

    @Override
    public void perbesar() {
        this.diagonal1 = this.diagonal1 * 2;
        this.diagonal2 = this.diagonal2 * 2;
        this.sisi = this.sisi * 2;
    }

    @Override
    public void perkecil() {
        this.diagonal1 = this.diagonal1 * 2;
        this.diagonal2 = this.diagonal2 * 2;
        this.sisi = this.sisi * 2;
    }
}
