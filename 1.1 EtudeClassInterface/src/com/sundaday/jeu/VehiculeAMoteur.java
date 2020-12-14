package com.sundaday.jeu;

import static com.sundaday.jeu.Moteur.volumeTotal;

public abstract class VehiculeAMoteur extends Vehicule {
    Moteur moteur;

    public VehiculeAMoteur(String marque, String modele, float reservoir) {
        super(marque, modele, reservoir);
    }


    public boolean demarrer() {
        return moteur.demarrer();
    }

    public void arreter() {
        moteur.arreter();
    }

    public void faireLePlein(float essenceAjoute) {
        moteur.arreter();
        moteur.faireLePlein(volumeTotal);
        moteur.demarrer();
    }
}
