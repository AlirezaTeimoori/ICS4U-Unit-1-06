import java.util.Random;
import java.util.Scanner;

//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 1-06         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------

public class RollDie{ // Intro class RollDie

    public static Random randomNumber = new Random(); // Bring in an instance of Random

    public static int rollDie(int userMin, int userMax) { // Intro rollDie function. Eats an int, processes it, gives another int. :)
        int output = -1; // the initial value of output in case the app didn't go under the if statement

        if (userMax > userMin){ // Makes sure there are no negative numbers
            
            output = RollDie.randomNumber.nextInt(userMax - userMin) + userMin; // generate the random between the two extremes and store it in "output"
            return output + 1; // sends out (output + 1) to make sure there are no 0s

        } else { // a type of error message:
            System.out.println("Please be rational :| (Max > Min)");
        }

        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Intro Scanner instance ==> scanner

        // Asking for and storing data:
        System.out.println("Enter the min value: ***(if you don't have a min value please type 0)"); // lets the user choose a min value if they want
        int uMin = scanner.nextInt();
        System.out.println("Enter the max value:");
        int uMax = scanner.nextInt();

        // Process and output:
        System.out.println(rollDie(uMin, uMax));

        scanner.close(); // The IDE won't leave you alone if you don't close this :\
    }
}