    import java.util.*;
    import java.awt.*;
    import javax.swing.*;

    public class Learning_AI {

    public static int Power_Favor = 0;
    public static int Score=0;
        public static void main(String[]args){
            int userResponce;
            int Random;
            int PvP;
            String W="ERROR if you are seeing this message then This code does not work!!!";
            Boolean is_Fun=true;

            while (is_Fun) {
                userResponce = askUser(0);
                if (userResponce==3 || userResponce==-1) {is_Fun=false;}

                if (is_Fun==true) {
                    Random = CPU_Choice();
                    PvP = Result(userResponce, Random);
                    switch (PvP) {
                        case 0:
                            W = "The outcome was a Draw.";
                            break;
                        case 1:
                            W = "congratulations you Win!!!";
                            Score++;
                            break;
                        case -1:
                            W = "You Lose\nBetter Luck Next Time:(";
                            Score = Score - 1;
                            break;
                    }
                    JOptionPane.showMessageDialog(null, W + "\nYour current Score is " + Score + ".");
                } else {JOptionPane.showMessageDialog(null,"OK bye then :)\n\nYour Final Score is: " +Score);}

            }


    } //End of String[]

        public static int askUser(int UserRPS){
        Object RPS[] = {"Rock","Paper","Scissors","Quit Game"};
        UserRPS = JOptionPane.showOptionDialog(null,
                "Pick one",
                "Interactions Pane",
            JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                RPS,
                RPS[0]);

            return UserRPS;
        } //End of the askUser Method

        public static int CPU_Choice(){
            int RNG=0;
        switch(Power_Favor){

            case 0 :  RNG = (int)(Math.random() * 3); break;
            case 1 :  RNG = (int)(Math.random() * 6);
            switch (RNG){case 0:RNG=0;break; case 1:RNG=0;break; case 2:RNG=0;break;
                case 3:RNG=1;break; case 4:RNG=1;break; case 5:RNG=2;break;} break;
            case 2 : RNG = (int)(Math.random() * 9);
                switch (RNG){case 0:RNG=0;break; case 1:RNG=0;break; case 2:RNG=0;break;
                    case 3:RNG=0;break; case 4:RNG=0;break; case 5:RNG=1;break;
                    case 6:RNG=1;break; case 7:RNG=1;break; case 8:RNG=2;break;}break;
            case -1 :  RNG = (int)(Math.random() * 6);
                switch (RNG){case 0:RNG=0;break; case 1:RNG=1;break; case 2:RNG=1;break;
                    case 3:RNG=2;break; case 4:RNG=2;break; case 5:RNG=2;break;} break;
            case -2 : RNG = (int)(Math.random() * 9);
                switch (RNG){case 0:RNG=0;break; case 1:RNG=1;break; case 2:RNG=1;break;
                    case 3:RNG=1;break; case 4:RNG=2;break; case 5:RNG=2;break;
                    case 6:RNG=2;break; case 7:RNG=2;break; case 8:RNG=2;break;}break;
        }
        return RNG;
        } //End of the CPU Choice Method

        public static int Result(int Player,int Robot) {


            int Winner = 0;
            if (Player == 0) {
                switch (Robot) {
                    case 0:
                        Winner = 0;
                        break;
                    case 1:
                        Winner = -1;
                        break;
                    case 2:
                        Winner = 1;
                        break;
                }
            }
            if (Player == 1) {
                switch (Robot) {
                    case 0:
                        Winner = 1;
                        break;
                    case 1:
                        Winner = 0;
                        break;
                    case 2:
                        Winner = -1;
                        break;
                }
            }
            if (Player == 2) {
                switch (Robot) {
                    case 0:
                        Winner = -1;
                        break;
                    case 1:
                        Winner = 1;
                        break;
                    case 2:
                        Winner = 0;
                        break;
                }
            }


            switch (Player) {
                case 1 : Power_Favor=Power_Favor-1;
                case 2 : Power_Favor=Power_Favor+1;
            }
            if (Power_Favor<-2) {Power_Favor=-2;}
            if (Power_Favor>2) {Power_Favor=2;}

            return Winner;
        } //End of Result Method








        } //End of class
