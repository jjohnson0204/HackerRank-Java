package Java.DataStructures.Medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            hashSet.add(num);

            if(deque.size() == m){
                if(hashSet.size() > max) max = hashSet.size();
                int first = deque.remove();
                if(!deque.contains(first)) hashSet.remove(first);
            }

        }
        System.out.println(max);
    }
}
