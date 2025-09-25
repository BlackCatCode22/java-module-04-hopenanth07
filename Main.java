//fileIOPractice.java
// hN 9/25/2025

import java.io.File; // import File Class
import java.io.FileNotFoundException;
import java.io.IOException; // import IOException to handle errors
import java.util.Scanner; // import the Scanner class to read text files
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my File IO App!\n");

        // Create a file named "something.txt"
        try {
            File myObj = new File("something.txt"); // Create File object
            if (myObj.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details
        }

        // Open and read arrivingAnimals.txt
        File myObj = new File("arrivingAnimals.txt");

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // AJ wanted a Buffered File Reader

        System.out.println("\n This is from a buffered reader.");
        try (BufferedReader br = new BufferedReader(new FileReader("arrivingAnimals.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                // Parse the string named line into 6 array elements
                String [] mySixParts = line.split(", ");
                // output the 6 parts
                System.out.println("\n mySixParts[0] is: " + mySixParts[0]);
                System.out.println("\n mySixParts[1] is: " + mySixParts[1]);
                System.out.println("\n mySixParts[2] is: " + mySixParts[2]);
                System.out.println("\n mySixParts[3] is: " + mySixParts[3]);
                System.out.println("\n mySixParts[4] is: " + mySixParts[4]);
                System.out.println("\n mySixParts[5] is: " + mySixParts[5]);

                // parse each parts of mySixParts
                String [] ageAndsexAndspecies = mySixParts[0].split();
                // output the parts of the 6 parts
                // What is the size of our array?
               int numofElements = ageAndsexAndspecies.length();

               System.out.println("\n numofElements is: " + numofElements);

            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

    }

}
