import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Programming {

   static String name = "", weapon = "Knife", closed = "Pressing X will default to the first option.";
   static int confirm = 0, Gold = 10, HP = 10, shopKeppersDesision=0, fightDecision=0, Fight3v1Action_Return=0, ManHP=10,
   randomPain=0, NewManHP=0, FightPower=0;


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


   JOptionPane.showMessageDialog(null,"You walk into the tavern.");
        Object[] Fight = {"Join the 2 gangsters.", "Join the 1 person.","Ignore everything"};

        fightDecision = JOptionPane.showOptionDialog(null,
                "You see two gangster robbing someone.\nWhat will you do?",
                closed,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                Fight,
                Fight[0]);

                switch (fightDecision) {


                    case 1 :
                    case 2 :
                    default: Fight3v1(); break;



                }// End of the switch (fightDecision)
    } // End of the Tavern Method


    public static void Fight3v1 (){

        Object[] Fight3v1Action = {"Attack with your " +weapon+ ".","Try to Intimidate"};

        Fight3v1Action_Return = JOptionPane.showOptionDialog(null,
                "Man: Heh you made a big mistake choosing to Fight me.\n" +
                        "Gangster1: Oh yeah and why is that?\n" +
                        "Man: You will see...",
                closed,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                Fight3v1Action,
                Fight3v1Action[0]);

        switch (Fight3v1Action_Return) {

            case 1 :
            default: Fight3v1Attack(); break;


        }




    } //End of the method Fight3v1

    public static void Fight3v1Attack(){

        JOptionPane.showMessageDialog(null,"The other two gangsters ran away.");
        if (ManHP<0){ManHP=0;}

        switch (weapon) {

            case "Knife" : FightPower=1; break;
            case "Longsword" : FightPower=3; break;
            default: FightPower=0; break;

        }



        randomPain=(int)(Math.random()*5+FightPower); //Genarates random number 1 to 5 and stores it in randomPain int.
        NewManHP = ManHP-randomPain;

        JOptionPane.showMessageDialog(null,
                "HP="+HP+".\nWeapon="+weapon+".\nManHP=" +ManHP+ "." +
                "\nYou Hit him and dealt " +randomPain+ " Damage.\nHe is now at " +NewManHP +" HP.");
        ManHP = NewManHP;


    } // End of Fight3v1Attack


} // End
