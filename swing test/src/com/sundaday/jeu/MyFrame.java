package com.sundaday.jeu;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private JTabbedPane tabs = new JTabbedPane();
    private JPanel tab1Panel = new JPanel();
    private JTextField tab1TextField = new JTextField(15);
    private JButton tab1Button1 = new JButton("Go to Tab 2");
    private JButton tab2Button1 = new JButton("Show value from Tab 1");
    private JPanel panel1 = new JPanel();


    public MyFrame() {
        this.initComponents();
        this.layoutComponents();
    }


    private void initComponents() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.tab1Button1.addActionListener(e -> selectTab2());
        this.tab2Button1.addActionListener(e -> showValue());

        this.setVisible(true);
    }

    private void layoutComponents() {
        this.tab1Panel.setLayout(new FlowLayout());
        this.tab1Panel.add(this.tab1TextField);
        this.tab1Panel.add(this.tab1Button1);
        Panel1.addComponentsToPane(this.panel1);



        /*
         * On peut ajouter des "composants" à un onglet, qu'il s'agisse d'un
         * conteneur comme un JPanel comme pour le premier onglet ou n'importe
         * quoi d'autre en fait, ici, un simple bouton pour le deuxième onglet
         */
        this.tabs.addTab("Tab 1", this.tab1Panel);
        this.tabs.addTab("Panel1", this.panel1);
        this.tabs.addTab("Tab 2", this.tab2Button1);

        this.add(this.tabs);

        this.pack();
    }

    private void selectTab2() {
        this.tabs.setSelectedIndex(1);
        // Ou encore
        // this.tabs.setSelectedComponent(this.tab2Button1);
        // Puisque c'est le bouton qui sert de contenu à cet onglet
    }

    private void showValue() {
        /* On se fiche de savoir où est le champ texte en vérité, du moment
            qu'on a une référence sur laquelle appeller `getText()`, par exemple
         */

        JOptionPane.showMessageDialog(
                this,
                "Valeur: <" + this.tab1TextField.getText() + ">"
        );
    }
}
