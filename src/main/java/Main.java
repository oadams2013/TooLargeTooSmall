/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random num = new Random();


        System.out.println("Welome to Guess The Number!");
        System.out.println("Guess a Number Below!");

       int n= num.nextInt(20)+1;
       int g = 0;
       int tries = 0;


        while (n != g) {

            g= scan.nextInt();
        // if they don't guess right they have to guess again
            // ex. if they guess 12 but n= 20 then its too small
            // if they guess 16 but n= 15 then its too big
            // if they guess 13 and n=13 then its just right
        if (n < g) {
            System.out.println("Too big");
        }
        if (n > g) {
            System.out.println("Too small");

        if (n == g) {
            System.out.println("Correct Guess!!");
        }
         tries = tries + 1;
            System.out.println(tries + " tries " );

        }





    }

}

