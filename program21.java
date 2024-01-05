import java.util.Scanner;

class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(userInput)) {
            System.out.println(userInput + " is a prime number.");
        } else {
            System.out.println(userInput + " is not a prime number.");
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}