package Recursion;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(fibo(n));

    }

    public static int fibo(int n) {
        if(n == 1)
            return 1;
        else if(n == 0)
            return 0;
        else
            return (fibo(n-1) + fibo(n-2));
    }
}
