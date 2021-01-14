package Entities;

import Utils.DomaineSociete;

public class Client extends Societe {
    //No static fields
    private int chiffreAffaire;
    private int nbEmploye;

    //Default constructor
    public Client() {};
    //Non default constructor
    public Client(int id,
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
                  int chiffreAffaire,
                  int nbEmploye)
    {
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
        this.chiffreAffaire = chiffreAffaire;
        this.nbEmploye = nbEmploye;
    }

    //G&S
    public int getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(int chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }
}
