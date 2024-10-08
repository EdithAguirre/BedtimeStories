package com.pluralsight;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        // Try-catch block to catch exceptions
        try {
            // Prompt the user for the name of the story/file to read
            System.out.print("Select a story to read: \n" +
                    "(1) Goldilocks \n" +
                    "(2) Hansel and Gretel \n" +
                    "(3) Mary Had a Little Lamb \n" +
                    "Select an option (1,2, or 3): ");

            // Create scanner to receive user's option
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            System.out.println();

            // A switch to select a story
            String storyPath = "";
            switch (option){
                case 1:
                    storyPath = "src/main/resources/goldilocks.txt";
                    break;
                case 2:
                    storyPath = "src/main/resources/hansel_and_gretel.txt";
                    break;
                case 3:
                    storyPath = "src/main/resources/mary_had_a_little_lamb.txt";
                    break;
                default:
                    System.out.println("Invalid choice. Select one of the available options(1,2, or 3).");
            }

            // Create a FileInputStream and Scanner to read the files
            FileInputStream fis = new FileInputStream(storyPath);
            Scanner sc = new Scanner(fis);

            // To write line numbers
            int counter = 1;
            // Read while there is still text in the file to read
            String input;
            while(sc.hasNextLine()){

                input = sc.nextLine();
                System.out.println(counter + "." + input);
                counter++;
            }

            // Close the scanners
            sc.close();
            scanner.close();
            }
        catch(IOException e){
            //Print the exception and stack trace if there is an exception
            e.printStackTrace();
            }
    }
}
