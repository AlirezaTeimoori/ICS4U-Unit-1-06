import java.util.Random;

//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 1-06         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------

public class RollDie{ // Intro class RollDie

    public static Random randomNumber = new Random(); // Bring in an instance of Random

    public static int rollDie(int userChoice) { // Intro rollDie function. Eats an int, processes it, gives another int. :)
        
        int output = RollDie.randomNumber.nextInt(userChoice); // generate the random number up to "userChoice" and store it in "output"
        return output; // sends out output
    }
    public static void main(String[] args) {
        System.out.println(rollDie(20));
    }
}