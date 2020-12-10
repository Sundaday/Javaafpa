package com.sundaday.types;

import javax.swing.*;
import com.sundaday.types.CategorieUser;

public class Main {

    public static void main(String[] args) {
        User john = new User("John","Koch",CategorieUser.MODO);
        User jean = new User("Jean","Michel",CategorieUser.STAND);
        User jim = new User("Jim","Machin",CategorieUser.STAND);

        Message message1 = new Message("JAVA SE","L'encapsulation est une propriété fondamentale",john);
        JOptionPane.showMessageDialog(null,message1 + jean.toString());
    }
}
