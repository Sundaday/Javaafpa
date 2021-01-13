package Swing;

import javax.swing.*;

public class Application extends JFrame {

    public static Scene scene;

    public Application(){
        this.setTitle("Reverso");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setAlwaysOnTop(true);

        scene = new Scene();
        this.setContentPane(scene);
        this.setVisible(true);

    }
}
