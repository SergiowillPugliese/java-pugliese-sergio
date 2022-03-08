package com.engim.esercizio;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcolatricePolaccaInversa {
    static ArrayList<Double> pila;

    public static double pop(){
        double n = pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return n;
    }

    public static void addizione(){
        if(pila.size() >= 2){
            double n2 = pop();
            double n1 = pop();
            aggiuntaNum(n1+n2);
        }
    }

    public static void sottrazione(){
        if(pila.size() >= 2){
            double n2 = pop();
            double n1 = pop();
            aggiuntaNum(n2-n1);
        }
    }

    public static void moltiplicazione(){
        if(pila.size() >= 2){
            double n2 = pop();
            double n1 = pop();
            aggiuntaNum(n1*n2);
        }
    }

    public static void divisione(){
        if(pila.size() >= 2){
            double n2 = pop();
            double n1 = pop();
            aggiuntaNum(n1/n2);
        }

    }
    public static void aggiuntaNum(double num){
        pila.add(num);
    }

    public static void main(String[] args) {
        pila = new ArrayList<>();
        System.out.println("Benvenuto nella calcolatrice. Inserisci un'espressione in notazione polacca inversa.");
        Scanner tastiera = new Scanner(System.in);
        boolean finito = false;
        while (!finito) {
            String inserito = tastiera.next();
            switch (inserito) {
                case "+":
                    addizione();
                    break;
                case "-":
                    sottrazione();
                    break;
                case "*":
                    moltiplicazione();
                    break;
                case "/":
                    divisione();
                    break;
                case "=":
                    System.out.println(pila);
                    break;
                case "!":
                    finito = true;
                    break;
                default:
                    aggiuntaNum(Double.parseDouble(inserito));
            }
        }
    }
    }