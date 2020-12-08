package com.sundaday.jeu;

public class Personne {

    //variable
    private String nom;
    private String societe;
    private static final String PAS_DE_SOCIETE = "?";
    private String addSociete;

    //constructeur
    public Personne (String nom){
        this.nom = nom.toUpperCase();
        societe = PAS_DE_SOCIETE;
    }
    public Personne (String nom,String societe){
        this.nom = nom.toUpperCase();
        this.societe = societe;
        this.societe = validerSociete(societe).toUpperCase() ;
    }
    //methode
    public void afficher(){
        System.out.println("Je m'appel " + nom );
        if ( societe.equals( "?" ) ){
            System.out.println("Je ne suis pas salarié");
        }
        else{
            System.out.println("Je travaille chez " + societe);
        }
    }
    public void quitterSociete(){
        if(PAS_DE_SOCIETE.equals(societe)){
            afficher();
            System.out.println("Je ne suis pas salarié : impossible de quitter la société");
            System.exit(1);
        }
        societe = PAS_DE_SOCIETE;
    }
    private String validerSociete(String societe){
        if (societe.length() > 30 || societe.equals(PAS_DE_SOCIETE)){
            System.exit(1);
        }
        return societe;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;

    }
    public String getSociete() {
        return societe;
    }
    public void setSociete(String societe) {
        //this.societe = societe;

        if(!societe.equals(PAS_DE_SOCIETE)){
            System.out.println("Erreur : 1 quitterSociete, puis 2-affecterSociete");
            System.exit(3);
        }
        else {
            this.societe = validerSociete(societe).toUpperCase();
        }

    }
}
