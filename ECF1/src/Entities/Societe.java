package Entities;

import Utils.DomaineSociete;

public abstract class Societe {
    //No static fields
    private int id;
    private String raisonSociale;
    private DomaineSociete domaineSociete;
    private String adresse;
    private String nomDeRue;
    private String ville;
    private String email;
    private String commentaires;
    private int telephone;
    private int nbRue;
    private int codePostal;

    //Default constructor
    public Societe(){};

    //Non default constructor
    public Societe(String raisonSociale,
                   DomaineSociete domaineSociete,
                   String adresse,
                   String nomDeRue,
                   String ville,
                   String email,
                   String commentaires,
                   int telephone,
                   int nbRue,
                   int codePostal) {
        this.raisonSociale = raisonSociale;
        this.domaineSociete = DomaineSociete.PUBLIC;
        this.adresse = adresse;
        this.nomDeRue = nomDeRue;
        this.ville = ville;
        this.email = email;
        this.commentaires = commentaires;
        this.telephone = telephone;
        this.nbRue = nbRue;
        this.codePostal = codePostal;

    }

    //G&S
    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public DomaineSociete getDomaineSociete() {
        return domaineSociete;
    }

    public void setDomaineSociete(DomaineSociete domaineSociete) {
        this.domaineSociete = domaineSociete;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNomDeRue() {
        return nomDeRue;
    }

    public void setNomDeRue(String nomDeRue) {
        this.nomDeRue = nomDeRue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getNbRue() {
        return nbRue;
    }

    public void setNbRue(int nbRue) {
        this.nbRue = nbRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    //ToString
    @Override
    public String toString() {
        return "Societe{" +
                "id=" + id +
                ", raisonSociale='" + raisonSociale + '\'' +
                ", domaineSociete=" + domaineSociete +
                ", adresse='" + adresse + '\'' +
                ", nomDeRue='" + nomDeRue + '\'' +
                ", ville='" + ville + '\'' +
                ", email='" + email + '\'' +
                ", commentaires='" + commentaires + '\'' +
                ", telephone=" + telephone +
                ", nbRue=" + nbRue +
                ", codePostal=" + codePostal +
                '}';
    }
}
