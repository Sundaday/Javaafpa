package com.sundaday.jeu;

public class Main {

    public static void main(String[] args) {

        Voiture laguna = new Voiture("Renault", "Laguna", 30.0f);
        laguna.demarrer();
        try {
            laguna.rouler(30);
        } catch (PanneEssenceException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
