package org.example;
public class Lingkaran extends BangunDatar{
    public int jarijari;

    @Override
    public void hitungluas() {
        this.luas = Math.PI*jarijari*jarijari;
    }

    @Override
    public void hitungkeliling() {
        this.keliling = 2*Math.PI*jarijari;
    }
}

