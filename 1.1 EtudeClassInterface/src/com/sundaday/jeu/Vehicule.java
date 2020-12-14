package com.sundaday.jeu;

public abstract class Vehicule {
    //variable
    String marque;
    String modele;
    float reservoir;

    //constructeur
    public Vehicule(String marque, String modele, float reservoir) {
        this.marque = marque;
        this.modele = modele;
        this.reservoir = reservoir;
    }

    //methode
    public abstract boolean demarrer();
    public abstract void arreter();
    public abstract void faireLePlein(float essenceAjoute);



}
