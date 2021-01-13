package Entities;

public class Client extends Societe{

    private int chiffreAffaire;
    private int nbEmploye;

    public Client(String raisonSociale,
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
