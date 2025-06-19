import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Programming {

   static String name = "", weapon = "Knife", closed = "Pressing X will default to the first option.";
   static int confirm = 0, Gold = 10, HP = 10, shopKeppersDesision=0;


    public static void main(String[] args) {

        Object[] options = {"Go to the town shop", "Go to the town Tavern"};




        boolean nameloop = true;
        while (nameloop) {
            name = JOptionPane.showInputDialog("What is your name?");
            confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Ok l'ets begin your adventure.",
                    "Interactions Pane",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                nameloop = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Hello " + name + ",\nL'ets begin your Adventure!");

        JOptionPane.showMessageDialog(null,
                "Your Gold = " + Gold + ",\nYour HP = " + HP + ",\nYour Weapon = " + weapon + ".");



        int a = JOptionPane.showOptionDialog(
                null,
                "You walk into a Town.",
                closed,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                options,
                options[0]);

        switch (a) {

            case 1:
                Tavern();
                break;

            default: Shop();
            break;



        }



    }//End of the (String[]args) method

    public static void Shop(){
        Object[] shopKeppers_wares = {"Longsword", "No Thanks"};

        shopKeppersDesision = JOptionPane.showOptionDialog(
            null,
            "HP="+HP+", Gold="+Gold+", weapon="+weapon+".\nShopKeepper: What would you like to buy?\nLongsword = 8 Gold",
            closed,
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            shopKeppers_wares,
            shopKeppers_wares[0]);

        switch (shopKeppersDesision){

            case 1:
                JOptionPane.showMessageDialog(null,"You are going to the tavern...");
                Tavern();
                break;

            default:
                shopmoney();
                break;


        } //End of the switch (shopKeppersDesision)


    } //End of the Shop Method

        public static void shopmoney(){
        if (Gold<8) {
            JOptionPane.showMessageDialog(null,"ShopKeepper: It looks like you d'ont have enough money");
            JOptionPane.showMessageDialog(null,"You decide to go to the tavern next.");
        } else {
            Gold = Gold-8;
            weapon="Longsword";
            JOptionPane.showMessageDialog(null,"+longsword.");
            JOptionPane.showMessageDialog(null,"You decide to head to the tavern next.");
        }
        Tavern();

        } //End of the shopmoney Method



    public static void Tavern(){

   JOptionPane.showMessageDialog(null,"You are in a tavern now...");

    } // End of the Tavern Method




} // End
