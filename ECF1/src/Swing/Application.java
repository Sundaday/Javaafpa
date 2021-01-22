package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame implements ActionListener {
    //No static fields
    public String choix = "Client";

    private final JRadioButton btnClient = new JRadioButton("Client");
    private final JRadioButton btnProspect = new JRadioButton("Prospect");
    private final ButtonGroup choixEnum = new ButtonGroup();
    private final JComboBox comboBox = new JComboBox();
    private final JButton create = new JButton("Créer");
    private final JButton modificate = new JButton("Modifier");
    private final JButton delete = new JButton("Supprimer");
    private final JButton show = new JButton("Afficher");

    //MainApplication
    public Application(){

        this.setTitle("Reverso");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setAlwaysOnTop(true);

        this.initControls();

        //this.pack();
        this.setVisible(true);
    }


    //Controles
    private void initControls(){
        btnClient.setSelected(true);
        btnClient.addActionListener(this);
        btnProspect.addActionListener(this);

        JPanel main = (JPanel) this.getContentPane();
        main.setLayout(new BorderLayout(10,10));
        main.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        JPanel toolRS = new JPanel(new BorderLayout());
        toolRS.setBorder(BorderFactory.createTitledBorder("Raison Social"));
        toolRS.add(comboBox);

        JPanel enumChoix = new JPanel(new FlowLayout());
        enumChoix.setBorder(BorderFactory.createTitledBorder(this.choix));
        choixEnum.add(btnClient);
        choixEnum.add(btnProspect);
        enumChoix.add(btnClient, BorderLayout.NORTH);
        enumChoix.add(btnProspect, BorderLayout.NORTH);

        JPanel bouton = new JPanel(new GridLayout(4,1));
        bouton.setBorder(BorderFactory.createTitledBorder("Option"));
        create.addActionListener(this);
        bouton.add(create);
        bouton.add(modificate);
        bouton.add(delete);
        bouton.add(show);

        main.add(enumChoix,BorderLayout.NORTH);
        main.add(bouton, BorderLayout.CENTER);
        main.add(toolRS,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==create){
            Creer creer = new Creer();
            this.dispose();
        }
        if(e.getSource()==modificate){
            Creer creer = new Creer();
            this.dispose();
        }
        if(e.getSource()==delete){

            this.dispose();
        }
        if(e.getSource()==show){

            this.dispose();
        }
    }


}
