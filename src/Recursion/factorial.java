package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        if(n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
