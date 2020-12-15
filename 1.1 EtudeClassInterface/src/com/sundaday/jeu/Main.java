package com.sundaday.jeu;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Voiture laguna = new Voiture("Renault", "Laguna", 25.2f);
        //System.out.println(laguna);
        //laguna.demarrer();
        //try {
        //    laguna.rouler(25);
        //} catch (PanneEssenceException ex) {
        //    System.out.println(ex.getMessage());
        //    String resultat = JOptionPane.showInputDialog(null,
        //            "Veuillez saisir le nombre de litres SVP ");
        //    int i = Integer.parseInt(resultat);
        //    VehiculeAMoteur.faireLePlein((float)(i));
        //}
        //System.out.println(laguna);
        Voiture citroen = new Voiture("Citroen", "C5", 40.0f);
        for (int i = 0; i < 5; i++) {
            citroen.demarrer();
            try {
                citroen.rouler(10);
            } catch (PanneEssenceException ex) {
                System.out.println(ex.getMessage());

            }


        }
    }
}
