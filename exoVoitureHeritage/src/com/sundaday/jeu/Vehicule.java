package com.sundaday.jeu;

public abstract class Vehicule {

    private String marque;
    private String modele;
    private float volumeCarburant;


    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;


    }

    public abstract boolean demarrer();
    public abstract void arreter();
    public abstract float faireLePlein(float volumeCarburant);


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}

