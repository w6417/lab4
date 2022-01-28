package com.example.basics;

public class Kwadrat extends Prostokat {

    @Override
    public String toString() {
        return "com.example.basics.Kwadrat{" +
                "wys=" + wys +
                ", punkt=" + punkt +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    Kwadrat(int wys, int szer) {
        super(wys, szer);
    }
}
