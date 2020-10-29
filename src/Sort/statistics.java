package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 백준 2108
 * 통계학
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값 -> 2020/10/29
 * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 */
public class statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Integer freq[] = new Integer[8001];

        for(int i =0; i < 8001; i++)
            freq[i] = 0;

        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
            sum += list.get(i);
        }

        System.out.println(String.format("%.0f", (float)sum/n));

        Collections.sort(list);
        System.out.println(list.get(n/2));

        for(int i = 0; i < n; i++) {
            if(list.get(i) < 0){
                freq[Math.abs(list.get(i) + 4000)]++;
            }
            else freq[list.get(i)]++;
        }

        int Mfreq = 0;

        List<Integer> frelist = new ArrayList<>(Arrays.asList(freq));

        for(int i = 0; i < frelist.size(); i++) {
            Mfreq = Math.max(Mfreq, frelist.get(i));
        }

        System.out.println("최빈값의 빈도수 : " + Mfreq);

        /**
         * 수정해야함.
         */
        for(int i = 0; i < freq.length; i++) {
            if(frelist.get(i) == Mfreq) {
                if(i > 4000) { // i = 4001
                    System.out.println((i-4000));
                }
                else System.out.println(i);
            }
        }

    }
}
