package Entities;

public abstract class Societe {

    private String raisonSociale;
    private String domaineSociete;
    private String adresse;
    private String nomDeRue;
    private String ville;
    private String email;
    private String commentaires;
    private int telephone;
    private int id;
    private int nbRue;
    private int codePostal;

    public Societe(String raisonSociale,
                   String domaineSociete,
                   String adresse,
                   String nomDeRue,
                   String ville,
                   String email,
                   String commentaires,
                   int telephone,
                   int id,
                   int nbRue,
                   int codePostal)
    {
        this.raisonSociale = raisonSociale;
        this.domaineSociete = domaineSociete;
        this.adresse = adresse;
        this.nomDeRue = nomDeRue;
        this.ville = ville;
        this.email = email;
        this.commentaires = commentaires;
        this.telephone = telephone;
        this.id = id;
        this.nbRue = nbRue;
        this.codePostal = codePostal;

    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getDomaineSociete() {
        return domaineSociete;
    }

    public void setDomaineSociete(String domaineSociete) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
