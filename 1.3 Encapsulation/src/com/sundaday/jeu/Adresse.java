package com.sundaday.jeu;

public class Adresse {

    //variable
    int numeroRue;
    String nomRue;
    int codePostal;
    String ville;

    //constructeur
    public Adresse(int numeroRue, String nomRue, int codePostal, String ville) {

        this.numeroRue = numeroRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    //methodes

    public String toString(){
        return numeroRue + " " + nomRue + " " + codePostal + " " + ville;
    }

    public int getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
