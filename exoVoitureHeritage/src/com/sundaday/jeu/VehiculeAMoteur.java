package com.sundaday.jeu;

import java.util.ArrayList;
import java.util.List;

public abstract class VehiculeAMoteur extends Vehicule{
    private Moteur moteur;

    public VehiculeAMoteur(String marque, String modele,Moteur moteur) {
        super(marque, modele);
        this.moteur = moteur;
    }

    public boolean demarrer(){ return this.moteur.demarrer();
    }

    public void arreter(){ this.moteur.arreter();
    }

    public float faireLePlein(float volumeCarburant){
        this.moteur.arreter();
        this.moteur.faireLePlein(volumeCarburant);
        this.moteur.demarrer();
        return moteur.getVolumeReservoir();
    }


    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }


}
