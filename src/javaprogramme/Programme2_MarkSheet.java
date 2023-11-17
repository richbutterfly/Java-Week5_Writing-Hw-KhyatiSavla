package javaprogramme;

import java.util.Scanner;

// Rewrite the student mark sheet programme using if else and while loop. (Week-7 Homework)
public class Programme2_MarkSheet {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Enter Student name \t\t:\t"); // input wizard
        String name = scanner.next();
        System.out.print("Enter Student Roll Number \t\t:\t");//input wizard
        int rollNum = scanner.nextInt();
        System.out.print("Enter marks od subject Maths \t:\t"); // input wizard
        int mathMarks = scanner.nextInt();
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks of Maths /t/t:/t");
            mathMarks = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject Science \t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 t0 100");
            System.out.println("\nPlease enter correct marks of Science /t/t:/t");
            scienceMarks = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject English \t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 t0 100");
            System.out.println("\nPlease enter correct marks of English /t/t:/t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();
    }

    // Calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else
            return "Pass";
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }
    // Printing the MarkSheet


    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("|-----------------------------------------------|");
        System.out.println("|               MARK SHEET                      |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Name        :   " + name + "                |");
        System.out.println("|   Roll No     :  " + rollNum + "              |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Subject     :                               |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Math        :   " + mathsMarks + "          |");
        System.out.println("|   Sceince     :   " + scienceMarks + "        |");
        System.out.println("|   English     :   " + englishMarks + "        |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Total       :   " + total + "               |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Percentage  :   " + percentage + "          |");
        System.out.println("|   Result      :   " + result + "              |");
        System.out.println("|   Grade       :   " + grade + "               |");
        System.out.println("|-----------------------------------------------|");

    }
}