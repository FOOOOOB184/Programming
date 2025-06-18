import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Programming {
    public static void main(String[] args) {


       String name = JOptionPane.showInputDialog("Enter Your Name");
       JOptionPane.showMessageDialog(null,"Hello "+name+",\nL'ets begin your Adventure!");

        Object[] options = {"Blue", "Green"};

        int a = JOptionPane.showOptionDialog(
                null,
                "What is your favorite color?",
                "Interactions pane",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                options,
                options[0]);




    }
} // End
