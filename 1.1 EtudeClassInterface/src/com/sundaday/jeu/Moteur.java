package com.sundaday.jeu;

public class Moteur {
    //variable
    static float volumeReservoir;
    static float volumeTotal;
    static boolean démarré;

    //Constructeur

    //methode


    public static float utiliser(float carburantNecessaire) {
        if (volumeReservoir >= carburantNecessaire) {
            volumeReservoir -= carburantNecessaire;
        } else {
            volumeReservoir = 0;
        }
        return volumeReservoir;
    }

    public static boolean demarrer() {
        if (volumeReservoir > 0) {
            volumeReservoir -= 1 / 10f;
        } else {
            démarré = false;
        }
        return démarré;
    }

    public void arreter() {
    }

    public void faireLePlein(float essenceAjoute) {
        volumeReservoir += essenceAjoute;
        volumeTotal += essenceAjoute;
        System.out.println("Plein effectué avec " + volumeReservoir + " litres");
    }


    public float getVolumeReservoir() {
        return volumeReservoir;
    }

    public float getVolumeTotal() {
        return volumeTotal;
    }

    public static boolean isDémarré() {
        return démarré;
    }
}
