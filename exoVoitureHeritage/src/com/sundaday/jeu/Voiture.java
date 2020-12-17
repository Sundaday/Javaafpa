package com.sundaday.jeu;

public class Voiture extends VehiculeAMoteur {

    public Voiture(String marque, String modele, float volumeReservoir) {
        super(marque, modele,new Moteur(volumeReservoir));
    }

    public void rouler(float volumeCarburant) throws PanneEssenceException{
        if(!getMoteur().isDemarré()){
            getMoteur().demarrer();
        }
        float carburantUtilisé = getMoteur().utiliser(volumeCarburant);
        if(carburantUtilisé == 0){
            throw new PanneEssenceException("Vous etes en panne");
        }
    }
}
