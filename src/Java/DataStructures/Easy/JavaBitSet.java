package Java.DataStructures.Easy;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        BitSet[] bitSets = new BitSet[3];
        bitSets[1] = b1;
        bitSets[2] = b2;

        for (int i = 0; i < m; i++) {
            String operation = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();

            switch (operation) {
                case "AND":
                    bitSets[x].and(bitSets[y]);
                    break;
                case "OR":
                    bitSets[x].or(bitSets[y]);
                    break;
                case "XOR":
                    bitSets[x].xor(bitSets[y]);
                    break;
                case "FLIP":
                    bitSets[x].flip(y);
                    break;
                case "SET":
                    bitSets[x].set(y);
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
