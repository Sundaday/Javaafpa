package com.sundaday.jeu;

public class Voiture extends VehiculeAMoteur {

    public Voiture(String marque, String modele,String type, float volumeReservoir) {
        super(marque, modele,type, volumeReservoir);
    }

    public void rouler(float consommation) throws PanneEssenceException{
        if (!Moteur.isDémarré()) {
            Moteur.demarrer();
        }
        float carburant = Moteur.utiliser(consommation);
        if (carburant == 0){
            throw new PanneEssenceException("Vous etes en panne");
        }
    }

    @Override
    public String toString() {
        return "Voiture " +
                "marque=" + marque +
                " modele=" + modele +
                " reservoir=" + Moteur.getVolumeReservoir();
    }
}
