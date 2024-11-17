import java.util.Scanner;

public class FA2024_RecursionStaticMethod_Nguyen {
    public static void main(String[] args) {
        // Control variable for the menu loop
        boolean repeat = true;

        while (repeat) {
            Scanner scanner = new Scanner(System.in);

            // Display menu options for different recursive calculations
            System.out.println("RECURSION PROBLEMS MENU - DUSTIN NGUYEN");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Type a number from 1 to 6 to select the task or 0 to exit");
            System.out.println("1. 1n! (Factorial of an integer n)");
            System.out.println("2. a^n (a power n)");
            System.out.println("3. Sum(n) = 1 + 2 + 3 + .. + n");
            System.out.println("4. Sum(m, n) = m + (m+1), (m+2) + .. + n");
            System.out.println("5. Fibonacci sequence Fn");
            System.out.println("6. GCD (The greatest common divisor of m and n)");
            System.out.println("0. Exit");

            // Handle user's menu selection
            switch (scanner.nextInt()) {
                case 1:
                    // Calculate factorial of n
                    System.out.println("Enter integer n: ");
                    int n = scanner.nextInt();
                    double result = FA2024_AccessingStaticMethods_Nguyen.FactorialOfAnInteger(n);
                    System.out.println("TASK 1 - DUSTIN NGUYEN");
                    System.out.println("------------------------------------");
                    System.out.println("Factorial of " + n + " is " + result);
                    break;

                case 2:
                    // Calculate a raised to power n
                    System.out.println("Enter a: ");
                    int a1 = scanner.nextInt();
                    System.out.println("Enter n: ");
                    int n1 = scanner.nextInt();
                    double result1 = FA2024_AccessingStaticMethods_Nguyen.APowerN(a1, n1);
                    System.out.println("TASK 2 - DUSTIN NGUYEN");
                    System.out.println("------------------------------------");
                    System.out.println(a1 + "to power " + n1 + " is " + result1);
                    break;

                case 3:
                    // Calculate sum from 1 to n
                    System.out.println("Enter n: ");
                    int n2 = scanner.nextInt();
                    double result2 = FA2024_AccessingStaticMethods_Nguyen.SumN(n2);
                    System.out.println("TASK 3 - DUSTIN NGUYEN");
                    System.out.println("------------------------------------");
                    System.out.println("Sum of 1 to " + n2 + " is " + result2);
                    break;

                case 4:
                    // Calculate sum from m to n
                    System.out.println("Enter n: ");
                    int n3 = scanner.nextInt();
                    System.out.println("Enter m: ");
                    int m3 = scanner.nextInt();
                    double result3 = FA2024_AccessingStaticMethods_Nguyen.SumMN(n3, m3);
                    System.out.println("TASK 4 - DUSTIN NGUYEN");
                    System.out.println("------------------------------------");
                    System.out.println("Sum of " + n3 + "to " + m3 + " is " + result3);
                    break;

                case 5:
                    // Calculate nth Fibonacci number
                    System.out.println("Enter n: ");
                    int n4 = scanner.nextInt();
                    double result4 = FA2024_AccessingStaticMethods_Nguyen.Fibonacci(n4);
                    System.out.println("TASK 5 - DUSTIN NGUYEN");
                    System.out.println("------------------------------------");
                    System.out.println("Fibonacci at " + n4 + " is " + result4);
                    break;

                case 6:
                    // Calculate GCD of two numbers
                    System.out.println("Enter m: ");
                    int m5 = scanner.nextInt();
                    System.out.println("Enter n: ");
                    int n5 = scanner.nextInt();
                    double result5 = FA2024_AccessingStaticMethods_Nguyen.GreatestCommonDivisor(m5, n5);
                    System.out.println("TASK 6 - DUSTIN NGUYEN");
                    System.out.println("------------------------------------");
                    System.out.println("Greatest Common Divisor (GCD) of " + m5 + " and " + n5 + " is " + result5);
                    break;

                case 0:
                    // Exit the program
                    repeat = false;
                    break;

                default:
                    break;
            }
        }
    }
}