package com.sundaday.jeu;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Voiture laguna = new Voiture("Renault", "Laguna","voiture", 25.2f);
        System.out.println(laguna);
        laguna.demarrer();
        try {
            laguna.rouler(25);
        } catch (PanneEssenceException ex) {
            System.out.println(ex.getMessage());
            String resultat = JOptionPane.showInputDialog(null,
                    "Veuillez saisir le nombre de litres SVP ");
            int i = Integer.parseInt(resultat);
            VehiculeAMoteur.faireLePlein((float)(i));
        }
        System.out.println(laguna);

    }
}
