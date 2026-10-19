// Assignment 1: Concatenate Value of Variables | ORIAS BSCS2A

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine().toLowerCase();
        System.out.print("Enter the name of an outdoor game: ");
        String outdoorGame = input.nextLine().toLowerCase();
        System.out.print("Enter another adjective: ");
        String anotherAdjective = input.nextLine().toLowerCase();
        System.out.print("Enter the name of a friend: ");
        String friend = input.nextLine();
        System.out.print("Enter a verb ending in ing: ");
        String verb = input.nextLine().toLowerCase();
        System.out.print("Enter one more adjective: ");
        String oneMoreAdjective = input.nextLine().toLowerCase();

        input.close();
        
        System.out.println("It was a " + adjective + " summer day at the beach. "
            + "My friends and I were in the water playing " + outdoorGame + ". "
            + "As a " + anotherAdjective + " wave came closer, my friend " + friend + " yelled, \"Look! There's a jellyfish " + verb + "!\" "
            + "As we got closer, we saw that the jellyfish was indeed " + verb + "! "
            + friend + " ran out of the water and onto the sand. "
            + friend + " was afraid of " + verb + " jellyfish. "
            + "The rest of us stayed in the water playing " + outdoorGame + " because " + verb + " jellyfish are " + oneMoreAdjective + ".");
        
    }
}