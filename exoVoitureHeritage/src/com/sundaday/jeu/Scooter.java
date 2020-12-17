package com.sundaday.jeu;

public class Scooter extends VehiculeAMoteur{

    public Scooter(String marque, String modele,float volumeCarburant) {
        super(marque, modele, new Moteur(volumeCarburant));
    }

    public void rouler(float volumeCarburant){
        if(!getMoteur().isDemarré()){
            getMoteur().demarrer();

        }
        float carburant = getMoteur().utiliser(volumeCarburant);

    }
}
