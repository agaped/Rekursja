package Hanoi.ObjectiveApproach;

import java.util.Scanner;

public class DiscNumberValidator {

    private Scanner scanner = new Scanner(System.in);

    public int validate(){
        System.out.print("Enter number of discs between 1-9: ");
        String input=scanner.nextLine();

        while(!input.matches("[1-9]")){
            System.out.println("Wrong input. Try again.");
            input=scanner.nextLine();
        }
        System.out.println();

        return Integer.valueOf(input);
    }
}
