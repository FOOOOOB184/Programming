import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Programming {
    public static void main(String[] args) {

        Object[]options = {"Blue","Green"};

        JOptionPane.showOptionDialog(
                null,
                "What is your favrite color?",
                "Interactions pane",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                options,
                options[0]);
    }
} // End
