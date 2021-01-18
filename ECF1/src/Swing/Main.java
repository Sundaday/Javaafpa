package Swing;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            }
            catch(Exception e) { }
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Application();
                }
            });
        }
    }
}

