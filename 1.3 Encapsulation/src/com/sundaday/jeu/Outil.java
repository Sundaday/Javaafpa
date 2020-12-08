package com.sundaday.jeu;

import javax.swing.*;

public class Outil {


    public static void Afficher(Personne personne) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        JOptionPane.showMessageDialog(null, personne.toString());
    }
}
