package com.company;

public class Poder {

    int poder = 0;

    public Poder(int poder) {
        this.poder = poder;
    }

    public Poder() {
        this.poder =0;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }



    public void aumentarPoder(int nuevo){
        this.poder = nuevo;
    }
}
