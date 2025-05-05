import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
            System.out.println("The number is " + result + ".");
        }
    }
}


