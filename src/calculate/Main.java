package calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaring a scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter first number: "); // input wizard
            int a = scanner.nextInt();
            System.out.println("Please enter second number: "); // input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter one of the symbol +,-,*,/: "); // input wizard
            char symbol = scanner.next().charAt(0);
            Calculator calculate = new Calculator();
            calculate.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation, please enter 'Y' or 'N': ");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //Closing the scanner object
        scanner.close();
    }
}
