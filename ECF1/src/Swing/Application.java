package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame implements ActionListener {
    //Static fields
    //No static fields
    public String choix = "Client";
    private JPanel main = (JPanel) this.getContentPane();
    private JRadioButton btnClient = new JRadioButton("Client");
    private JRadioButton btnProspect = new JRadioButton("Prospect");
    private ButtonGroup choixEnum = new ButtonGroup();
    private JComboBox comboBox = new JComboBox();
    public static JButton create = new JButton("Créer");
    public static JButton modificate = new JButton("Modifier");
    public static JButton delete = new JButton("Supprimer");
    public static JButton show = new JButton("Afficher");
    private JPanel haut = new JPanel(new FlowLayout());
    private JPanel midD = new JPanel(new GridLayout(2,2));
    private JPanel midG = new JPanel(new BorderLayout(5,5));
    private JPanel centre = new JPanel(new GridLayout(2,2));
    private JPanel bas = new JPanel(new GridLayout(2,1));


    //MainApplication
    public Application(){

        this.setTitle("Reverso");
        this.getContentPane().setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setAlwaysOnTop(true);

        this.initControls();
        this.layoutComponents();

        this.pack();
        this.setVisible(true);
    }

    //Controles
    private void initControls(){
        this.btnClient.setSelected(true);
        this.btnClient.addActionListener(this);
        this.btnProspect.addActionListener(this);

    }

    //Layout
    private void layoutComponents(){
        this.main.setLayout(new BorderLayout(10,10));
        this.main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.bas.setBorder(BorderFactory.createTitledBorder("Raison Social"));
        this.haut.setBorder(BorderFactory.createTitledBorder("Choix"));
        this.centre.setBorder(BorderFactory.createTitledBorder(this.choix));
        this.centre.add(create);
        this.centre.add(modificate);
        this.centre.add(delete);
        this.centre.add(show);
        this.haut.add(this.btnClient);
        this.haut.add(this.btnProspect);
        this.bas.add(this.comboBox);
        this.choixEnum.add(this.btnClient);
        this.choixEnum.add(this.btnProspect);
        this.main.add(this.haut,BorderLayout.NORTH);
        this.main.add(this.bas, BorderLayout.SOUTH);
        this.main.add(this.midD, BorderLayout.EAST);
        this.main.add(this.midG, BorderLayout.WEST);
        this.main.add(this.centre, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void createSecondePage(ActionEvent e) {
    }
}
