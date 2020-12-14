package com.sundaday.jeu;

public class Scooter extends VehiculeAMoteur {

    public Scooter(String marque, String modele, float reservoir) {
        super(marque, modele, reservoir);
    }

    public void rouler(float consommation) {
        if (!Moteur.isDémarré()) {
            Moteur.demarrer();
        }
        float carburant = Moteur.utiliser(consommation);
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", moteur=" + moteur +
                '}';
    }
}
