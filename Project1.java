import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        final String COLOR_FILE = "colors.txt";  // File containing colors
        final String OUTPUT_FILE = "EspGameResults.txt";
        final int TOTAL_ATTEMPTS = 3;

        String color1 = "", color2 = "", color3 = "", color4 = "", color5 = "";
        String color6 = "", color7 = "", color8 = "", color9 = "", color10 = "";
        String color11 = "", color12 = "", color13 = "", color14 = "", color15 = "", color16 = "";

        try {
            Scanner fileScanner = new Scanner(new File(COLOR_FILE));
            if (fileScanner.hasNextLine()) color1 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color2 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color3 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color4 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color5 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color6 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color7 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color8 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color9 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color10 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color11 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color12 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color13 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color14 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color15 = fileScanner.nextLine();
            if (fileScanner.hasNextLine()) color16 = fileScanner.nextLine();
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error reading colors file.");
            return;
        }

        Scanner input = new Scanner(System.in);
        
        // Get user details
        System.out.print("Enter your full name: ");
        String userName = input.nextLine();
        
        System.out.print("Enter your date of birth (MM/DD/YY): ");
        String userDOB = input.nextLine();
        
        System.out.print("Enter a short description about yourself: ");
        String userDescription = input.nextLine();
        
        int correctGuesses = 0;
        Random random = new Random();
        
        System.out.println("\nThe game begins! Try to guess the color I am thinking of.\n");

        for (int i = 0; i < TOTAL_ATTEMPTS; i++) {
            int randomNumber = random.nextInt(16) + 1;
            String selectedColor = "";

            switch (randomNumber) {
                case 1: selectedColor = color1; break;
                case 2: selectedColor = color2; break;
                case 3: selectedColor = color3; break;
                case 4: selectedColor = color4; break;
                case 5: selectedColor = color5; break;
                case 6: selectedColor = color6; break;
                case 7: selectedColor = color7; break;
                case 8: selectedColor = color8; break;
                case 9: selectedColor = color9; break;
                case 10: selectedColor = color10; break;
                case 11: selectedColor = color11; break;
                case 12: selectedColor = color12; break;
                case 13: selectedColor = color13; break;
                case 14: selectedColor = color14; break;
                case 15: selectedColor = color15; break;
                case 16: selectedColor = color16; break;
            }

            System.out.print("Guess the color: ");
            String userGuess = input.nextLine();

            if (userGuess.equalsIgnoreCase(selectedColor)) {
                System.out.println("Correct! The color was " + selectedColor + ".\n");
                correctGuesses++;
            } else {
                System.out.println("Wrong! The color was " + selectedColor + ".\n");
            }
        }

        System.out.println("Game Over");
        System.out.println("You guessed " + correctGuesses + " out of " + TOTAL_ATTEMPTS + " colors correctly.");
        System.out.println("Date of Birth: " + userDOB);
        System.out.println("Username: " + userName);
        System.out.println("User Description: " + userDescription);

        try {
            FileWriter writer = new FileWriter(OUTPUT_FILE);
            writer.write("Game Over\n");
            writer.write("You guessed " + correctGuesses + " out of " + TOTAL_ATTEMPTS + " colors correctly.\n");
            writer.write("Date of Birth: " + userDOB + "\n");
            writer.write("Username: " + userName + "\n");
            writer.write("User Description: " + userDescription + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to results file.");
        }

        input.close();
    }
}
