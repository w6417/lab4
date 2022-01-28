package com.example.basics;


public class main {
    public static void main (String[]args){

        Punkt pkt= new Punkt();
        Trojkat t1=new Trojkat(5,2);
        Figura f1=new Figura();
        Prostokat p1=new Prostokat(3,2);
        Kwadrat k1=new Kwadrat(4,4);
        p1.przesun(2,3);
        System.out.println(pkt.toString());
        System.out.println(t1.toString());
        System.out.println(f1.toString());
        System.out.println(p1.toString());
        System.out.println(k1.toString());




    }
}
