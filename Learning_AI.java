    import java.util.*;
    import java.awt.*;
    import javax.swing.*;

    public class Learning_AI {

    public static int Power_Favor = 0;

        public static void main(String[]args){

            int userResponce = askUser(0);
            int Random = CPU_Choice();
            Result(userResponce,Random);


    } //End of String[]

        public static int askUser(int UserRPS){
        Object RPS[] = {"Rock","Paper","Scissors"};
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

            return Winner;
        } //End of Result Method


        } //End of class
