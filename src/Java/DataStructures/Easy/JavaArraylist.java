package Java.DataStructures.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
 */

public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> listOfList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int d = scan.nextInt(); // first element of each line, which determines how many numbers in the line.
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                list.add(scan.nextInt()); // after first element tells us how many list, list adds elements for each line.
            }
            listOfList.add(list); // takes the list and add to the list of list.
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            try {
                System.out.println(listOfList.get(x-1).get(y-1));
            }
            catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
