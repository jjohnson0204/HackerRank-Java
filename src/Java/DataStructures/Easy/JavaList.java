package Java.DataStructures.Easy;

/*
Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0
 */

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // 5
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numberOfElements = scan.nextInt();
            arrayList.add(numberOfElements); // 12 0 1 78 12
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String queries = scan.next();
            int x = scan.nextInt(); // 5
// 0
            if (queries.equals("Insert")) {
                int y = scan.nextInt(); // 23
                arrayList.add(x,y); //12 0 1 78 12 23
            }
            else {
                arrayList.remove(x); // 0 1 78 12 23
            }
        }
        for (Integer integer : arrayList) {
            System.out.print(integer + " "); // 0 1 78 12 23
        }
    }
}
