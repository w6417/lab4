package com.example.basics;

import com.example.basics.Punkt;

class Figura {

    //pola metody i kontruktory
    Punkt punkt;
    String kolor = "bialy";


    public Figura(){
        punkt = new Punkt(0,0);
    }
    public Figura(String kolor){
        this.kolor=kolor;
        punkt= new Punkt(0,0);
    }
    public Figura(Punkt punkt){
        this.punkt=punkt;
    }
    void przesun(int x, int y) {
        punkt.x += x;
        punkt.y += y;
    }
    public String getKolor(){
        return kolor;
    }

    @Override
    public String toString() {
        return "com.example.basics.Figura{" +
                "punkt=" + punkt +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}