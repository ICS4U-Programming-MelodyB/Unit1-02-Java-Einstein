import java.util.Scanner;

/**
* This program receives the mass from the user.
* And calculates how much energy a specific mass
* would produce.
*
* @author Melody  Berhane
* @version 1.0
*
* @since   2023-02-20
*/

public final class Einstein {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // declare constant
        final double speedOfLight = 2.998 * (Math.pow(10, 8));

        // Create a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.println("Enter the mass of the object (kg): ");
        final String massStr = scanner.nextLine();

        // Detects string input.
        try {
            // Convert string to double
            final double massDouble = Double.parseDouble(massStr);

            if (massDouble >= 0) {
                // Calculate the amount of energy with given mass.
                final double energy = massDouble * (Math.pow(speedOfLight, 2));

                // display results to user
                System.out.print("The mass of " + massDouble + " (kg)");
                System.out.print(" would produce ");
                System.out.format("%.3e", energy);
                System.out.println(" J amount of energy.");

            } else {
                // Executes when a negative number as input
                System.out.println("Please enter a positive input.");
            }
        } catch (NumberFormatException error) {
            // Displays error to user.
            System.out.print("Please enter valid input."
                + error.getMessage());
        }
        // Closes scanner
        scanner.close();
    }
}
