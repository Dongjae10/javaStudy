package baek_J;

import java.util.HashSet;
import java.util.Scanner;

public class UseHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] n = new int[10];
        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            n[i] = scanner.nextInt() % 42;
        }

        for(int i = 0; i < n.length ; i++){
            set.add(n[i]);
        }

        System.out.println(set.size());

    }
}
