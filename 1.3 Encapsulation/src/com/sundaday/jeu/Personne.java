package com.sundaday.jeu;

public class Personne{
    //variable
    private String prenom;
    private String nom;
    private int age;
    private Adresse adresse;

    //constructeur

    public Personne(String prenom, String nom, int age, Adresse adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    //methodes
    public String toString(){
        return getPrenom()+" "+nom+" "+age+"ans, habite au "+ adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }


}
