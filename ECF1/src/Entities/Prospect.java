package Entities;

import java.util.Date;

public class Prospect extends Societe{

    private Date dateDeProspection;
    private String prospectInteresse;

    public Prospect(String raisonSociale,
                  String domaineSociete,
                  String adresse,
                  String nomDeRue,
                  String ville,
                  String email,
                  String commentaires,
                  int telephone,
                  int id,
                  int nbRue,
                  int codePostal) {
        super(raisonSociale,
                domaineSociete,
                adresse,
                nomDeRue,
                ville,
                email,
                commentaires,
                telephone,
                id,
                nbRue,
                codePostal);
    }
}
