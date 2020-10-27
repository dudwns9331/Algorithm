package Recursion;

import java.util.Scanner;

public class hanoi {

    public static StringBuilder sb = new StringBuilder();
    public static int count;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        hanoi_move(n, 1, 3, 2);
        sb.insert(0, count + "\n");
        System.out.println(sb);
    }

    public static void hanoi_move(int n, int from, int to, int temp) {
        count++;
        if(n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }
        else {
            hanoi_move(n-1, from, temp, to);
            sb.append(from + " " + to + "\n");
            hanoi_move(n-1, temp, to, from);
        }
    }
}
