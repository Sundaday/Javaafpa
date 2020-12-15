package com.sundaday.jeu;



public abstract class Vehicule {
    //variable
    String marque;
    String modele;


    //constructeur
    public Vehicule(String marque, String modele, float volumeReservoir){
        this.marque = marque;
        this.modele = modele;
        Moteur.volumeReservoir = volumeReservoir;

    }

    //methode
    public abstract boolean demarrer();
    public abstract void arreter();
    public static void faireLePlein(float essenceAjoute) {
    }


}
