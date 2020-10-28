package BruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewBlackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n = input.nextInt();
        int m = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        Collections.sort(list);

        int sum = 0;

        for (int i = n - 1; i >= 2; i--)
            for (int j = i - 1; j >= 1; j--)
                for (int k = j - 1; k >= 0; k--) {
                    if (list.get(i) + list.get(j) + list.get(k) <= m)
                        sum = Math.max(sum, list.get(i) + list.get(j) + list.get(k));

                }
        System.out.println(sum);
    }
}
