import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleGradingSystemBSIT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grades Computation!");
        System.out.println("Made by Jaymark Vicente student from BSIT-1E");
        System.out.println("");

        int mathg = getGrade(input, "What is your Grade in Math?");
        int sci = getGrade(input, "What is your Grade in Science?");
        int engli = getGrade(input, "What is your Grade in English?");
        int mapeh = getGrade(input, "What is your Grade in Mapeh?");

        double studentgrades = mathg + sci + engli + mapeh;
        double totalavg = studentgrades / 4;

        if (totalavg >= 75) {
            System.out.println("Your total average is: " + totalavg);
            System.out.println("Congratulations! You are Passed");
        } else {
            System.out.println("Your total Average is: " + totalavg);
            System.out.println("Sorry You are Failed! better luck next time");
        }
    }

    private static int getGrade(Scanner input, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Clear the invalid input
            }
        }
    }
          }
