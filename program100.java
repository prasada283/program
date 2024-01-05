import java.util.Scanner;
 class AlphabetCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        
        // Read the character from user input
        char inputChar = scanner.next().charAt(0);

        // Check if the character is an alphabet
        if (isAlphabet(inputChar)) {
            System.out.println(inputChar + " is an alphabet.");
        } else {
            System.out.println(inputChar + " is not an alphabet.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to check whether a character is an alphabet
    private static boolean isAlphabet(char ch) {
        // Check if the character is a lowercase or uppercase alphabet
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}