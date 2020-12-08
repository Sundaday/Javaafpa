package com.sundaday.jeu;

public class Adresse {

    //variable
    int numeroRue;
    int codePostal;
    String nomRue;
    String ville;

    //constructeur
    public Adresse (int numeroRue, String nomRue, int codePostal, String ville){
        System.out.println(numeroRue + nomRue + codePostal + ville);
    }
    //methodes
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
