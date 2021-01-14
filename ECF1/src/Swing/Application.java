package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame implements ActionListener {
    //Static fields
    public static JButton create = new JButton("Creer");
    public static JButton modificate = new JButton("Modifier");
    public static JButton delete = new JButton("Supprimer");
    public static JButton show = new JButton("Afficher");
    //No static fields
    private JRadioButton btnClient = new JRadioButton("Client");
    private JRadioButton btnProspect = new JRadioButton("Prospect");
    private ButtonGroup choix = new ButtonGroup();


    //MainApplication
    public Application(){
        this.setTitle("Reverso");
        this.getContentPane().setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,300);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setAlwaysOnTop(true);
        this.initControls();
        this.layoutComponents();
        this.setVisible(true);
    }

    //Controles
    private void initControls(){





    }

    private void layoutComponents(){
        this.setLayout(new BorderLayout(10,10));


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void createSecondePage(ActionEvent e) {
    }
}
