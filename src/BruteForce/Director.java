package BruteForce;

import java.util.Scanner;

/**
 * 브루트포스 1436번
 * 영화감독 숀
 * 안영준
 */
public class Director {
    public static void main(String[] args) {

        final String SIXSIXSIX = "666";

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();        // 몇번째 숫자를 찾을것인가?
        int count = 0;                  // 검사하는 수가 몇번째일까?
        int in_number = 666;            // 처음 시작하는 첫 수는 666이다. 가장 작은수부터 숫자 세기 시작.

        for(;;) {
            if(String.valueOf(in_number).contains(SIXSIXSIX)) { // 숫자가 666을 포함하면
                count++;                    // 첫번째 지나가고
                if(count == n) {            // 만약 내가 찾고자하는 수만큼 돌았다면
                    System.out.println(in_number);  // 출력 후 종료
                    break;
                }
            }
            in_number++;                    // 666부터 하나씩 쭉 증가 시킨다. 666~ 1666... 1  ->  2
        }
    }
}
