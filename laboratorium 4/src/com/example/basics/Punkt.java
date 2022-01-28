package com.example.basics;

public class Punkt {
    int x = 0;
    int y = 0;
    public Punkt ()
    {
        x=0;
        y=0;
    }

    public  Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "com.example.basics.Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX(){
        return x;
    }

    public  int getY(){
        return y;
    }

    public  void setX(int x){
        this.x = x;
    }

    public  void setY(int y){
        this.y = y;
    }

    public void zeruj(){
        x=0;
        y=0;
    }
}
