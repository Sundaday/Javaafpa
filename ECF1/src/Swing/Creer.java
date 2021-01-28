package Swing;

import Entities.Client;
import Utils.DomaineSociete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Creer extends JFrame implements ActionListener {
    //No static field
    private JLabel jId = new JLabel("Id");
    private JLabel jRaisonSociale = new JLabel("Raison Sociale");
    private JLabel jDomaineSociete = new JLabel("Domaine Société");
    private JLabel jaddress = new JLabel("Adresse");
    private JLabel jNomDeRue = new JLabel("Nom de rue");
    private JLabel jNbRue = new JLabel("Numéro de rue");
    private JLabel jVille = new JLabel("Ville");
    private JLabel jCodePostal = new JLabel("Code Postal");
    private JLabel jMail = new JLabel("e-mail");
    private JLabel jTel = new JLabel("Téléphone");
    private JLabel jCom = new JLabel("Commentaire");
    private JLabel jCA = new JLabel("Chiffre d'affaire");
    private JLabel jNbEmploye = new JLabel("Nombre d'employé");
    private JLabel jDateProspect = new JLabel("Date de prospection");
    private JLabel jProspect = new JLabel("Prospect Interessé");
    private JTextField jtId = new JTextField();
    private JTextField jtRaisonSociale = new JTextField();
    private JTextField jtDomaineSociete = new JTextField();
    private JTextField jtaddress = new JTextField();
    private JTextField jtNomDeRue = new JTextField();
    private JTextField jtNbRue = new JTextField();
    private JTextField jtVille = new JTextField();
    private JTextField jtCodePostal = new JTextField();
    private JTextField jtMail = new JTextField();
    private JTextField jtTel = new JTextField();
    private JTextField jtCom = new JTextField();
    private JTextField jtCA = new JTextField();
    private JTextField jtNbEmploye = new JTextField();
    private JTextField jtDateProspect = new JTextField();
    private JTextField jtProspect = new JTextField();
    private JButton ok = new JButton("OK");
    private JButton annuler = new JButton("Annuler");
    private JScrollPane scroll = new JScrollPane();
    private JComboBox PriPu = new JComboBox();
    private String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    //Constructor
    public Creer() {
        this.setTitle("Repertoire");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.initConstrolsCreer();
        this.setVisible(true);
    }

    public void initConstrolsCreer() {
        JPanel jpCreer = (JPanel) this.getContentPane();
        jpCreer.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        jpCreer.setLayout(null);
        ok.addActionListener(this);
        annuler.addActionListener(this);


        jId.setBounds(10,0,90,25);
        jpCreer.add(jId);
        jtId.setBounds(125,0,150,25);
        jpCreer.add(jtId);

        jRaisonSociale.setBounds(10,26,90,25);
        jpCreer.add(jRaisonSociale);
        jtRaisonSociale.setBounds(125,26,150,25);
        jpCreer.add(jtRaisonSociale);

        jDomaineSociete.setBounds(10,52,115,25);
        jpCreer.add(jDomaineSociete);
        jtDomaineSociete.setBounds(125,52,150,25);
        jpCreer.add(jtDomaineSociete);

        jaddress.setBounds(10,78,90,25);
        jpCreer.add(jaddress);
        jtaddress.setBounds(125,78,150,25);
        jpCreer.add(jtaddress);

        jNomDeRue.setBounds(10,104,90,25);
        jpCreer.add(jNomDeRue);
        jtNomDeRue.setBounds(125,104,150,25);
        jpCreer.add(jtNomDeRue);

        jNbRue.setBounds(10,130,90,25);
        jpCreer.add(jNbRue);
        jtNbRue.setBounds(125,130,150,25);
        jpCreer.add(jtNbRue);

        jVille.setBounds(10,156,90,25);
        jpCreer.add(jVille);
        jtVille.setBounds(125,156,150,25);
        jpCreer.add(jtVille);

        jCodePostal.setBounds(10,182,90,25);
        jpCreer.add(jCodePostal);
        jtCodePostal.setBounds(125,182,150,25);
        jpCreer.add(jtCodePostal);

        jMail.setBounds(10,208,90,25);
        jpCreer.add(jMail);
        jtMail.setBounds(125,208,150,25);
        jpCreer.add(jtMail);

        jTel.setBounds(10,234,115,25);
        jpCreer.add(jTel);
        jtTel.setBounds(125,234,150,25);
        jpCreer.add(jtTel);

        jCom.setBounds(10,260,115,25);
        jpCreer.add(jCom);
        jtCom.setBounds(125,260,150,25);
        jpCreer.add(jtCom);

        jCA.setBounds(10,286,115,25);
        jpCreer.add(jCA);
        jtCA.setBounds(125,286,150,25);
        jpCreer.add(jtCA);

        jNbEmploye.setBounds(10,312,115,25);
        jpCreer.add(jNbEmploye);
        jtNbEmploye.setBounds(125,312,150,25);
        jpCreer.add(jtNbEmploye);

        jDateProspect.setBounds(10,338,115,25);
        jpCreer.add(jDateProspect);
        jtDateProspect.setBounds(125,338,150,25);
        jpCreer.add(jtDateProspect);

        jProspect.setBounds(10,364,115,25);
        jpCreer.add(jProspect);
        jtProspect.setBounds(125,364,150,25);
        jpCreer.add(jtProspect);

        ok.setBounds(395,420,80,25);
        jpCreer.add(ok);
        annuler.setBounds(485,420,80,25);
        jpCreer.add(annuler);


    }
    public void SaveCreer(){
        Client.listeClient.add(new Client(this.jtRaisonSociale.getText(),
                                this.jtDomaineSociete.getText(),
                                this.jtaddress.getText(),
                                this.jtNomDeRue.getText(),
                                this.jtVille.getText(),
                                this.jtMail.getText(),
                                this.jtCom.getText(),
                                Integer.parseInt(this.jtNbRue.getText()),
                                Integer.parseInt(this.jtCodePostal.getText()),
                                Integer.parseInt(this.jtTel.getText()),
                                Integer.parseInt(this.jtCA.getText()),
                                Integer.parseInt(this.jtNbEmploye.getText())));

    }

    public void ModifCreer(){
        this.jtRaisonSociale.setText(((Client)Client.listeClient).getRaisonSociale());
        this.jtDomaineSociete.setText(((Client)Client.listeClient).getDomaineSociete());
        this.jtaddress.setText(((Client)Client.listeClient).getAdresse());
        this.jtNomDeRue.setText(((Client)Client.listeClient).getNomDeRue());
        this.jtVille.setText(((Client)Client.listeClient).getVille());
        this.jtMail.setText(((Client)Client.listeClient).getEmail());
        this.jtCom.setText(((Client)Client.listeClient).getCommentaires());

        this.jtId.setText(String.valueOf(((Client)Client.listeClient).getId()));
        this.jtNbRue.setText(String.valueOf(((Client)Client.listeClient).getNbRue()));
        this.jtCodePostal.setText(String.valueOf(((Client)Client.listeClient).getCodePostal()));
        this.jtTel.setText(String.valueOf(((Client) Client.listeClient).getTelephone()));
        this.jtCA.setText(String.valueOf(((Client)Client.listeClient).getChiffreAffaire()));
        this.jtNbEmploye.setText(String.valueOf(((Client)Client.listeClient).getNbEmploye()));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==ok){
            SaveCreer();

        }
        if(e.getSource()==annuler){

            Application application = new Application();
            this.dispose();
        }


    }
}
