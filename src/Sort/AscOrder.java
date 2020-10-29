package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 백준
 * 수 정렬하기 1, 2
 * 2750, 2751번
 * 시간복잡도가 낮게 나와야한다.
 * 하지만 스캐너가 잡아먹는 시간이 많기 때문에
 * 버퍼리더를 사용한다.
 */
public class AscOrder {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        Collections.sort(list);

        for(int i = 0; i < n; i++) {
            stringBuilder.append(list.get(i)).append("\n");
        }

        System.out.println(stringBuilder);
    }
}
