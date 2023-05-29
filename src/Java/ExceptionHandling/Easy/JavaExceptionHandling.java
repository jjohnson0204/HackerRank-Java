package Java.ExceptionHandling.Easy;

import java.util.*;

/*
Java has built-in mechanism to handle exceptions.
Using the try statement we can test a block of code for errors.
The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers x and y as input, you have to compute x/y.
If x and y are not 32 bit signed integers or if y is zero, exception will occur, and you have to report it.
Read sample Input/Output to know what to report in case of exceptions.
 */
public class JavaExceptionHandling {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
            scan.close();
        }
        catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
