public class FA2024_AccessingStaticMethods_Nguyen {
    // Calculates the factorial of a number via recursion
    public static double FactorialOfAnInteger(double n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * FactorialOfAnInteger(n - 1);
    }
    // Calculates a raised to the power of n using recursion
    public static double APowerN(double a, double n){
        if (n == 0) {
            return 1;
        }
        return a * APowerN(a, n - 1);
    }
    // Calculates the sum of 1 to n using recursion
    public static double SumN(double n){
        if (n == 1) {
            return 1;
        }
        return n + SumN(n - 1);
    }
    // Calculates the sum of m to n using recursion
    public static double SumMN(double m, double n){
        if (m == n) {
            return m;
        }
        return m + SumMN(m + 1, n);
    }
    // Calculates the nth Fibonacci number using recursion
    public static double Fibonacci(double n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    // Calculates the greatest common divisor of m and n
    public static double GreatestCommonDivisor(double m, double n){
        if (n == 0) {
            return m;
        }
        return GreatestCommonDivisor(n, m % n);
    }
}