package com.codedifferently.labs.partA;
import java.util.Random;
public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(3);
        System.out.println(number);

        if (number == 0)
        {
            System.out.println("Rock");
        } else if (number == 1)
        {
            System.out.println("Paper");
        }
        else{
            System.out.println("Scissors");
        }

    }
}
