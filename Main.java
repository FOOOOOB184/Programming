import java.awt.*;
import java.util.*;
import javax.swing.*;
    public class Main{
        static int Correct;

        public static void main(String[]args){

            while (true) {

                boolean Is_Fun = Declarations();
                if (Is_Fun == true) {
                    JOptionPane.showMessageDialog(null, "Correct the answer is " + Correct);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrcet the Corrcet answer is " + Correct);
                }

            } //End of while (true)




        } //End of String[]

        public static boolean Declarations(){
            int userResponceInt;
            int R1 = Find_int();
            int R2 = Find_int();
            char Simbol = Find_Char();
            boolean Correctness=true;

           String userResponceStr = JOptionPane.showInputDialog(R1+" "+Simbol+" "+R2);
           userResponceInt = Integer.parseInt(userResponceStr);

           switch (Simbol) {

               case '+': Correct = R1+R2; break;
               case '-': Correct = R1-R2; break;
               case '*': Correct = R1*R2; break;
               case '/': Correct = R1/R2; break;
               case '%': Correct = R1%R2; break;

           } //End of the switch(Simbol)

           if (userResponceInt==Correct){
               Correctness=true;
           } else {
               Correctness=false;
           }

           return Correctness;

        } //End of Declarations

        public static int Find_int(){

            int R = (int) (Math.random() * 99 + 1);
            return R;

        } //End of the Find_int method

        public static char Find_Char(){

            int R = (int) (Math.random()*5);
            char ops = '/';

            switch (R) {
                case 0: ops = '+'; break;
                case 1: ops = '-'; break;
                case 2: ops = '*'; break;
                case 3: ops = '/'; break;
                default: ops = '%'; break;
            }
            return ops;
        } //End of the Find_int method
    } // End of Class Main