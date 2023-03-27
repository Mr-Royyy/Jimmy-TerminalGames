import java.util.Scanner;

/**
 * @author Jimmy Roy
 * @version January 27, 2023
 * Array generated with random values, you can change those values
 * Goal is to make whole array with same numbers, if they same you win!
 */

public class ChangeArrayValuesGame {
    /**
     * The printArray() method loops through the elements of the gameArray and prints each element with a space in between
     */
    public static void printArray() {
        for (int i = 0; i < gameArray.length; i++) {
            System.out.print(gameArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * The checkWin() method checks if all the elements of the gameArray are the same by comparing the first element to the rest of the elements.
     * @return true if all are the same, otherwise returns false.
     */
    public static boolean checkWin() {
        // Check if all values in the array are the same
        int value = gameArray[0];
        for (int i = 1; i < gameArray.length; i++) {
            if (gameArray[i] != value) {
                return false;
            }
        }
        return true;
    }
    static int[] gameArray = new int[5]; //intializes array
    /**
     * Main code for game
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize gameArray with random values
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = (int)(Math.random() * 100); // initializing the gameArray with random values between 0 and 100
        }

        // Main game loop
        while (true) {
            // Print gameArray
            printArray();

            // Get player input
            System.out.print("Enter an index to change (0-4): ");
            int index = scanner.nextInt();
            System.out.print("Enter a new value for that index: ");
            int value = scanner.nextInt();

            // Update array at that index
            gameArray[index] = value;

            // Check for win
            if (checkWin()) {
                System.out.println("You job, you win!");
                break;
            }
        }
    }
}
