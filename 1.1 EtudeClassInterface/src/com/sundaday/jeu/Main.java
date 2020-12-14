package com.sundaday.jeu;

public class Main {

    public static void main(String[] args) {
        Voiture laguna = new Voiture("Renault", "Laguna", 30.0f);
        System.out.println(laguna);
        laguna.demarrer();
        laguna.rouler(25);
        System.out.println("laguna = " + laguna);



    }
}
