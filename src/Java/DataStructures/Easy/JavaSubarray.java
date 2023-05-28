package Java.DataStructures.Easy;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) { // 1, -2, 4, -5, 1
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + array[j]; // 1-2=-1+4=3-5=-2+1
                if (sum < 0){
                    count++; // 3
                }
            }
        }
        System.out.println(count);
    }
}
