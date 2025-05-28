//Guess the random number game
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class GuessTheNumber {
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int RandomNumber = r.nextInt(11);
        System.out.println("Guess the number between 0 ~ 10");
        while (true) {

            int b= sc.nextInt();
            if(b==RandomNumber){
                System.out.println("YOU WIN");
                break;
            } else if (b>RandomNumber) {
                System.out.println("The number you entered is greater the the actual number\n Try again");
            }else {
                System.out.println("The number you entered is smaller the the actual number\n Try again");
            }
        }
    }
}