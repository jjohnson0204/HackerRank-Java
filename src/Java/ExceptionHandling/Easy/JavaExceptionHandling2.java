package Java.ExceptionHandling.Easy;

import java.util.Scanner;
class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     * In the first two cases, both n and p are positive. So, the power function returns the answer correctly.
     * In the third case, both n and p are zero. So, the exception, "n and p should not be zero.", is printed.
     * In the last two cases, at least one out of n and p is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.
     */
    long power(int n, int p) throws Exception{
        if (n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        else if (n == 0 && p == 0)
                throw new Exception("n and p should not be zero.");
        else return (long) Math.pow(n,p);
    }

}

public class JavaExceptionHandling2 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
