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
            System.out.println("carburantNecessaire = " + carburantNecessaire);
        } else {
            volumeReservoir = 0;
            System.out.println("carburantNecessaire = " + carburantNecessaire);
        }
        return volumeReservoir;
    }

    public static boolean demarrer() {
        if (volumeReservoir > 0) {
            volumeReservoir -= 0.1f;
        } else {
            démarré = false;
        }
        return démarré;
    }

    public static void arreter() {
    }


    public static float faireLePlein(float essenceAjoute) {
        volumeReservoir += essenceAjoute;
        volumeTotal += essenceAjoute;
        System.out.println("Plein effectué avec " + volumeReservoir + " litres");
        return volumeReservoir;
    }


    public static float getVolumeReservoir() {
        return volumeReservoir;
    }

    public static void setVolumeReservoir(float volumeReservoir) {
        Moteur.volumeReservoir = volumeReservoir;
    }

    public float getVolumeTotal() {
        return volumeTotal;
    }

    public static boolean isDémarré() {
        return démarré;
    }
}
