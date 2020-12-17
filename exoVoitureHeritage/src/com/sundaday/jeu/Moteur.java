package com.sundaday.jeu;

public class Moteur {
    private final float CONSOMMATION_DEMARRAGE = 0.1f;
    private float volumeReservoir;
    private float volumeTotal;
    private boolean demarré;

    public Moteur(float volumeReservoir) {
        this.volumeReservoir = volumeReservoir;
    }

    public boolean demarrer() {
        //TODO ajouter methodes qui verifie si moteur deja demarré
        if (volumeReservoir <= 0) {
            this.demarré = false;
            System.out.println("Je ne peux pas demarrer car mon reservoir contient"
                    + volumeReservoir);
        } else {
            if (volumeReservoir >= 0.1f) {
                this.demarré = true;
                this.volumeReservoir -= CONSOMMATION_DEMARRAGE;
                System.out.println("Je demarre");
                System.out.println("Je viens de consommer 1/10 litre pour demarrer");
            }
        }
        return demarré;
    }

    public float utiliser(float volumeCarburant) {
        if (volumeReservoir >= volumeCarburant) {
            this.volumeReservoir -= volumeCarburant;
            System.out.printf("Il reste %.2f \n" , volumeReservoir);
        } else {
            volumeReservoir = 0;
            System.out.println("Je suis en panne");
        }
        return volumeCarburant;
    }


    public void faireLePlein(float volumeCarburant) {
        volumeReservoir += volumeCarburant;
        System.out.println("J'ai mis" + volumeCarburant
                +" dans le reservoir");

    }

    public void arreter() {
        //TODO add methode si moteur deja arreté
        System.out.println("J'ai arreté");
    }

    @Override
    public String toString() {
        return "Moteur{" +
                "volumeReservoir=" + volumeReservoir +
                ", volumeTotal=" + volumeTotal +
                ", demarré=" + demarré +
                '}';
    }

    public float getVolumeReservoir() {
        return volumeReservoir;
    }

    public void setVolumeReservoir(float volumeReservoir) {
        this.volumeReservoir = volumeReservoir;
    }

    public float getVolumeTotal() {
        return volumeTotal;
    }

    public void setVolumeTotal(float volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    public boolean isDemarré() {
        return demarré;
    }

    public void setDemarré(boolean demarré) {
        this.demarré = demarré;
    }
}

