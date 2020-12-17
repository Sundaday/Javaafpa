package com.sundaday.jeu;



public abstract class Vehicule {
    //variable
    String marque;
    String modele;
    String type;


    //constructeur
    public Vehicule(String marque, String modele, String type, float volumeReservoir){
        this.marque = marque;
        this.modele = modele;
        this.type = type;
        Moteur.volumeReservoir = volumeReservoir;

    }

    //methode
    public abstract boolean demarrer();
    public abstract void arreter();

    public static void faireLePlein(float essenceAjoute) {
    }
}



