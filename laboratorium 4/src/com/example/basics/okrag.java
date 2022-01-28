package com.example.basics;


public class Okrag {
    Punkt srodek;
    int promien;

    public double getPowierzchnia(){
        return (3.14*promien*promien);
    }
    public double setSrednica(){
        return 2*promien;
    }
    public int getPromien(){
        return promien;
    }

    public boolean wSrodku(Punkt punkt){//środek(a,b) i promien>0 Punkt podany ma wspł(x,y) równanie okręgu (x-a)^2+(y-b)^2=r^2 to jest do metody wSrodku
        double lewaStrRownania=Math.pow((punkt.x-srodek.x),2)+Math.pow((punkt.y-srodek.y),2);
        double prawaStrRownania=Math.pow(promien,2);
        if(lewaStrRownania==prawaStrRownania) return true;
        return false;

    }

    public Okrag() {
        this.srodek = srodek;
        this.promien = promien;
    }

    public Okrag(Punkt srodek, int promien) {
        this.srodek = srodek;
        this.promien = promien;
    }
    public Okrag(Punkt srodek, int srednia) {
        this.srodek = srodek;
        this.promien = srednia * 2;
    }

}
