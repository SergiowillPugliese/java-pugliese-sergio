package com.engim.lezione6;

public class EsFattoriale {

    public static int fattoriale(int n){
        if (n == 0)
            return 1;
        else
            return n * fattoriale(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fattoriale(3));
    }
}
