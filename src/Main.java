import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int guess;
        int randomNum;
        boolean done = false;

        //computer generates number 1-10, asks user to guess number
        randomNum = (int) (Math.random() * 10) + 1;
        do {
            System.out.println("Guess a number from 1-10: ");
            if (scan.hasNextInt()) {
                guess = scan.nextInt();
                if (guess == randomNum) {
                    System.out.println("Your guess was " + guess);
                    System.out.println("NICE JOB THAT WAS THE NUMBER!!!!");
                    done = true;
                } else if (guess > randomNum && guess <= 10) {
                    System.out.println("Your guess was " + guess);
                    System.out.println("\n Your guess was too high.");
                } else if (guess < randomNum && guess >= 1) {
                    System.out.println("Your guess was " + guess);
                    System.out.println("\n Your guess was too low.");
                } else {
                    System.out.println("Invalid Response");
                }
            } else {
                System.out.println("Not a number pal");
                scan.nextLine();
            }
        } while (!done);
    }
}

