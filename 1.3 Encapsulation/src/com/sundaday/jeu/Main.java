package com.sundaday.jeu;


import javax.swing.*;

public class Main {//extends Outil{

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        Adresse paris = new Adresse(2,"rue Victor Hugo",75008,"Paris");
        Adresse nantes = new Adresse(17,"rue de la Republique",44000,"Nantes");
        Adresse lille = new Adresse(55,"bld de la Libération",59000,"Lille");

        Personne Jean = new Personne("Jean","Dupont",30,lille);
        Personne Bernard = new Personne("Bernard","Morin",45,paris);
        Personne Nathalie = new Personne("Nathalie","Durand",35,nantes);


        Jean.setAdresse(new Adresse(44,"rue des Docks",33000,"Bordeaux"));
        Nathalie.setAdresse(Bernard.getAdresse());

        JOptionPane.showMessageDialog(null,Nathalie.toString() + "\n" + Bernard.toString());
        ;
        Afficher(Jean);

    }
}
