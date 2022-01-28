package com.example.basics;

import com.example.basics.Figura;

class Trojkat extends Figura
{
    int wys=0;
    int podst=0;

    public Trojkat(int wys,int podst)
    {

        this.wys = wys;
        this.podst = podst;

    }


    @Override
    public String toString() {
        return "com.example.basics.Trojkat{" +
                "wys=" + wys +
                ", podst=" + podst +
                ", punkt=" + punkt +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    Trojkat(int wys, int podst, String kolor){
        super(kolor);
        this.wys=wys;
        this.podst=podst;
    }
}
