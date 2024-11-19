package ru.joxaren.impotant.scannerex;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Input integer number: ");
        int number = scanner.nextInt();
        System.out.println("Your number is: " + number);
        */

        System.out.println("Input your phrase: ");
        String s = scanner.nextLine();
        System.out.println("You input: " + s);

        Scanner scanner2 = new Scanner("Hello!\nHow are you?\nOk!");
        while (scanner2.hasNextLine()){
            System.out.println(scanner2.nextLine());
        }

        scanner.close();
        scanner2.close();

    }
}
