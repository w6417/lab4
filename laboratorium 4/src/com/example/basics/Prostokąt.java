package com.example.basics;

import com.example.basics.Figura;

class Prostokat extends Figura {
    int wys=0;
    int szer=0;

    Prostokat(int wys,int szer){

        this.wys = wys;
        this.szer = szer;

    }

    Prostokat(int wys,int szer,String kolor){
        super(kolor);
        this.wys=wys;
        this.szer=szer;
    }

    @Override
    public String toString() {
        return "com.example.basics.Prostokat{" +
                "wys=" + wys +
                ", szer=" + szer +
                ", punkt=" + punkt +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    int getPowierzchnia() {
        return (szer * wys);
    }

    public void przesun(int x, int y){





    }



}
