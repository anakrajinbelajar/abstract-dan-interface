package org.example;

public class Lingkaran extends BangunDatar implements Resizeable{
    public int jarijari;

    @Override
    public void hitungluas() {
        this.luas = Math.PI*jarijari*jarijari;
    }

    @Override
    public void hitungkeliling() {
        this.keliling = 2*Math.PI*jarijari;
    }

    @Override
    public void perbesar() {
        this.jarijari = 2*this.jarijari;
    }

    @Override
    public void perkecil() {
        this.jarijari = (int) (0.5*this.jarijari);
    }
}
