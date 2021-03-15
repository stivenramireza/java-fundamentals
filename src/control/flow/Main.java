package control.flow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
           System.out.println("Enjoy the good luck a friend brings you");
        } else {
           System.out.println("Your shoe selection will make you very happy today");
        }

        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");

        // Challenge
        String question = "Who was Michael Jackson? A. A doctor, B. A singer, C. An engineer";
        String choiceOne = "A";
        String choiceTwo = "B";
        String choiceThree = "C";

        String correctAnswer = choiceTwo;
        boolean isCorrectAnswer = false;

        Scanner inputAnswer = new Scanner(System.in);

        while(!isCorrectAnswer) {
            System.out.println(question);
            String userInput = inputAnswer.next();
            if (userInput.equals(correctAnswer.toLowerCase())) {
                isCorrectAnswer = true;
            } else {
                System.out.println("You're wrong. Try again!");
            }
        }
        System.out.println("Congrats! That's the correct answer");

        System.out.println("Let's calculate the area of a triangle");

        Scanner inputTriangle = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = inputTriangle.nextDouble();

        while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = inputTriangle.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches)");
        double height = inputTriangle.nextDouble();

        while (height <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches)");
            height = inputTriangle.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area);
    }

}
