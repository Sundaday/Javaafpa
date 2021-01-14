package Entities;

import Utils.DomaineSociete;

import java.util.Date;

public class Prospect extends Societe {
    //No static fields
    private Date dateDeProspection;
    private String prospectInteresse;

    //Default constructor
    public Prospect(){};
    //Societe's constructor
    public Prospect(int id,
                    String raisonSociale,
                    DomaineSociete domaineSociete,
                    String adresse,
                    String nomDeRue,
                    String ville,
                    String email,
                    String commentaires,
                    int telephone,
                    int nbRue,
                    int codePostal,
                    Date dateDeProspection,
                    String prospectInteresse) {
        super(id,
                raisonSociale,
                domaineSociete,
                adresse,
                nomDeRue,
                ville,
                email,
                commentaires,
                telephone,
                nbRue,
                codePostal);
        this.dateDeProspection = dateDeProspection;
        this.prospectInteresse = prospectInteresse;
    }

    //G&S
    public Date getDateDeProspection() {
        return dateDeProspection;
    }

    public void setDateDeProspection(Date dateDeProspection) {
        this.dateDeProspection = dateDeProspection;
    }

    public String getProspectInteresse() {
        return prospectInteresse;
    }

    public void setProspectInteresse(String prospectInteresse) {
        this.prospectInteresse = prospectInteresse;
    }
}
