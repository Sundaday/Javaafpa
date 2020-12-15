package com.sundaday.jeu;

import static com.sundaday.jeu.Moteur.volumeReservoir;
import static com.sundaday.jeu.Moteur.volumeTotal;

public abstract class VehiculeAMoteur extends Vehicule {

    public VehiculeAMoteur(String marque, String modele, float volumeReservoir) {
        super(marque, modele, volumeReservoir);
    }

    public boolean demarrer() {
        return Moteur.demarrer();
    }

    public void arreter() {
        Moteur.arreter();
    }

    public static void faireLePlein(float essenceAjoute) {
        Moteur.arreter();
        Moteur.faireLePlein(essenceAjoute);
        Moteur.demarrer();
    }

}
