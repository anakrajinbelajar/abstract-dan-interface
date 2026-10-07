package org.example;
public class SegiEmpat extends BangunDatar{
    public int panjang, lebar;

    @Override
    public void hitungluas() {
        this.luas = panjang*lebar;
    }

    @Override
    public void hitungkeliling() {
        this.keliling = (2*panjang) + 2*lebar;
    }
}

